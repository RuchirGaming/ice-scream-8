package androidx.core.content.res;

import com.inmobi.commons.core.configs.TelemetryConfig;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((((double) CamUtils.yFromLStar(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    float getAw() {
        return this.mAw;
    }

    float getN() {
        return this.mN;
    }

    float getNbb() {
        return this.mNbb;
    }

    float getNcb() {
        return this.mNcb;
    }

    float getC() {
        return this.mC;
    }

    float getNc() {
        return this.mNc;
    }

    float[] getRgbD() {
        return this.mRgbD;
    }

    float getFl() {
        return this.mFl;
    }

    float getFlRoot() {
        return this.mFlRoot;
    }

    float getZ() {
        return this.mZ;
    }

    private ViewingConditions(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.mN = f2;
        this.mAw = f3;
        this.mNbb = f4;
        this.mNcb = f5;
        this.mC = f6;
        this.mNc = f7;
        this.mRgbD = fArr;
        this.mFl = f8;
        this.mFlRoot = f9;
        this.mZ = f10;
    }

    static ViewingConditions make(float[] fArr, float f2, float f3, float f4, boolean z) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f5 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f6 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f7 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f8 = (f4 / 10.0f) + 0.8f;
        float fLerp = ((double) f8) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f8 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f8 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f2) - 42.0f) / 92.0f)) * 0.2777778f)) * f8;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < TelemetryConfig.DEFAULT_SAMPLING_FACTOR) {
            fExp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f5) * fExp) + 1.0f) - fExp, (((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp};
        float f9 = 1.0f / ((5.0f * f2) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (f10 * f2) + (0.1f * f11 * f11 * ((float) Math.cbrt(((double) f2) * 5.0d)));
        float fYFromLStar = CamUtils.yFromLStar(f3) / fArr[1];
        double d3 = fYFromLStar;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * fCbrt) * f5)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * fCbrt) * f7)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(fYFromLStar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * fPow, fPow, fPow, fLerp, f8, fArr3, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }
}
