package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface JavaResolverSettings {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean getCorrectNullabilityForNotNullTypeParameter();

    boolean getTypeEnhancementImprovementsInStrictMode();

    boolean isReleaseCoroutines();

    /* JADX INFO: compiled from: context.kt */
    public static final class Default implements JavaResolverSettings {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getCorrectNullabilityForNotNullTypeParameter() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getTypeEnhancementImprovementsInStrictMode() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean isReleaseCoroutines() {
            return false;
        }

        private Default() {
        }
    }

    /* JADX INFO: compiled from: context.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
