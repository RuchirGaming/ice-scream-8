package com.google.android.gms.common.data;

import io.bidmachine.nativead.NativeRequest;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        NativeRequest.Builder.AnonymousClass1 anonymousClass1 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            anonymousClass1.add(arrayList.get(i2).freeze());
        }
        return anonymousClass1;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        NativeRequest.Builder.AnonymousClass1 anonymousClass1 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            anonymousClass1.add(it.next().freeze());
        }
        return anonymousClass1;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        NativeRequest.Builder.AnonymousClass1 anonymousClass1 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e2 : eArr) {
            anonymousClass1.add(e2.freeze());
        }
        return anonymousClass1;
    }
}
