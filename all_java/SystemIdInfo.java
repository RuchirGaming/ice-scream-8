package androidx.work.impl.model;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class SystemIdInfo {
    public final int systemId;
    public final String workSpecId;

    public SystemIdInfo(String workSpecId, int systemId) {
        this.workSpecId = workSpecId;
        this.systemId = systemId;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) o2;
        if (this.systemId != systemIdInfo.systemId) {
            return false;
        }
        return this.workSpecId.equals(systemIdInfo.workSpecId);
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.systemId;
    }
}
