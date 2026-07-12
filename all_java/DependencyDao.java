package androidx.work.impl.model;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface DependencyDao {
    List<String> getDependentWorkIds(String id);

    List<String> getPrerequisites(String id);

    boolean hasCompletedAllPrerequisites(String id);

    boolean hasDependents(String id);

    void insertDependency(Dependency dependency);
}
