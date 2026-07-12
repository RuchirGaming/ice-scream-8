package com.yandex.mobile.ads.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class nv0 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f33244a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f33245b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f33246c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f33247d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f33248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f33249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33250g;

    public interface a {
        void a(float[] fArr, float f2);
    }

    public nv0(Display display, a... aVarArr) {
        this.f33248e = display;
        this.f33249f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f33244a, sensorEvent.values);
        float[] fArr = this.f33244a;
        int rotation = this.f33248e.getRotation();
        if (rotation != 0) {
            int i2 = 130;
            int i3 = 129;
            if (rotation == 1) {
                i2 = 2;
            } else if (rotation == 2) {
                i3 = 130;
                i2 = 129;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i3 = 1;
            }
            float[] fArr2 = this.f33245b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f33245b, i2, i3, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f33244a, 1, 131, this.f33245b);
        SensorManager.getOrientation(this.f33245b, this.f33247d);
        float f2 = this.f33247d[2];
        Matrix.rotateM(this.f33244a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f33244a;
        if (!this.f33250g) {
            sz.a(this.f33246c, fArr3);
            this.f33250g = true;
        }
        float[] fArr4 = this.f33245b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f33245b, 0, this.f33246c, 0);
        float[] fArr5 = this.f33244a;
        for (a aVar : this.f33249f) {
            aVar.a(fArr5, f2);
        }
    }
}
