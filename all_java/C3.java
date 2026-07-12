package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C3 implements Vm<Thread, C2072m7> {
    @Override // com.yandex.metrica.impl.ob.Vm
    public C2072m7 a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C2072m7(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
