package cn.thinkinganalyticsclone.android.thirdparty;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public abstract class AbstractSyncThirdData implements ISyncThirdPartyData {
    protected static final String TAG = "ThinkingAnalyticsClone.SyncData";
    protected String accountId;
    protected String distinctId;

    public AbstractSyncThirdData() {
    }

    public AbstractSyncThirdData(String distinctId) {
        this.distinctId = distinctId;
    }

    public AbstractSyncThirdData(String distinctId, String accountId) {
        this.distinctId = distinctId;
        this.accountId = accountId;
    }
}
