package cn.thinkinganalyticsclone.android.persistence;

import android.content.SharedPreferences;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class StorageSuperProperties extends SharedPreferencesStorage<JSONObject> {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.json.JSONObject] */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ JSONObject get() {
        return super.get();
    }

    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public /* bridge */ /* synthetic */ void put(JSONObject data) {
        super.put(data);
    }

    public StorageSuperProperties(Future<SharedPreferences> loadStoredPreferences) {
        super(loadStoredPreferences, "superProperties");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public JSONObject create() {
        return new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    public void save(SharedPreferences.Editor editor, JSONObject data) {
        editor.putString(this.storageKey, data == null ? null : data.toString());
        editor.apply();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, org.json.JSONObject] */
    @Override // cn.thinkinganalyticsclone.android.persistence.SharedPreferencesStorage
    void load(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(this.storageKey, null);
        if (string == null) {
            put(create());
            return;
        }
        try {
            this.data = new JSONObject(string);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
