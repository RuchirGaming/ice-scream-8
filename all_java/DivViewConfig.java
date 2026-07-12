package com.yandex.div.core;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface DivViewConfig {
    public static final DivViewConfig DEFAULT = new DivViewConfig() { // from class: com.yandex.div.core.DivViewConfig$$ExternalSyntheticLambda0
        @Override // com.yandex.div.core.DivViewConfig
        public /* synthetic */ int getLogCardScrollSignificantThreshold() {
            return DivViewConfig.CC.$default$getLogCardScrollSignificantThreshold(this);
        }

        @Override // com.yandex.div.core.DivViewConfig
        public final boolean isContextMenuEnabled() {
            return DivViewConfig.CC.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: com.yandex.div.core.DivViewConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getLogCardScrollSignificantThreshold(DivViewConfig _this) {
            return 0;
        }

        static {
            DivViewConfig divViewConfig = DivViewConfig.DEFAULT;
        }

        public static /* synthetic */ boolean lambda$static$0() {
            return true;
        }
    }

    int getLogCardScrollSignificantThreshold();

    boolean isContextMenuEnabled();
}
