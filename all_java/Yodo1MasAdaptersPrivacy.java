package com.yodo1.mas.mediation.admob;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasAdaptersPrivacy {
    public static void setAdColonyPrivacy() {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.adcolony.Yodo1MasAdColonyAdapter");
            cls.getMethod("setAdColonyPrivacy", new Class[0]).invoke(cls.newInstance(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void setAppLovinPrivacy(Context context) {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.applovin.Yodo1MasAppLovinAdapter");
            cls.getMethod("setAppLoinPrivacy", Context.class).invoke(cls.newInstance(), context);
        } catch (Exception unused) {
        }
    }

    public static void setFacebookPrivacy() {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.facebook.Yodo1MasFacebookAdapter");
            cls.getMethod("setFacebookPrivacy", new Class[0]).invoke(cls.newInstance(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void setFyberPrivacy() {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.fyber.Yodo1MasFyberAdapter");
            cls.getMethod("setFyberPrivacy", new Class[0]).invoke(cls.newInstance(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void setInMobiPrivacy() {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.inmobi.Yodo1MasInMobiAdapter");
            cls.getMethod("setInMobiPrivacy", new Class[0]).invoke(cls.newInstance(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void setIronSourcePrivacy(Context context) {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.ironsource.Yodo1MasIronSourceAdapter");
            cls.getMethod("setIronSourcePrivacy", Context.class).invoke(cls.newInstance(), context);
        } catch (Exception unused) {
        }
    }

    public static void setTapjoyPrivacy() {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.tapjoy.Yodo1MasTapjoyAdapter");
            cls.getMethod("setTapjoyPrivacy", new Class[0]).invoke(cls.newInstance(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void setUnityAdsPrivacy(Context context) {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.unityads.Yodo1MasUnityAdsAdapter");
            cls.getMethod("setUnityAdsPrivacy", Context.class).invoke(cls.newInstance(), context);
        } catch (Exception unused) {
        }
    }

    public static void setVunglePrivacy() {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.vungle.Yodo1MasVungleAdapter");
            cls.getMethod("setVunglePrivacy", new Class[0]).invoke(cls.newInstance(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void setMasMintegralPrivacy(Context context) {
        try {
            Class<?> cls = Class.forName("com.yodo1.mas.mediation.mintegral.Yodo1MasMintegralAdapter");
            cls.getMethod("setMintegralPrivacy", new Class[0]).invoke(cls.newInstance(), context);
        } catch (Exception unused) {
        }
    }
}
