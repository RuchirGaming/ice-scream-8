package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class NM implements View.OnTouchListener {
    public static String[] A01 = {"nw3GK1YJfCGHoT5CzZQuJNL", "qBkNcCq6erHPEIRyhLgAx5qQPhS15kml", "hKPsn6oFoNQxCgWJ0mJ18v2", "6hVkqBVWqkQ2VmwtT15SPhBZDIeIrpUz", "tnTo5ZKyPj8PGNswlDP8K8OWnpseVTAJ", "xAs1p8", "q05N2S", "8Y6yfxdLCMC0pJKiVageEHpnR6mbXY9F"};
    public final /* synthetic */ NN A00;

    public NM(NN nn) {
        this.A00 = nn;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "OvxQOl3LXIasYJgnMQDmwFt";
        strArr2[0] = "0CKQQ25ailg1wOWqO8wBF5J";
        return false;
    }
}
