package kotlin.collections;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
class ArraysUtilJVM {
    ArraysUtilJVM() {
    }

    static <T> List<T> asList(T[] tArr) {
        return Arrays.asList(tArr);
    }
}
