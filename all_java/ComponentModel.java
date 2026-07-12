package com.bykv.vk.openvk.preload.geckox.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bykv.vk.openvk.preload.a.a.c;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class ComponentModel {

    @c(a = "packages")
    private Map<String, List<UpdatePackage>> packages;

    @c(a = "universal_strategies")
    private Map<String, b> universalStrategies;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c(a = ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)
        public String f1459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c(a = "clean_type")
        public int f1460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @c(a = MediationMetaData.KEY_VERSION)
        public List<Long> f1461c;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c(a = "specified_clean")
        public List<a> f1462a;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
