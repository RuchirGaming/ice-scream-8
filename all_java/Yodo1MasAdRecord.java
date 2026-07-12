package com.yodo1.mas.reportad;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1MasAdRecord implements Comparable<Yodo1MasAdRecord> {
    public long ad_display_timestamp;
    public String ad_format;
    public int ad_index;
    public String ad_network;
    public String ad_package_name;
    public String ad_review_creative_id;
    public String ad_unit_id;
    public String advertiser;
    public String creative_id;
    public String dsp_id;
    public String dsp_name;
    public int mas_ad_type;
    public String serve_id;
    public String video_url;

    @Override // java.lang.Comparable
    public int compareTo(Yodo1MasAdRecord adRecord) {
        if (adRecord == null) {
            return -1;
        }
        return Long.compare(adRecord.ad_display_timestamp, this.ad_display_timestamp);
    }
}
