package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class ContentUriTriggers {
    private final Set<Trigger> mTriggers = new HashSet();

    public void add(Uri uri, boolean triggerForDescendants) {
        this.mTriggers.add(new Trigger(uri, triggerForDescendants));
    }

    public Set<Trigger> getTriggers() {
        return this.mTriggers;
    }

    public int size() {
        return this.mTriggers.size();
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        return this.mTriggers.equals(((ContentUriTriggers) o2).mTriggers);
    }

    public int hashCode() {
        return this.mTriggers.hashCode();
    }

    public static final class Trigger {
        private final boolean mTriggerForDescendants;
        private final Uri mUri;

        Trigger(Uri uri, boolean triggerForDescendants) {
            this.mUri = uri;
            this.mTriggerForDescendants = triggerForDescendants;
        }

        public Uri getUri() {
            return this.mUri;
        }

        public boolean shouldTriggerForDescendants() {
            return this.mTriggerForDescendants;
        }

        public boolean equals(Object o2) {
            if (this == o2) {
                return true;
            }
            if (o2 == null || getClass() != o2.getClass()) {
                return false;
            }
            Trigger trigger = (Trigger) o2;
            return this.mTriggerForDescendants == trigger.mTriggerForDescendants && this.mUri.equals(trigger.mUri);
        }

        public int hashCode() {
            return (this.mUri.hashCode() * 31) + (this.mTriggerForDescendants ? 1 : 0);
        }
    }
}
