package kotlin.reflect.jvm.internal.impl.types.model;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public enum TypeVariance {
    IN(ScarConstants.IN_SIGNAL_KEY),
    OUT("out"),
    INV("");

    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
