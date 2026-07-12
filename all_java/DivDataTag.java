package com.yandex.div;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class DivDataTag {
    public static final DivDataTag INVALID = new DivDataTag("");
    private final String mId;

    public DivDataTag(String str) {
        this.mId = str;
    }

    public String getId() {
        return this.mId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mId.equals(((DivDataTag) obj).mId);
    }

    public int hashCode() {
        return this.mId.hashCode();
    }
}
