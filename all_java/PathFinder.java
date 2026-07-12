package cn.thinkinganalyticsclone.android;

import android.view.View;
import android.view.ViewGroup;
import cn.thinkinganalyticsclone.android.utils.TDLog;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class PathFinder {
    private static final String TAG = "ThinkingAnalyticsClone.PathFinder";
    private final IntStack mIndexStack = new IntStack();

    public interface Accumulator {
        void accumulate(View v);
    }

    public static class PathElement {
        public static final int SHORTEST_PREFIX = 1;
        public static final int ZERO_LENGTH_PREFIX = 0;
        public final int index;
        public final int prefix;
        public final String viewClassName;
        public final int viewId;

        public PathElement(int usePrefix, String vClass, int ix, int vId) {
            this.prefix = usePrefix;
            this.viewClassName = vClass;
            this.index = ix;
            this.viewId = vId;
        }

        public String toString() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.prefix == 1) {
                    jSONObject.put("prefix", "shortest");
                }
                String str = this.viewClassName;
                if (str != null) {
                    jSONObject.put("view_class", str);
                }
                int i2 = this.index;
                if (i2 > -1) {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i2);
                }
                int i3 = this.viewId;
                if (i3 > -1) {
                    jSONObject.put("id", i3);
                }
                return jSONObject.toString();
            } catch (JSONException e2) {
                throw new RuntimeException("Can't serialize PathElement to String", e2);
            }
        }
    }

    public void findTargetsInRoot(View givenRootView, List<PathElement> path, Accumulator accumulator) {
        if (path.isEmpty()) {
            return;
        }
        if (this.mIndexStack.full()) {
            TDLog.i(TAG, "Path is too deep, there is no memory to perfrom the finding");
            return;
        }
        PathElement pathElement = path.get(0);
        List<PathElement> listSubList = path.subList(1, path.size());
        View viewFindPrefixedMatch = findPrefixedMatch(pathElement, givenRootView, this.mIndexStack.alloc());
        this.mIndexStack.free();
        if (viewFindPrefixedMatch != null) {
            findTargetsInMatchedView(viewFindPrefixedMatch, listSubList, accumulator);
        }
    }

    private void findTargetsInMatchedView(View alreadyMatched, List<PathElement> remainingPath, Accumulator accumulator) {
        if (remainingPath.isEmpty()) {
            accumulator.accumulate(alreadyMatched);
            return;
        }
        if (this.mIndexStack.full()) {
            TDLog.i(TAG, "Path is too deep, there is no memory to perfrom the finding");
            return;
        }
        if (alreadyMatched instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) alreadyMatched;
            PathElement pathElement = remainingPath.get(0);
            List<PathElement> listSubList = remainingPath.subList(1, remainingPath.size());
            int childCount = viewGroup.getChildCount();
            int iAlloc = this.mIndexStack.alloc();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewFindPrefixedMatch = findPrefixedMatch(pathElement, viewGroup.getChildAt(i2), iAlloc);
                if (viewFindPrefixedMatch != null) {
                    findTargetsInMatchedView(viewFindPrefixedMatch, listSubList, accumulator);
                }
                if (pathElement.index >= 0 && this.mIndexStack.read(iAlloc) > pathElement.index) {
                    break;
                }
            }
            this.mIndexStack.free();
        }
    }

    private View findPrefixedMatch(PathElement findElement, View subject, int indexKey) {
        View viewFindPrefixedMatch;
        int i2 = this.mIndexStack.read(indexKey);
        if (matches(findElement, subject)) {
            this.mIndexStack.increment(indexKey);
            if (findElement.index == -1 || findElement.index == i2) {
                return subject;
            }
        }
        if (findElement.prefix != 1 || !(subject instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) subject;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null && (viewFindPrefixedMatch = findPrefixedMatch(findElement, childAt, indexKey)) != null) {
                return viewFindPrefixedMatch;
            }
        }
        return null;
    }

    private boolean matches(PathElement matchElement, View subject) {
        if (matchElement.viewClassName == null || hasClassName(subject, matchElement.viewClassName)) {
            return -1 == matchElement.viewId || subject.getId() == matchElement.viewId;
        }
        return false;
    }

    public static boolean hasClassName(Object o2, String className) {
        for (Class<?> superclass = o2.getClass(); superclass.getCanonicalName() != null; superclass = superclass.getSuperclass()) {
            if (superclass.getCanonicalName().equals(className)) {
                return true;
            }
            if (superclass == Object.class) {
                return false;
            }
        }
        return false;
    }

    private static class IntStack {
        private static final int MAX_INDEX_STACK_SIZE = 256;
        private final int[] mStack = new int[256];
        private int mStackSize = 0;

        public boolean full() {
            return this.mStack.length == this.mStackSize;
        }

        public int alloc() {
            int i2 = this.mStackSize;
            this.mStackSize = i2 + 1;
            this.mStack[i2] = 0;
            return i2;
        }

        public int read(int index) {
            return this.mStack[index];
        }

        public void increment(int index) {
            int[] iArr = this.mStack;
            iArr[index] = iArr[index] + 1;
        }

        public void free() {
            int i2 = this.mStackSize - 1;
            this.mStackSize = i2;
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(this.mStackSize);
            }
        }
    }
}
