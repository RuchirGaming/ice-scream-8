package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class LC extends Writer {
    public static String[] A03 = {"m3VYVt1tyYlWEg8H2HS3pUr0VsrhpbIN", "rEdvzR", "IUQqTrakmjCy7RtoUebGZ8YLkwuKbv7t", "x1ufNW", "e7NtJ1", "AK7iWzpXctzvcUrQA38QQTSmPkrm2HP", "25DCnOqD1cr08G9nl6wTfczykol7NaSA", "0bM1VBntYb2o4FFsMu8yzxmwObMsLmHM"};
    public int A00;
    public char[] A01 = new char[1024];
    public final LB A02;

    public LC(LB lb) {
        this.A02 = lb;
    }

    private void A00() {
        this.A02.ADy(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) throws IOException {
        int i4 = i2;
        while (true) {
            int i5 = i2 + i3;
            String[] strArr = A03;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int i6 = str2.length();
            if (length != i6) {
                throw new RuntimeException();
            }
            A03[5] = "5m1TKypG4e5yu";
            if (i4 < i5) {
                if (cArr[i4] != '\n') {
                    int i7 = this.A00;
                    char[] cArr2 = this.A01;
                    int i8 = cArr2.length;
                    if (i7 == i8) {
                        A00();
                    } else {
                        cArr2[i7] = cArr[i4];
                        int i9 = i7 + 1;
                        this.A00 = i9;
                    }
                } else {
                    A00();
                }
                i4++;
            } else {
                return;
            }
        }
    }
}
