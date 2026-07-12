package com.yandex.metrica.impl.ob;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1982ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f27126a;

    public C1982ih() {
        HashMap map = new HashMap();
        this.f27126a = map;
        map.put("wakeup", "wu");
        map.put("easy_collecting", "ec");
        map.put("cells_around", DownloadCommon.DOWNLOAD_REPORT_CANCEL);
        map.put("google_aid", "g");
        map.put("huawei_oaid", ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME);
        map.put("sim_info", "si");
        map.put("throttling", "tht");
        map.put("wifi_around", "wa");
        map.put("wifi_connected", "wc");
        map.put("features_collecting", "fc");
        map.put("cell_additional_info", "cai");
        map.put("cell_additional_info_connected_only", "caico");
        map.put("location_collecting", "lc");
        map.put("lbs_collecting", "lbs");
        map.put("package_info", "pi");
        map.put("permissions_collecting", ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY);
        map.put("sdk_list", "sl");
        map.put("socket", ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
        map.put("identity_light_collecting", "ilc");
        map.put("gpl_collecting", "gplc");
        map.put("retry_policy", "rp");
        map.put("ui_parsing", "up");
        map.put("ui_collecting_for_bridge", "ucfb");
        map.put("ui_event_sending", "ues");
        map.put("ui_raw_event_sending", "ures");
        map.put("cache_control", "cc");
        map.put("mediascope_api_keys", "mak");
        map.put("diagnostics", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
        map.put("auto_inapp_collecting", "aic");
        map.put("attribution", "at");
        map.put("egress", "eg");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
    }

    public String a(String str) {
        return this.f27126a.containsKey(str) ? this.f27126a.get(str) : str;
    }
}
