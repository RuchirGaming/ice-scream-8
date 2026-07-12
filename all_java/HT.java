package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class HT implements InterfaceC1230Qg {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -56, -41, -38, -46, -43, -50, -125, -56, -43, -43, -46, -43};
    }

    public HT(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e2) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 34), e2);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1230Qg
    public final byte[] A63() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1230Qg
    public final String A64() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1230Qg
    public final Map<String, List<String>> A72() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1230Qg
    public final int A7v() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1230Qg
    public final String getUrl() {
        return this.A01;
    }
}
