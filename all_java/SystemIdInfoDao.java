package androidx.work.impl.model;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface SystemIdInfoDao {
    SystemIdInfo getSystemIdInfo(String workSpecId);

    List<String> getWorkSpecIds();

    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(String workSpecId);
}
