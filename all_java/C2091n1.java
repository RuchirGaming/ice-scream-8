package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2091n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f27633a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f27634b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    public boolean a(List<StackTraceElement> list) {
        return a(list, f27633a);
    }

    public boolean b(List<StackTraceElement> list) {
        return a(list, f27634b);
    }

    private boolean a(List<StackTraceElement> list, Pattern pattern) {
        Iterator<StackTraceElement> it = list.iterator();
        while (it.hasNext()) {
            if (pattern.matcher(it.next().getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}
