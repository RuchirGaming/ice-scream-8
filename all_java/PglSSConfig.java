package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f23831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f23832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f23833g;

    public class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23835b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23836c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23837d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f23834a)) {
                return null;
            }
            int i2 = this.f23835b;
            if (i2 != 2 && i2 != 1 && i2 != 0) {
                return null;
            }
            int i3 = this.f23836c;
            if (i3 == 0 || i3 == 1) {
                return new PglSSConfig(this.f23834a, i2, i3, this.f23837d);
            }
            return null;
        }

        public Builder setAdsdkVersionCode(int i2) {
            this.f23837d = i2;
            return this;
        }

        public Builder setAppId(String str) {
            this.f23834a = str;
            return this;
        }

        public Builder setCollectMode(int i2) {
            this.f23836c = i2;
            return this;
        }

        public Builder setOVRegionType(int i2) {
            this.f23835b = i2;
            return this;
        }
    }

    private PglSSConfig(String str, int i2, int i3, int i4) {
        this.f23827a = str;
        this.f23828b = i2;
        this.f23829c = i3;
        this.f23830d = i4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getAdSdkVersionCode() {
        return this.f23830d;
    }

    public String getAppId() {
        return this.f23827a;
    }

    public String getCnReportUrl() {
        return this.f23832f;
    }

    public String getCnTokenUrl() {
        return this.f23833g;
    }

    public int getCollectMode() {
        return this.f23829c;
    }

    public Map getCustomInfo() {
        return this.f23831e;
    }

    public int getOVRegionType() {
        return this.f23828b;
    }

    public void setCnReportUrl(String str) {
        this.f23832f = str;
    }

    public void setCnTokenUrl(String str) {
        this.f23833g = str;
    }

    public void setCustomInfo(Map map) {
        this.f23831e = map;
    }
}
