package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public final class Ref<T> {
    private T value;

    public Ref(T t) {
        this.value = t;
    }

    public final T getValue() {
        return this.value;
    }
}
