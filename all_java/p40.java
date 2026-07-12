package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class p40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33709a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f33711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f33713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f33714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f33715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f33716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f33717h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f33718i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Long f33719j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f33720k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f33721l;

        public final a b(String str) {
            Long lValueOf;
            if (str != null) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                    lValueOf = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
                } catch (ParseException unused) {
                    int i2 = ga0.f30971a;
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            this.f33719j = lValueOf;
            return this;
        }

        public final a c(String str) {
            Integer numValueOf;
            try {
                numValueOf = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                int i2 = ga0.f30971a;
                numValueOf = null;
            }
            this.f33714e = numValueOf;
            return this;
        }

        public final a d(String str) {
            int i2;
            if (TtmlNode.LEFT.equals(str)) {
                i2 = 1;
            } else {
                i2 = TtmlNode.RIGHT.equals(str) ? 2 : 3;
            }
            this.f33715f = i2;
            if (i2 == 3) {
                Integer numValueOf = null;
                try {
                    numValueOf = Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    int i3 = ga0.f30971a;
                }
                this.f33720k = numValueOf;
            }
            return this;
        }

        public final a e(String str) {
            Long lValueOf;
            if (str != null) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                    lValueOf = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
                } catch (ParseException unused) {
                    int i2 = ga0.f30971a;
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            this.f33718i = lValueOf;
            return this;
        }

        public final a g(String str) {
            for (b bVar : Arrays.asList(b.values())) {
                if (bVar.f33723a.equals(str)) {
                    this.f33711b = bVar;
                    return this;
                }
            }
            bVar = null;
            this.f33711b = bVar;
            return this;
        }

        public final a i(String str) {
            int i2;
            if ("top".equals(str)) {
                i2 = 1;
            } else {
                i2 = "bottom".equals(str) ? 2 : 3;
            }
            this.f33716g = i2;
            if (i2 == 3) {
                Integer numValueOf = null;
                try {
                    numValueOf = Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    int i3 = ga0.f30971a;
                }
                this.f33721l = numValueOf;
            }
            return this;
        }

        public final a j(String str) {
            Integer numValueOf;
            try {
                numValueOf = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                int i2 = ga0.f30971a;
                numValueOf = null;
            }
            this.f33713d = numValueOf;
            return this;
        }

        public final a a(String str) {
            this.f33717h = str;
            return this;
        }

        public final a f(String str) {
            this.f33712c = str;
            return this;
        }

        public final void h(String str) {
            this.f33710a = str;
        }

        public final p40 a() {
            return new p40(this);
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        EF7("StaticResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF17("IFrameResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF27("HTMLResource");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33723a;

        b(String str) {
            this.f33723a = str;
        }
    }

    p40(a aVar) {
        aVar.f33710a;
        aVar.f33711b;
        this.f33709a = aVar.f33712c;
        aVar.f33713d;
        aVar.f33714e;
        aVar.f33715f;
        aVar.f33716g;
        aVar.f33717h;
        aVar.f33718i;
        aVar.f33719j;
        aVar.f33720k;
        aVar.f33721l;
    }

    public final String a() {
        return this.f33709a;
    }
}
