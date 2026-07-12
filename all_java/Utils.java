package io.bidmachine.analytics;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.explorestack.protobuf.Timestamp;
import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Utils {
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void flush(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean isSameThread(Handler handler) {
        return Looper.myLooper() == handler.getLooper();
    }

    public static Timestamp msToTimestamp(long j2) {
        return Timestamp.newBuilder().setSeconds(j2 / 1000).setNanos((int) ((j2 % 1000) * 1000000)).build();
    }

    public static <T> List<List<T>> split(List<T> list, int i2) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + i2;
            arrayList.add(list.subList(i3, Math.min(i4, size)));
            i3 = i4;
        }
        return arrayList;
    }

    public static JSONArray toJSONArray(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        for (Object jSONObject : list) {
            if (jSONObject instanceof List) {
                jSONObject = toJSONArray((List) jSONObject);
            } else if (jSONObject instanceof Map) {
                jSONObject = toJSONObject((Map) jSONObject);
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject toJSONObject(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            try {
                String string = entry.getKey().toString();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(string) && value != null) {
                    if (value instanceof List) {
                        value = toJSONArray((List) value);
                    } else if (value instanceof Map) {
                        value = toJSONObject((Map) value);
                    }
                    jSONObject.put(string, value);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
