package com.facebook.ads.redexgen.X;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class Ch {
    public static String[] A04 = {"2qF5pOFs0IqpaE", "RfbD", "IXwzeXFQZ", "dH", "BZS0QFjYyMMtKdvz4XAttyOti7UPpZp6", "Ysa0lHORyV9SROuBxKvF6aLHu99ippeO", "IeuKB6uAyoApG9pIT7", ExifInterface.LONGITUDE_EAST};
    public static final byte[] A05 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public Ch(int i2) {
        this.A02 = new byte[i2];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i2, int i3) {
        if (!this.A03) {
            return;
        }
        int i4 = i3 - i2;
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        int i5 = this.A00;
        int readLength = i5 + i4;
        if (length < readLength) {
            int i6 = i5 + i4;
            String[] strArr = A04;
            String str = strArr[3];
            String str2 = strArr[0];
            int length2 = str.length();
            int readLength2 = str2.length();
            if (length2 == readLength2) {
                throw new RuntimeException();
            }
            A04[6] = "v6SEB1OgzyQ0Lh40gt";
            int readLength3 = i6 * 2;
            this.A02 = Arrays.copyOf(bArr2, readLength3);
        }
        byte[] bArr3 = this.A02;
        int readLength4 = this.A00;
        System.arraycopy(bArr, i2, bArr3, readLength4, i4);
        int readLength5 = this.A00;
        this.A00 = readLength5 + i4;
    }

    public final boolean A02(int i2, int i3) {
        if (this.A03) {
            int i4 = this.A00 - i3;
            this.A00 = i4;
            if (this.A01 == 0 && i2 == 181) {
                this.A01 = i4;
            } else {
                this.A03 = false;
                return true;
            }
        } else if (i2 == 179) {
            this.A03 = true;
        }
        byte[] bArr = A05;
        A01(bArr, 0, bArr.length);
        return false;
    }
}
