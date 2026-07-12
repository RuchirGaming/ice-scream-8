package cn.thinkinganalyticsclone.android.persistence;

import android.content.SharedPreferences;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
abstract class SharedPreferencesStorage<T> {
    protected T data;
    private final Future<SharedPreferences> loadStoredPreferences;
    final String storageKey;

    T create() {
        return null;
    }

    SharedPreferencesStorage(final Future<SharedPreferences> loadStoredPreferences, final String storageKey) {
        this.loadStoredPreferences = loadStoredPreferences;
        this.storageKey = storageKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void save(SharedPreferences.Editor editor, T data) {
        editor.putString(this.storageKey, (String) data);
        editor.apply();
    }

    void load(SharedPreferences sharedPreferences) {
        T t = (T) sharedPreferences.getString(this.storageKey, null);
        if (t == null) {
            put(create());
        } else {
            this.data = t;
        }
    }

    public T get() throws ExecutionException, InterruptedException {
        if (this.data == null) {
            synchronized (this.loadStoredPreferences) {
                SharedPreferences sharedPreferences = null;
                try {
                    sharedPreferences = this.loadStoredPreferences.get();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                } catch (ExecutionException e3) {
                    e3.printStackTrace();
                }
                if (sharedPreferences != null) {
                    load(sharedPreferences);
                }
            }
        }
        return this.data;
    }

    public void put(T data) {
        this.data = data;
        synchronized (this.loadStoredPreferences) {
            SharedPreferences.Editor editor = getEditor();
            if (editor != null) {
                save(editor, this.data);
            }
        }
    }

    private SharedPreferences.Editor getEditor() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.loadStoredPreferences.get();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            sharedPreferences = null;
        } catch (ExecutionException e3) {
            e3.printStackTrace();
            sharedPreferences = null;
        }
        if (sharedPreferences != null) {
            return sharedPreferences.edit();
        }
        return null;
    }
}
