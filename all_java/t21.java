package com.yandex.mobile.ads.impl;

import com.yodo1.mas.mediation.yandex.BuildConfig;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class t21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f35371b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f35372a = ah.c();
    }

    public interface b {
        Map<String, Object> a();
    }

    public enum c {
        f35373b("ad_loading_result"),
        f35374c("ad_rendering_result"),
        f35375d("adapter_auto_refresh"),
        f35376e("adapter_invalid"),
        f35377f("adapter_request"),
        f35378g("adapter_response"),
        f35379h("adapter_bidder_token_request"),
        f35380i("adtune"),
        f35381j("ad_request"),
        f35382k("ad_response"),
        f35383l("vast_request"),
        f35384m("vast_response"),
        f35385n("vast_wrapper_request"),
        f35386o("vast_wrapper_response"),
        f35387p("video_ad_start"),
        f35388q("video_ad_complete"),
        f35389r("video_ad_player_error"),
        f35390s("vmap_request"),
        t("vmap_response"),
        u("rendering_start"),
        v("impression_tracking_start"),
        w("impression_tracking_success"),
        x("impression_tracking_failure"),
        y("forced_impression_tracking_failure"),
        z("adapter_action"),
        A("click"),
        B("close"),
        C("feedback"),
        D("deeplink"),
        E("show_social_actions"),
        F("bound_assets"),
        G("rendered_assets"),
        H("rebind"),
        I("binding_failure"),
        J("expected_view_missing"),
        K("returned_to_app"),
        L("reward"),
        /* JADX INFO: Fake field, exist only in values array */
        EF1("js_error"),
        M("video_ad_rendering_result"),
        N("multibanner_event"),
        O("ad_view_size_info"),
        P("ad_unit_impression_tracking_start"),
        Q("ad_unit_impression_tracking_success"),
        R("ad_unit_impression_tracking_failure"),
        S("forced_ad_unit_impression_tracking_failure"),
        T("log");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35391a;

        c(String str) {
            this.f35391a = str;
        }

        public final String a() {
            return this.f35391a;
        }
    }

    public enum d {
        f35392b("success"),
        f35393c("error"),
        f35394d("no_ads"),
        /* JADX INFO: Fake field, exist only in values array */
        EF43("filtered");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35396a;

        d(String str) {
            this.f35396a = str;
        }

        public final String a() {
            return this.f35396a;
        }
    }

    public t21(c cVar, Map<String, Object> map) {
        this(cVar.a(), map);
    }

    public final Map<String, Object> a() {
        return this.f35371b;
    }

    public final String b() {
        return this.f35370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t21.class != obj.getClass()) {
            return false;
        }
        t21 t21Var = (t21) obj;
        if (this.f35370a.equals(t21Var.f35370a)) {
            return this.f35371b.equals(t21Var.f35371b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35371b.hashCode() + (this.f35370a.hashCode() * 31);
    }

    public t21(String str, Map<String, Object> map) {
        map.put("sdk_version", BuildConfig.SDK_VERSION_NAME);
        this.f35371b = map;
        this.f35370a = str;
    }
}
