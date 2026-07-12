package com.yodo1.mas.reportad;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1MasAdReport implements Comparable<Yodo1MasAdReport> {
    public int ad_type;
    public List<Yodo1MasAdRecord> ads_list;
    public String app_key;
    public String bundle_id;
    public String device_info;
    public String device_model;
    public String device_type;
    public String email;
    public String gaid;
    public String internet_type;
    public String ip;
    public String issue_desc;
    public int issue_type;
    public String mas_device_id;
    public String os_version;
    public String platform;
    public int report_ad_index;
    public long report_timestamp;
    public String sdk_version;
    public String thinking_device_id;
    public String thinking_distinct_id;

    @Override // java.lang.Comparable
    public int compareTo(Yodo1MasAdReport report) {
        if (report == null) {
            return -1;
        }
        return Long.compare(report.report_timestamp, this.report_timestamp);
    }
}
