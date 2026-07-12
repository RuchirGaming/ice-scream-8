package cn.thinkinganalyticsclone.android.persistence;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class StorageLoginID extends SharedPreferencesStorage<String> {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.String] */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ String get() {
        return super.get();
    }

    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ void put(String data) {
        super.put(data);
    }

    public StorageLoginID(Future<SharedPreferences> loadStoredPreferences) {
        super(loadStoredPreferences, "loginID");
    }
}
