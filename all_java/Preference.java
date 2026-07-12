package androidx.work.impl.model;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class Preference {
    public String mKey;
    public Long mValue;

    public Preference(String key, boolean value) {
        this(key, value ? 1L : 0L);
    }

    public Preference(String key, long value) {
        this.mKey = key;
        this.mValue = Long.valueOf(value);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) o2;
        if (!this.mKey.equals(preference.mKey)) {
            return false;
        }
        Long l2 = this.mValue;
        Long l3 = preference.mValue;
        if (l2 != null) {
            return l2.equals(l3);
        }
        return l3 == null;
    }

    public int hashCode() {
        int iHashCode = this.mKey.hashCode() * 31;
        Long l2 = this.mValue;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
