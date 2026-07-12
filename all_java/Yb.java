package com.yandex.metrica.impl.ob;

import android.content.pm.FeatureInfo;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class Yb {

    public static class a extends Yb {
        @Override // com.yandex.metrica.impl.ob.Yb
        public Zb b(FeatureInfo featureInfo) {
            return new Zb(featureInfo.name, featureInfo.version, c(featureInfo));
        }
    }

    public static class b extends Yb {
        @Override // com.yandex.metrica.impl.ob.Yb
        public Zb b(FeatureInfo featureInfo) {
            return new Zb(featureInfo.name, -1, c(featureInfo));
        }
    }

    public Zb a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i2 = featureInfo.reqGlEsVersion;
        return i2 == 0 ? b(featureInfo) : new Zb("openGlFeature", i2, c(featureInfo));
    }

    protected abstract Zb b(FeatureInfo featureInfo);

    boolean c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
