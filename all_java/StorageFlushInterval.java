package cn.thinkinganalyticsclone.android.persistence;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class StorageFlushInterval extends SharedPreferencesStorage<Integer> {
    private final int mDefaultFlushInterval;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Integer, java.lang.Object] */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ Integer get() {
        return super.get();
    }

    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ void put(Integer data) {
        super.put(data);
    }

    public StorageFlushInterval(Future<SharedPreferences> loadStoredPreferences, int defaultFlushInterval) {
        super(loadStoredPreferences, "flushInterval");
        this.mDefaultFlushInterval = defaultFlushInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public void save(SharedPreferences.Editor editor, Integer interval) {
        editor.putInt(this.storageKey, interval.intValue());
        editor.apply();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Integer] */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    void load(SharedPreferences sharedPreferences) {
        this.data = Integer.valueOf(sharedPreferences.getInt(this.storageKey, this.mDefaultFlushInterval));
    }
}
