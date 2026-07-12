package cn.thinkinganalyticsclone.android.persistence;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class StorageOptOutFlag extends SharedPreferencesStorage<Boolean> {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Boolean, java.lang.Object] */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ Boolean get() {
        return super.get();
    }

    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ void put(Boolean data) {
        super.put(data);
    }

    public StorageOptOutFlag(Future<SharedPreferences> loadStoredPreferences) {
        super(loadStoredPreferences, "optOutFlag");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public void save(SharedPreferences.Editor editor, Boolean data) {
        editor.putBoolean(this.storageKey, data.booleanValue());
        editor.apply();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    protected void load(SharedPreferences sharedPreferences) {
        this.data = Boolean.valueOf(sharedPreferences.getBoolean(this.storageKey, false));
    }
}
