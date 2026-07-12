package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class IP {
    public static IP A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0R(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 46);
            i5++;
        }
    }

    public static void A0c() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, 127, 101, 120, 127, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, 127, 106, 92, 70, 19, 68, 90, 95, 95, 19, 81, 86, 19, 71, 82, 88, 86, 93, 19, 71, 92, 19, 82, 93, 92, 71, 91, 86, 65, 19, 87, 86, SignedBytes.MAX_POWER_OF_TWO, 71, 90, 93, 82, 71, 90, 92, 93, 29, 6, 17, 25, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, 12, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, 127, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, 28, 32, 47, 42, 32, 40, 48, 28, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, 28, 48, 55, 38, 51, 28, 32, 34, 45, 32, 38, 47, 28, 33, 54, 55, 55, 44, 45, 28, 55, 38, 59, 55, 25, 27, 27, 17, 28, 29, 22, 12, 25, 20, 39, 27, 20, 17, 27, 19, 11, 39, 27, 23, 22, 30, 17, 31, 86, 12, 15, 23, 39, 11, 12, 29, 8, 39, 27, 23, 22, 30, 17, 10, 21, 39, 26, 13, 12, 12, 23, 22, 39, 12, 29, 0, 12, 3, 1, 1, 11, 6, 7, 12, 22, 3, 14, Base64.padSymbol, 1, 14, 11, 1, 9, 17, Base64.padSymbol, 1, 13, 12, 4, 11, 5, 76, 22, 21, 13, Base64.padSymbol, 17, 22, 7, 18, Base64.padSymbol, 1, 13, 12, 4, 11, 16, 15, 3, 22, 11, 13, 12, 68, 70, 70, 76, 65, SignedBytes.MAX_POWER_OF_TWO, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, 11, 81, 82, 74, 122, 86, 81, SignedBytes.MAX_POWER_OF_TWO, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, 30, 28, 28, 22, 27, 26, 17, 11, 30, 19, 32, 28, 19, 22, 28, 20, 12, 32, 28, 16, 17, 25, 22, 24, 81, 11, 8, 16, 32, 12, 11, 26, 15, 32, 28, 16, 17, 25, 22, 13, 18, 30, 11, 22, 16, 17, 32, 11, 22, 11, 19, 26, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, 127, 96, 23, 18, 24, 1, 41, 23, 21, 21, 19, 6, 2, 23, 20, 26, 19, 41, 5, 2, 23, 21, 29, 2, 4, 23, 21, 19, 41, 26, 19, 24, 17, 2, 30, Utf8.REPLACEMENT_BYTE, 58, 48, 41, 1, Utf8.REPLACEMENT_BYTE, 58, 1, 58, 59, 42, Utf8.REPLACEMENT_BYTE, 55, 50, 45, 1, Base64.padSymbol, 50, 55, Base64.padSymbol, 53, Utf8.REPLACEMENT_BYTE, 60, 50, 59, 121, 124, 118, 111, 71, 121, 124, 71, 124, 125, 108, 121, 113, 116, 107, 71, 113, 118, 71, 123, 112, 121, 113, 118, 125, 124, 71, 113, 117, 121, 127, 125, 71, 121, 124, 71, 126, 119, 119, 108, 125, 106, 71, 123, 116, 113, 123, 115, 121, 122, 116, 125, 31, 26, 16, 9, 33, 31, 16, 26, 12, 17, 23, 26, 33, 31, 18, 18, 17, 9, 33, 18, 17, 31, 26, 33, 26, 11, 12, 23, 16, 25, 33, 13, 22, 17, 9, 23, 16, 25, 46, 43, 33, 56, 16, 46, 33, 43, Base64.padSymbol, 32, 38, 43, 16, 46, 33, Base64.padSymbol, 16, 43, 42, 59, 42, 44, 59, 32, Base64.padSymbol, 16, 42, 33, 46, 45, 35, 42, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 62, 49, 45, 0, 59, 58, 43, 58, 60, 43, 48, 45, 0, 43, 54, 50, 58, 48, 42, 43, 0, 50, 44, 112, 117, 127, 102, 78, 112, 127, 117, 99, 126, 120, 117, 78, 115, 112, 127, 127, 116, 99, 78, 116, 105, 101, 99, 112, 78, 121, 120, 127, 101, 98, 78, 119, 120, 105, 78, 116, 127, 112, 115, 125, 116, 117, 33, 36, 46, 55, 31, 33, 46, 36, 50, 47, 41, 36, 31, 34, 44, 33, 35, 43, 44, 41, 51, 52, 37, 36, 31, 41, 46, 52, 37, 46, 52, 31, 53, 50, 44, 31, 48, 50, 37, 38, 41, 56, 37, 51, 5, 0, 10, 19, 59, 5, 10, 0, 22, 11, 13, 0, 59, 6, 8, 11, 7, 15, 59, 17, 10, 23, 5, 2, 1, 59, 20, 8, 5, 29, 5, 6, 8, 1, 59, 3, 5, 9, 1, 23, 59, 7, 5, 7, 12, 1, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 112, 107, 98, 115, 97, 97, 77, 98, 115, 113, 121, 115, 117, 119, 77, 118, 119, 102, 119, 113, 102, 123, 125, 124, 77, 116, 125, 96, 77, 118, 119, 119, 98, 126, 123, 124, 121, 97, 28, 25, 19, 10, 34, 28, 19, 25, 15, 18, 20, 25, 34, 30, 28, 30, 21, 24, 34, 16, 18, 25, 8, 17, 24, 34, 16, 28, 5, 34, 14, 20, 7, 24, 69, SignedBytes.MAX_POWER_OF_TWO, 74, 83, 123, 69, 74, SignedBytes.MAX_POWER_OF_TWO, 86, 75, 77, SignedBytes.MAX_POWER_OF_TWO, 123, 71, 69, 71, 76, 65, 123, 73, 75, SignedBytes.MAX_POWER_OF_TWO, 81, 72, 65, 123, 86, 65, 80, 86, 93, 123, 72, 77, 73, 77, 80, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 99, 97, 114, 111, 117, 115, 101, 108, 95, 119, 104, 105, 116, 101, 95, 105, 110, 116, 101, 114, 115, 116, 105, 116, 105, 97, 108, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 69, 73, 75, 86, 84, 67, 85, 85, 121, 79, 75, 71, 65, 67, 85, 121, 66, 83, 84, 79, 72, 65, 121, 66, 73, 81, 72, 74, 73, 71, 66, 126, 123, 113, 104, SignedBytes.MAX_POWER_OF_TWO, 126, 113, 123, 109, 112, 118, 123, SignedBytes.MAX_POWER_OF_TWO, 123, 122, 121, 126, 106, 115, 107, SignedBytes.MAX_POWER_OF_TWO, 126, 108, 108, 122, 107, SignedBytes.MAX_POWER_OF_TWO, 111, 
        109, 122, 115, 112, 126, 123, SignedBytes.MAX_POWER_OF_TWO, 108, 118, 101, 122, SignedBytes.MAX_POWER_OF_TWO, 125, 102, 107, 122, 108, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 120, 117, 111, 125, 126, 112, 121, 67, 108, 112, 125, 101, 125, 126, 112, 121, 67, 108, 110, 121, 127, 125, 127, 116, 121, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, Utf8.REPLACEMENT_BYTE, 50, 9, 50, 57, 9, 56, 57, 34, 9, 35, 37, 51, 9, 37, 34, 55, 34, 51, 9, 62, 55, 56, 50, 58, 51, 36, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 84, 95, 80, 83, 93, 84, 110, 95, 80, 69, 88, 71, 84, 110, 87, 68, 95, 95, 84, 93, 12, 9, 3, 26, 50, 12, 3, 9, 31, 2, 4, 9, 50, 8, 21, 2, 50, 29, 1, 12, 20, 8, 31, 50, 14, 12, 14, 5, 8, 50, 0, 12, 21, 50, 30, 4, 23, 8, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, 127, 120, 112, 117, 70, 120, 125, 70, 117, 118, 120, 125, 70, 118, 119, 70, 125, 112, 106, 114, 70, 124, 107, 107, 118, 107, 106, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 109, 106, 98, 103, 84, 100, 101, 84, 124, 110, 105, 125, 98, 110, 124, 84, 110, 121, 121, 100, 121, 120, 10, 15, 5, 28, 52, 10, 5, 15, 25, 4, 2, 15, 52, 13, 4, 25, 8, 14, 52, 3, 10, 25, 15, 28, 10, 25, 14, 52, 10, 8, 8, 14, 7, 14, 25, 10, 31, 2, 4, 5, 21, 16, 26, 3, 43, 21, 26, 16, 6, 27, 29, 16, 43, 28, 29, 16, 17, 43, 2, 29, 16, 17, 27, 4, 6, 27, 19, 6, 17, 7, 7, 43, 21, 26, 29, 25, 21, 0, 29, 27, 26, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 98, 102, 106, 108, 110, 84, 104, 106, 104, 99, 110, 84, 120, 127, 100, 121, 110, 84, 105, 114, 127, 110, 84, 104, 100, 126, 101, 127, 43, 46, 36, Base64.padSymbol, 21, 43, 36, 46, 56, 37, 35, 46, 21, 35, 36, 62, 47, 36, 62, 21, 36, 37, 21, 36, 47, Base64.padSymbol, 21, 62, 43, 57, 33, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 75, 67, 75, 73, 84, 95, 121, 73, 86, 82, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 117, 106, 123, 71, 113, 117, 104, 106, 125, 107, 107, 113, 119, 118, 71, 126, 119, 106, 71, 118, 121, 108, 113, 110, 125, 71, 110, 113, 124, 125, 119, 71, 121, 124, 107, 71, 110, 42, 103, 98, 104, 113, 89, 103, 104, 98, 116, 105, 111, 98, 89, 104, 103, 114, 111, 112, 99, 89, 101, 103, 116, 105, 115, 117, 99, 106, 89, 99, 126, 114, 99, 104, 117, 111, 105, 104, 89, 112, 103, 116, 111, 103, 104, 114, 124, 121, 115, 106, 66, 124, 115, 121, 111, 114, 116, 121, 66, 115, 124, 105, 116, 107, 120, 66, 115, 120, 106, 66, 126, 124, 111, 114, 104, 110, 120, 113, 66, 121, 120, 110, 116, 122, 115, 56, Base64.padSymbol, 55, 46, 6, 56, 55, Base64.padSymbol, 43, 54, 48, Base64.padSymbol, 6, 55, 60, 45, 46, 54, 43, 50, 6, Base64.padSymbol, 60, Utf8.REPLACEMENT_BYTE, 56, 44, 53, 45, 6, 58, 54, 55, 55, 60, 58, 45, 48, 54, 55, 6, 45, 48, 52, 60, 54, 44, 45, 6, 52, 42, 86, 83, 89, SignedBytes.MAX_POWER_OF_TWO, 104, 86, 89, 83, 69, 88, 94, 83, 104, 89, 82, 67, SignedBytes.MAX_POWER_OF_TWO, 88, 69, 92, 104, 83, 82, 81, 86, 66, 91, 67, 104, 69, 82, 86, 83, 104, 67, 94, 90, 82, 88, 66, 67, 104, 90, 68, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 84, 95, 78, 77, 85, 72, 81, 101, 94, 95, 92, 91, 79, 86, 78, 101, 72, 95, 78, 72, 83, 95, 73, 101, 84, 79, 87, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 59, 48, 33, 34, 58, 39, 62, 10, 49, 48, 51, 52, 32, 57, 33, 10, 33, Base64.padSymbol, 39, 58, 33, 33, 57, 48, 10, 33, 60, 56, 48, 58, 32, 33, 10, 56, 38, 14, 11, 1, 24, 48, 14, 1, 11, 29, 0, 6, 11, 48, 1, 10, 27, 24, 0, 29, 4, 48, 11, 10, 9, 14, 26, 3, 27, 48, 27, 6, 2, 10, 0, 26, 27, 48, 2, 28, 109, 104, 98, 123, 83, 109, 98, 104, 126, 99, 101, 104, 83, 99, 120, 127, 96, 83, 105, 98, 109, 110, 96, 105, 104, 58, Utf8.REPLACEMENT_BYTE, 53, 44, 4, 58, 53, Utf8.REPLACEMENT_BYTE, 41, 52, 50, Utf8.REPLACEMENT_BYTE, 4, 41, 62, 54, 52, 45, 62, 4, 42, 46, 62, 41, 34, 4, 43, 58, 41, 47, 4, Base64.padSymbol, 41, 52, 54, 4, 56, 58, 56, 51, 62, 4, 48, 62, 34, 35, 38, 44, 53, 29, 35, 44, 38, 48, 45, 43, 38, 29, 48, 39, 50, 45, 48, 54, 29, 50, 48, 39, 49, 39, 44, 54, 35, 54, 43, 45, 44, 29, 39, 48, 48, 45, 48, 29, 53, 42, 39, 44, 29, 44, 45, 29, 43, 47, 50, 48, 39, 49, 49, 43, 45, 44, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 72, 95, 74, 85, 72, 78, 101, 74, 72, 95, 73, 95, 84, 78, 91, 78, 83, 85, 84, 101, 95, 72, 72, 85, 72, 73, 101, 83, 84, 73, 78, 95, 91, 94, 101, 85, 92, 101, 83, 84, 78, 95, 72, 84, 91, 86, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, Utf8.REPLACEMENT_BYTE, 36, 35, 57, 32, 40, 19, 46, 32, 35, 47, 39, 19, Utf8.REPLACEMENT_BYTE, 53, 34, 47, 19, 35, 34, 19, 46, 45, 47, 39, 43, 62, 35, 57, 34, 
        40, 7, 2, 8, 17, 57, 7, 8, 2, 20, 9, 15, 2, 57, 21, 14, 9, 19, 10, 2, 57, 14, 15, 2, 3, 57, 10, 9, 7, 2, 3, 20, 41, 44, 38, Utf8.REPLACEMENT_BYTE, 23, 41, 38, 44, 58, 39, 33, 44, 23, 59, 32, 39, Base64.padSymbol, 36, 44, 23, 33, 38, 33, 60, 23, Base64.padSymbol, 38, 59, 35, 33, 56, 56, 41, 42, 36, 45, 23, 59, 45, 43, 39, 38, 44, 59, 23, 43, 39, 37, 56, 36, 45, 60, 45, 114, 119, 125, 100, 76, 114, 125, 119, 97, 124, 122, 119, 76, 96, 123, 124, 102, 127, 119, 76, 127, 114, 102, 125, 112, 123, 76, 99, 127, 114, 106, 76, 96, 103, 124, 97, 118, 76, 122, 125, 76, 124, 101, 118, 97, 127, 114, 106, 122, 127, 117, 108, 68, 122, 117, 127, 105, 116, 114, 127, 68, 104, 115, 116, 110, 119, 127, 68, 105, 126, 104, 126, 111, 68, 125, 116, 120, 110, 104, 68, 116, 117, 68, 117, 122, 111, 114, 109, 126, 68, 105, 126, 107, 116, 105, 111, 114, 117, 124, 21, 16, 26, 3, 43, 21, 26, 16, 6, 27, 29, 16, 43, 1, 22, 2, 6, 23, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 79, 73, 95, 101, 89, 91, 89, 82, 95, 101, 87, 85, 94, 79, 86, 95, 101, 92, 85, 72, 101, 83, 87, 91, 93, 95, 73, 51, 54, 60, 37, 13, 51, 60, 54, 32, Base64.padSymbol, 59, 54, 13, 39, 33, 55, 13, 33, 38, 55, 51, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 13, 59, Utf8.REPLACEMENT_BYTE, 51, 53, 55, 13, 54, 55, 49, Base64.padSymbol, 54, 59, 60, 53, 35, 38, 44, 53, 29, 35, 44, 38, 48, 45, 43, 38, 29, 53, 42, 43, 54, 39, 46, 43, 49, 54, 39, 38, 29, 43, 44, 54, 39, 44, 54, 29, 55, 48, 46, 29, 50, 48, 39, 36, 43, 58, 39, 49, 26, 31, 21, 12, 36, 26, 8, 8, 30, 15, 36, 29, 30, 15, 24, 19, 18, 21, 28, 36, 14, 21, 18, 29, 18, 30, 31, 66, 71, 77, 84, 124, 65, 66, 77, 77, 70, 81, 124, 77, 76, 87, 74, 69, 90, 124, 66, 71, 124, 79, 76, 66, 71, 70, 71, 124, 76, 77, 124, 66, 80, 80, 70, 87, 80, 124, 79, 76, 66, 71, 70, 71, 52, 49, 59, 34, 10, 55, 48, 59, 54, Base64.padSymbol, 56, 52, 39, 62, 10, 39, 48, 37, 58, 39, 33, 10, 60, 59, 33, 48, 39, 35, 52, 57, 10, 56, 38, 37, 32, 42, 51, 27, 38, 40, 43, 39, 47, 27, 40, 43, 39, 47, 55, 39, 54, 33, 33, 42, 89, 92, 86, 79, 103, 91, 84, 81, 91, 83, 75, 103, 75, 93, 91, 87, 86, 92, 103, 91, 80, 89, 86, 86, 93, 84, 103, 93, 86, 89, 90, 84, 93, 92, 87, 82, 88, 65, 105, 85, 68, 87, 69, 94, 105, 69, 94, 95, 83, 90, 82, 105, 83, 88, 87, 84, 90, 83, 82, 58, Utf8.REPLACEMENT_BYTE, 53, 44, 4, 56, 47, 58, 4, 58, 53, 50, 54, 58, 47, 50, 52, 53, 4, Utf8.REPLACEMENT_BYTE, 62, 55, 58, 34, 4, 54, 40, 47, 42, 32, 57, 17, 45, 58, 47, 17, 35, 39, 32, 17, Base64.padSymbol, 45, 47, 34, 43, 17, 47, 32, 39, 35, 47, 58, 39, 33, 32, 17, 62, 43, 60, 45, 43, 32, 58, 47, 41, 43, 10, 15, 5, 28, 52, 15, 4, 52, 7, 14, 24, 24, 52, 24, 31, 25, 2, 8, 31, 52, 24, 14, 8, 4, 5, 15, 52, 8, 3, 10, 5, 5, 14, 7, 52, 2, 6, 27, 65, 68, 78, 87, 127, 69, 78, 65, 66, 76, 69, 127, 65, 85, 84, 79, 127, 68, 69, 83, 84, 82, 79, 89, 127, 76, 69, 65, 75, 83, 94, 91, 81, 72, 96, 90, 81, 94, 93, 83, 90, 96, 93, 86, 91, 91, 90, 77, 96, 75, 80, 84, 90, 81, 96, 86, 81, 89, 80, 24, 29, 23, 14, 38, 28, 23, 24, 27, 21, 28, 38, 29, 28, 27, 12, 30, 38, 22, 15, 28, 11, 21, 24, 0, 13, 8, 2, 27, 51, 9, 2, 13, 14, 0, 9, 51, 9, 20, 3, 28, 0, 13, 21, 9, 30, 51, 15, 13, 15, 4, 9, 77, 72, 66, 91, 115, 73, 66, 77, 78, SignedBytes.MAX_POWER_OF_TWO, 73, 115, 73, 84, 67, 92, SignedBytes.MAX_POWER_OF_TWO, 77, 85, 73, 94, 115, 79, 77, 79, 68, 73, 115, 74, 67, 94, 115, 72, 95, SignedBytes.MAX_POWER_OF_TWO, 27, 30, 20, 13, 37, 31, 20, 27, 24, 22, 31, 37, 31, 2, 21, 10, 22, 27, 3, 31, 8, 37, 12, 72, 100, 97, 107, 114, 90, 96, 107, 100, 103, 105, 96, 90, 99, 112, 107, 107, 96, 105, 79, 74, SignedBytes.MAX_POWER_OF_TWO, 89, 113, 75, SignedBytes.MAX_POWER_OF_TWO, 79, 76, 66, 75, 113, 71, SignedBytes.MAX_POWER_OF_TWO, 66, 71, SignedBytes.MAX_POWER_OF_TWO, 75, 113, 86, 113, 65, 91, 90, 113, SignedBytes.MAX_POWER_OF_TWO, 65, SignedBytes.MAX_POWER_OF_TWO, 113, 72, 91, 66, 66, 93, 77, 92, 75, 75, SignedBytes.MAX_POWER_OF_TWO, 113, 65, SignedBytes.MAX_POWER_OF_TWO, 113, 93, 74, 69, 96, 101, 111, 118, 94, 100, 111, 96, 99, 109, 100, 94, 111, 100, 117, 118, 110, 115, 106, 15, 10, 0, 25, 49, 11, 0, 15, 12, 2, 11, 49, 30, 28, 11, 2, 1, 15, 10, 20, 17, 27, 2, 42, 16, 27, 20, 23, 25, 16, 42, 7, 20, 18, 16, 42, 6, 29, 20, 30, 16, 117, 112, 122, 99, 75, 113, 122, 117, 118, 120, 113, 75, 103, 109, 122, 119, 121, 124, 118, 111, 71, 125, 118, 124, 71, 123, 121, 106, 124, 107, 71, 123, 116, 113, 123, 115, 121, 122, 116, 125, 123, 126, 116, 109, 69, 127, 98, 106, 117, 105, 127, 69, 108, 115, 126, 127, 117, 69, 109, 123, 110, 121, 114, 69, 110, 115, 119, 127, 43, 46, 36, Base64.padSymbol, 21, 44, 40, 21, 45, 58, 21, 37, 60, 47, 56, 38, 43, 51, 21, 57, 47, 41, Utf8.REPLACEMENT_BYTE, 
        56, 47, 30, 37, 33, 47, 36, 56, Base64.padSymbol, 55, 46, 6, Utf8.REPLACEMENT_BYTE, 59, 6, 62, 41, 6, 54, 47, 60, 43, 53, 56, 32, 6, 47, 60, 43, 42, 48, 54, 55, 109, 104, 98, 123, 83, 106, 101, 96, 120, 105, 126, 83, 110, 101, 104, 104, 101, 98, 107, 83, 120, 99, 103, 105, 98, 10, 15, 5, 28, 52, 13, 4, 25, 8, 14, 52, 15, 14, 29, 2, 8, 14, 52, 24, 8, 25, 14, 14, 5, 52, 10, 7, 28, 10, 18, 24, 52, 4, 5, 100, 97, 107, 114, 90, 98, 117, 90, 106, 115, 96, 119, 105, 100, 124, 90, 96, 107, 100, 103, 105, 96, 97, 0, 5, 15, 22, 62, 8, 0, 3, 62, 2, 20, 18, 21, 14, 12, 62, 18, 2, 9, 4, 12, 0, 18, 62, 7, 8, 25, 62, 4, 15, 0, 3, 13, 4, 5, 23, 18, 24, 1, 41, 31, 27, 6, 5, 41, 5, 19, 21, 25, 24, 18, 41, 21, 30, 23, 24, 24, 19, 26, 41, 19, 24, 23, 20, 26, 19, 18, 52, 49, 59, 34, 10, 60, 59, 33, 10, 60, 56, 52, 50, 48, 10, 52, 38, 10, 54, 33, 52, 10, 48, 59, 52, 55, 57, 48, 49, 81, 84, 94, 71, 111, 89, 94, 68, 111, 89, 93, 81, 87, 85, 111, 81, 67, 111, 83, 68, 81, 111, 89, 94, 94, 85, 66, 111, 67, 65, 69, 81, 66, 85, 115, 118, 124, 101, 77, 123, 124, 102, 77, 96, 100, 77, 123, 124, 97, 102, 115, 126, 126, 77, 123, 124, 100, 115, 126, 123, 118, 115, 102, 123, 125, 124, 97, Base64.padSymbol, 56, 50, 43, 3, 53, 50, 40, 3, 46, 42, 3, 42, 53, 56, 57, 51, 3, Base64.padSymbol, 47, 3, Utf8.REPLACEMENT_BYTE, 40, Base64.padSymbol, 3, 57, 50, Base64.padSymbol, 62, 48, 57, 56, 71, 66, 72, 81, 121, 79, 72, 82, 121, 84, 80, 121, 80, 79, 66, 67, 73, 121, 71, 85, 121, 69, 82, 71, 121, 79, 72, 72, 67, 84, 121, 85, 87, 83, 71, 84, 67, 99, 102, 108, 117, 93, 107, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 93, 108, 103, 117, 93, 107, 111, 99, 101, 103, 93, 102, 103, 113, 107, 101, 108, 58, Utf8.REPLACEMENT_BYTE, 53, 44, 4, 55, 52, 60, 4, 56, 40, 4, 56, 54, 43, 121, 124, 118, 111, 71, 116, 119, 127, 127, 113, 118, 127, 71, 125, 118, 124, 104, 119, 113, 118, 108, 71, 104, 106, 125, 126, 113, 96, 34, 39, 45, 52, 28, 45, 34, 55, 42, 53, 38, 28, 32, 34, 49, 44, 54, 48, 38, 47, 28, 32, 44, 46, 51, 34, 32, 55, 28, 55, 43, 49, 38, 48, 43, 44, 47, 39, 25, 28, 22, 15, 39, 22, 25, 12, 17, 14, 29, 39, 14, 17, 28, 29, 23, 39, 20, 23, 23, 8, 17, 22, 31, 39, 29, 22, 25, 26, 20, 29, 28, 94, 91, 81, 72, 96, 81, 94, 75, 86, 73, 90, 96, 73, 86, 90, 72, 96, 76, 81, 94, 79, 76, 87, 80, 75, 96, 83, 80, 88, 88, 86, 81, 88, 96, 90, 81, 94, 93, 83, 90, 91, 44, 41, 35, 58, 18, 34, 35, 41, 40, 59, 36, 46, 40, 18, 37, 36, 62, 57, 34, Utf8.REPLACEMENT_BYTE, 52, 18, 41, 44, 57, 44, 18, 40, 35, 44, 47, 33, 40, 41, 32, 37, 47, 54, 30, 46, 49, 36, 47, 30, 39, 35, 30, 32, 49, 49, 30, 32, 45, 54, 32, 56, 50, 125, 120, 114, 107, 67, 108, 112, 125, 101, 125, 126, 112, 121, 67, 127, 112, 117, 127, 119, 67, 113, 125, 100, 67, 120, 121, 112, 125, 101, 67, 113, 111, 68, 65, 75, 82, 122, 85, 73, 68, 92, 68, 71, 73, SignedBytes.MAX_POWER_OF_TWO, 122, 65, 76, 86, 68, 71, 73, SignedBytes.MAX_POWER_OF_TWO, 122, 87, SignedBytes.MAX_POWER_OF_TWO, 72, 74, 81, SignedBytes.MAX_POWER_OF_TWO, 122, 74, 75, 122, 75, SignedBytes.MAX_POWER_OF_TWO, 81, 82, 74, 87, 78, 122, 73, 74, 86, 86, 34, 39, 45, 52, 28, 51, 47, 34, 58, 34, 33, 47, 38, 48, 28, 47, 44, 36, 36, 42, 45, 36, 28, 38, 45, 34, 33, 47, 38, 39, 10, 15, 5, 28, 52, 27, 7, 10, 18, 10, 9, 7, 14, 24, 52, 5, 14, 28, 52, 15, 14, 24, 2, 12, 5, 46, 43, 33, 56, 16, Utf8.REPLACEMENT_BYTE, 35, 46, 54, 46, 45, 35, 42, 60, 16, 60, 39, 32, 56, 16, 42, 33, 43, 44, 46, Base64.padSymbol, 43, 1, 4, 14, 23, Utf8.REPLACEMENT_BYTE, 16, 18, 5, 12, 15, 1, 4, Utf8.REPLACEMENT_BYTE, 9, 14, 20, 5, 18, 19, 20, 9, 20, 9, 1, 12, Utf8.REPLACEMENT_BYTE, 4, 25, 14, 1, 13, 9, 3, Utf8.REPLACEMENT_BYTE, 23, 5, 2, 22, 9, 5, 23, 52, 49, 59, 34, 10, 37, 39, 48, 57, 58, 52, 49, 10, 59, 52, 33, 60, 35, 48, 10, 49, 44, 59, 52, 56, 60, 54, 10, 34, 48, 55, 35, 60, 48, 34, 76, 73, 67, 90, 114, 93, 95, 72, 65, 66, 76, 73, 114, 95, 91, 114, 73, 84, 67, 76, SignedBytes.MAX_POWER_OF_TWO, 68, 78, 114, 90, 72, 79, 91, 68, 72, 90, 12, 9, 3, 26, 50, 29, 31, 8, 27, 8, 3, 25, 50, 29, 1, 12, 20, 12, 15, 1, 8, 50, 12, 24, 25, 2, 50, 14, 1, 4, 14, 6, 79, 74, SignedBytes.MAX_POWER_OF_TWO, 89, 113, 94, 91, 92, 73, 75, 113, 65, SignedBytes.MAX_POWER_OF_TWO, 113, 26, 31, 29, 113, 92, 75, 93, 94, 65, SignedBytes.MAX_POWER_OF_TWO, 93, 75, 55, 50, 56, 33, 9, 36, 51, 53, 57, 59, 38, 35, 34, 51, 9, 52, 34, 9, 55, 48, 34, 51, 36, 9, 51, 46, 34, 36, 55, 37, 9, 53, 62, 55, 56, 49, 51, 126, 123, 113, 104, SignedBytes.MAX_POWER_OF_TWO, 109, 105, SignedBytes.MAX_POWER_OF_TWO, 125, 106, 121, 121, 122, 109, SignedBytes.MAX_POWER_OF_TWO, 124, 119, 122, 124, 116, SignedBytes.MAX_POWER_OF_TWO, 122, 113, 126, 125, 115, 122, 123, 3, 6, 12, 21, Base64.padSymbol, 16, 20, Base64.padSymbol, 18, 14, 3, 27, 0, 3, 1, 9, Base64.padSymbol, 1, 16, 
        3, 17, 10, Base64.padSymbol, 4, 3, 14, 14, 0, 3, 1, 9, 121, 124, 118, 111, 71, 107, 125, 118, 124, 113, 118, 127, 71, 126, 106, 125, 105, 109, 125, 118, 123, 97, 71, 123, 121, 104, 104, 113, 118, 127, 71, 121, 116, 116, 119, 111, 125, 124, 33, 36, 46, 55, 31, 51, 37, 52, 31, 52, 37, 56, 52, 31, 35, 47, 44, 47, 50, 31, 36, 57, 46, 33, 45, 41, 35, 33, 44, 44, 57, 104, 109, 103, 126, 86, 122, 97, 102, 124, 101, 109, 86, 104, 109, 109, 86, 108, 113, 125, 108, 103, 122, 96, 102, 103, 86, 125, 102, 86, 121, 101, 104, 112, 104, 107, 101, 108, 122, 7, 2, 8, 17, 57, 21, 14, 9, 19, 10, 2, 57, 5, 10, 3, 7, 20, 57, 0, 3, 7, 18, 19, 20, 3, 57, 5, 9, 8, 0, 15, 1, 57, 9, 8, 57, 5, 20, 7, 21, 14, 3, 21, 98, 103, 109, 116, 92, 112, 107, 108, 118, 111, 103, 92, 106, 100, 109, 108, 113, 102, 92, 103, 102, 112, 119, 113, 108, 122, 92, 96, 98, 111, 111, 123, 126, 116, 109, 69, 105, 114, 117, 111, 118, 126, 69, 115, 116, 121, 104, 127, 119, 127, 116, 110, 69, 104, 127, 110, 104, 99, 69, 121, 117, 111, 116, 110, 127, 104, 69, 117, 116, 69, 127, 119, 106, 110, 99, 69, 104, 127, 105, 106, 117, 116, 105, 127, 35, 38, 44, 53, 29, 49, 42, 45, 55, 46, 38, 29, 43, 44, 43, 54, 29, 36, 48, 45, 47, 29, 33, 45, 44, 54, 39, 44, 54, 29, 50, 48, 45, 52, 43, 38, 39, 48, 96, 101, 111, 118, 94, 114, 105, 110, 116, 109, 101, 94, 104, 111, 104, 117, 94, 110, 111, 94, 98, 109, 96, 114, 114, 94, 109, 110, 96, 101, 104, 111, 102, 106, 111, 101, 124, 84, 120, 99, 100, 126, 103, 111, 84, 103, 100, 108, 84, 106, 120, 120, 110, 127, 84, 126, 121, 103, 69, SignedBytes.MAX_POWER_OF_TWO, 74, 83, 123, 87, 76, 75, 81, 72, SignedBytes.MAX_POWER_OF_TWO, 123, 84, 86, 65, 71, 75, 73, 84, 81, 80, 65, 123, 70, 77, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 65, 86, 123, 80, 75, 79, 65, 74, 83, 86, 92, 69, 109, 65, 89, 91, 66, 109, 68, 91, 86, 87, 93, 109, 92, 93, 92, 109, 90, 83, SignedBytes.MAX_POWER_OF_TWO, 86, 69, 83, SignedBytes.MAX_POWER_OF_TWO, 87, 109, 83, 81, 81, 87, 94, 87, SignedBytes.MAX_POWER_OF_TWO, 83, 70, 87, 86, 115, 118, 124, 101, 77, 97, 98, 126, 123, 102, 77, 97, 113, 96, 119, 119, 124, 77, 119, 124, 115, 112, 126, 119, 118, 77, 36, 77, 35, 36, 125, 120, 114, 107, 67, 111, 104, 125, 127, 119, 104, 110, 125, 127, 121, 67, 123, 110, 115, 105, 108, 117, 114, 123, 67, 121, 114, 125, 126, 112, 121, 120, 54, 51, 57, 32, 8, 36, 46, 57, 52, 8, 54, 49, 35, 50, 37, 8, 54, 51, 8, 59, 56, 54, 51, 72, 77, 71, 94, 118, 90, 80, 71, 74, 118, 76, 71, 77, 89, 70, SignedBytes.MAX_POWER_OF_TWO, 71, 93, 118, 89, 91, 76, 79, SignedBytes.MAX_POWER_OF_TWO, 81, 50, 55, Base64.padSymbol, 36, 12, 39, 58, 62, 54, 12, 39, 60, 12, 36, 50, 58, 39, 12, 53, 60, 33, 12, 37, 58, 55, 54, 60, 12, 35, Utf8.REPLACEMENT_BYTE, 50, 42, 12, 62, 32, 53, 48, 58, 35, 11, 32, Base64.padSymbol, 57, 49, 11, 32, 59, 11, 35, 53, Base64.padSymbol, 32, 11, 50, 59, 38, 11, 34, Base64.padSymbol, 48, 49, 59, 11, 36, 38, 49, 36, 53, 38, 49, 48, 11, 57, 39, 113, 116, 126, 103, 79, 100, 121, 125, 117, 127, 101, 100, 79, 98, 117, 103, 113, 98, 116, 117, 116, 79, 102, 121, 116, 117, 127, 30, 27, 17, 8, 32, 11, 13, 22, 24, 24, 26, 13, 32, 17, 30, 11, 22, 9, 26, 32, 13, 26, 24, 22, 12, 11, 26, 13, 32, 9, 22, 26, 8, 32, 26, 13, 13, 16, 13, 32, 28, 30, 19, 19, 29, 30, 28, 20, 34, 39, 45, 52, 28, 54, 45, 42, 50, 54, 38, 28, 39, 33, 28, 45, 34, 46, 38, 28, 51, 38, 49, 28, 51, 49, 44, 32, 38, 48, 48, 31, 26, 16, 9, 33, 11, 14, 26, 31, 10, 27, 33, 27, 6, 10, 12, 31, 33, 22, 23, 16, 10, 13, 33, 24, 17, 12, 33, 29, 22, 31, 23, 16, 23, 16, 25, 25, 28, 22, 15, 39, 13, 11, 29, 39, 25, 8, 8, 39, 28, 17, 31, 29, 11, 12, 39, 25, 8, 17, 75, 78, 68, 93, 117, 95, 89, 79, 117, 73, 75, 73, 66, 79, 78, 117, 79, 82, 79, 73, 95, 94, 69, 88, 117, 76, 69, 88, 117, 68, 79, 94, 93, 69, 88, 65, 105, 108, 102, 127, 87, 125, 123, 109, 87, 107, 105, 107, 96, 109, 108, 87, 109, 112, 109, 107, 125, 124, 103, 122, 87, 97, 102, 87, 107, 105, 107, 96, 109, 87, 101, 105, 102, 105, 111, 109, 122, 42, 47, 37, 60, 20, 62, 56, 46, 20, 57, 34, 59, 59, 39, 46, 20, 42, 37, 34, 38, 42, Utf8.REPLACEMENT_BYTE, 34, 36, 37, 125, 120, 114, 107, 67, 105, 111, 121, 67, 111, 121, 127, 105, 110, 121, 67, 105, 110, 117, 67, 108, 125, 110, 111, 121, 110, 11, 14, 4, 29, 53, 28, 3, 14, 15, 5, 53, 25, 15, 9, 5, 4, 14, 53, 9, 2, 11, 4, 4, 15, 6, 53, 15, 4, 11, 8, 6, 15, 14, 98, 118, 119, 108, 113, 108, 119, 98, 119, 102, 92, 103, 106, 112, 98, 97, 111, 102, 103, 92, 72, 73, 82, 79, 82, 73, 92, 73, 88, 98, 88, 83, 92, 95, 81, 88, 89, 86, 89, 92, 86, 94, 82, SignedBytes.MAX_POWER_OF_TWO, 84, 71, 81, 106, 65, 92, 88, 80, 106, 88, 70, 60, 48, 50, 113, 57, 62, 60, 58, Base64.padSymbol, 48, 48, 52, 113, 62, 59, 44, 113, 25, 
        26, 30, 11, 10, 13, 26, 0, 28, 16, 17, 25, 22, 24, 66, 70, 65, 70, 66, 90, 66, 112, 74, 67, 78, 95, 92, 74, 75, 112, 91, 70, 66, 74, 112, 78, 73, 91, 74, 93, 112, 70, 66, 95, 93, 74, 92, 92, 70, SignedBytes.MAX_POWER_OF_TWO, 65, 17, 10, 19, 19, 124, 107, 125, 122, 124, 103, 109, 122, 107, 106, 81, 106, 111, 122, 111, 81, 126, 124, 97, 109, 107, 125, 125, 103, 96, 105, 81, 109, 97, 99, 108, 103, 96, 111, 122, 103, 97, 96, 125, 41, 46, 59, 57, 49, 5, 46, 40, 59, 57, Utf8.REPLACEMENT_BYTE, 5, 41, 59, 55, 42, 54, Utf8.REPLACEMENT_BYTE, 5, 40, 59, 46, Utf8.REPLACEMENT_BYTE, 20, 11, 6, 7, 13, Base64.padSymbol, 3, 12, 6, Base64.padSymbol, 7, 12, 6, 1, 3, 16, 6, Base64.padSymbol, 3, 23, 22, 13, 16, 13, 22, 3, 22, 7, 6, 6, 6};
    }

    static {
        A0c();
        A04 = new String[0];
        A05 = new String[]{A0R(86, 5, 14), A0R(65, 9, 115), A0R(74, 12, 88)};
    }

    public IP(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0R(4982, 31, 113), context), 0);
    }

    public static float A00(Context context) {
        return A0Q(context).A01(A0R(2538, 39, 96), 0.98f);
    }

    private final float A01(String str, float f2) {
        String string = this.A00.getString(str, String.valueOf(f2));
        if (string != null) {
            try {
                String value = A0R(5050, 4, 81);
                if (string.equals(value)) {
                    return f2;
                }
                f2 = Float.parseFloat(string);
                return f2;
            } catch (NumberFormatException unused) {
                return f2;
            }
        }
        return f2;
    }

    public static int A02(Context context) {
        return A0Q(context).A2P(A0R(417, 33, 88), 100);
    }

    public static int A03(Context context) {
        return A0Q(context).A2P(A0R(2398, 33, 123), 0);
    }

    public static int A04(Context context) {
        return A0Q(context).A2P(A0R(2511, 27, 117), -1);
    }

    public static int A05(Context context) {
        return A0Q(context).A2P(A0R(851, 37, 10), 3);
    }

    public static int A06(Context context) {
        return A0Q(context).A2P(A0R(4964, 18, 27), 0);
    }

    public static int A07(Context context) {
        return A0Q(context).A2P(A0R(597, 36, 113), 3000);
    }

    public static int A08(Context context) {
        return A0Q(context).A2P(A0R(1550, 50, 119), 30000);
    }

    public static int A09(Context context) {
        return A0Q(context).A2P(A0R(1644, 40, 20), 3);
    }

    public static int A0A(Context context) {
        return A0Q(context).A2P(A0R(1600, 44, 25), 8000);
    }

    public static int A0B(Context context) {
        return A0Q(context).A2P(A0R(1684, 48, 123), 100);
    }

    public static int A0C(Context context) {
        return A0Q(context).A2P(A0R(1732, 39, 65), 60000);
    }

    public static int A0D(Context context) {
        return A0Q(context).A2P(A0R(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, 26, 119), -1);
    }

    public static int A0E(Context context) {
        return A0Q(context).A2P(A0R(3424, 38, 109), 225);
    }

    public static int A0F(Context context) {
        return A0Q(context).A2P(A0R(1319, 41, 37), 3145728);
    }

    public static int A0G(Context context) {
        return A0Q(context).A2P(A0R(5013, 37, 1), -1);
    }

    public static int A0H(Context context) {
        return A0Q(context).A2P(A0R(3593, 32, 50), 2000);
    }

    public static int A0I(Context context) {
        return A0Q(context).A2P(A0R(371, 46, 43), -1);
    }

    public static int A0J(Context context) {
        return A0Q(context).A2P(A0R(5093, 23, 116), 0);
    }

    public static int A0K(Context context) {
        return A0Q(context).A2P(A0R(4527, 35, 125), 3000);
    }

    public static int A0L(Context context) {
        return A0Q(context).A2P(A0R(4562, 39, 122), 3000);
    }

    public static int A0M(Context context) {
        return A0Q(context).A2P(A0R(1465, 46, 40), 0);
    }

    public static long A0N(Context context) {
        return A0Q(context).A2Q(A0R(817, 34, 83), 67108864L);
    }

    public static long A0O(Context context) {
        return A0Q(context).A2Q(A0R(972, 45, 49), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public static long A0P(Context context) {
        return A0Q(context).A2Q(A0R(1125, 38, 67), 33554432L);
    }

    public static synchronized IP A0Q(Context context) {
        if (A01 == null) {
            A01 = new IP(context);
        }
        return A01;
    }

    public static String A0S(Context context) {
        return A0Q(context).A2R(A0R(3396, 28, 54), A0R(5144, 3, 95));
    }

    public static String A0T(Context context) {
        return A0Q(context).A2R(A0R(IronSourceConstants.NT_AUCTION_SUCCESS, 25, 7), A0R(5144, 3, 95));
    }

    public static String A0U(Context context) {
        return A0Q(context).A2R(A0R(117, 52, 109), A0R(1, 6, 36));
    }

    public static String A0V(Context context) {
        return A0Q(context).A2R(A0R(268, 51, 11), A0R(24, 41, 29));
    }

    public static String A0W(Context context) {
        return A0Q(context).A2R(A0R(169, 53, 86), A0R(7, 8, 63));
    }

    public static String A0X(Context context) {
        return A0Q(context).A2R(A0R(319, 52, 81), A0R(15, 9, 110));
    }

    public static Set<String> A0Y(Context context) {
        return A0Q(context).A0b(A0R(676, 44, 110), A04);
    }

    public static Set<String> A0Z(Context context) {
        return A0Q(context).A0b(A0R(5054, 39, 32), A05);
    }

    public static Set<String> A0a(Context context) {
        return A0Q(context).A0b(A0R(2282, 44, 108), A04);
    }

    private Set<String> A0b(String str, String[] strArr) {
        JSONArray jSONArray;
        String jsonArrayString = A2R(str, null);
        try {
            if (jsonArrayString != null) {
                jSONArray = new JSONArray(jsonArrayString);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i2 = 0; i2 < length; i2++) {
                linkedHashSet.add(jSONArray.getString(i2));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    public static void A0d(Context context) {
        A0Q(context).A00.edit().clear().commit();
    }

    private void A0e(String str, String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0R(91, 2, 121))) {
            return;
        }
        JSONObject json = new JSONObject(str);
        A0f(json, str2);
    }

    private void A0f(JSONObject jSONObject, String str) throws JSONException {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(A0R(93, 24, 54))) {
                A0e(jSONObject.getString(next), next);
            } else {
                String str2 = next;
                if (str != null) {
                    str2 = str + A0R(0, 1, 108) + str2;
                }
                editorEdit.putString(str2, jSONObject.getString(next));
            }
        }
        editorEdit.apply();
    }

    public static boolean A0g(Context context) {
        return A0Q(context).A2R(A0R(5116, 28, 76), A0R(4927, 19, 45)).equals(A0R(4946, 18, 19));
    }

    public static boolean A0h(Context context) {
        return A0Q(context).A2U(A0R(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 38, 80), false);
    }

    public static boolean A0i(Context context) {
        return A0Q(context).A2U(A0R(3916, 37, 120), false);
    }

    public static boolean A0j(Context context) {
        return A0Q(context).A2U(A0R(633, 43, 63), true);
    }

    public static boolean A0k(Context context) {
        return A0Q(context).A2U(A0R(2645, 29, 17), true);
    }

    public static boolean A0l(Context context) {
        return A0Q(context).A2U(A0R(3724, 27, 97), false);
    }

    public static boolean A0m(Context context) {
        return A0Q(context).A2U(A0R(928, 44, 8), true);
    }

    public static boolean A0n(Context context) {
        return A0Q(context).A2U(A0R(2486, 25, 24), true);
    }

    public static boolean A0o(Context context) {
        return A0Q(context).A2U(A0R(3625, 44, 11), true);
    }

    public static boolean A0p(Context context) {
        return A0Q(context).A2U(A0R(1055, 37, 120), true);
    }

    public static boolean A0q(Context context) {
        return A0Q(context).A2U(A0R(2615, 30, 14), false);
    }

    public static boolean A0r(Context context) {
        return A0Q(context).A2U(A0R(3245, 33, 60), false);
    }

    public static boolean A0s(Context context) {
        return A0Q(context).A2U(A0R(1092, 33, 31), true);
    }

    public static boolean A0t(Context context) {
        return A0Q(context).A2U(A0R(2949, 28, 52), false);
    }

    public static boolean A0u(Context context) {
        return A0Q(context).A2U(A0R(1163, 40, 55), true);
    }

    public static boolean A0v(Context context) {
        return A0Q(context).A2U(A0R(1203, 35, 37), false);
    }

    public static boolean A0w(Context context) {
        return A0Q(context).A2U(A0R(2785, 18, 43), false);
    }

    public static boolean A0x(Context context) {
        return A0Q(context).A2U(A0R(IronSourceConstants.BN_CALLBACK_LEAVE_APP, 35, 79), true);
    }

    public static boolean A0y(Context context) {
        return A0Q(context).A2U(A0R(565, 32, 97), false);
    }

    public static boolean A0z(Context context) {
        return A0Q(context).A2U(A0R(450, 25, 112), false);
    }

    public static boolean A10(Context context) {
        return A0Q(context).A2U(A0R(475, 52, 54), false);
    }

    public static boolean A11(Context context) {
        return A0Q(context).A2U(A0R(3033, 25, 34), false);
    }

    public static boolean A12(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        IP ipA0Q = A0Q(context);
        String strA0R = A0R(2674, 25, 87);
        if (A03[5].charAt(10) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
        strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
        return ipA0Q.A2U(strA0R, false);
    }

    public static boolean A13(Context context) {
        return A0Q(context).A2U(A0R(2925, 24, 54), false);
    }

    public static boolean A14(Context context) {
        return A0Q(context).A2U(A0R(3536, 34, 99), false);
    }

    public static boolean A15(Context context) {
        return A0Q(context).A2U(A0R(3092, 23, 43), false);
    }

    public static boolean A16(Context context) {
        return A0Q(context).A2U(A0R(2977, 30, 100), true);
    }

    public static boolean A17(Context context) {
        return A0Q(context).A2U(A0R(3182, 29, 123), false);
    }

    public static boolean A18(Context context) {
        return A0Q(context).A2U(A0R(3211, 34, 30), false);
    }

    public static boolean A19(Context context) {
        return A0Q(context).A2U(A0R(3278, 32, 114), false);
    }

    public static boolean A1A(Context context) {
        return A0Q(context).A2U(A0R(3310, 37, 8), false);
    }

    public static boolean A1B(Context context) {
        return A0Q(context).A2U(A0R(1391, 23, 8), false);
    }

    public static boolean A1C(Context context) {
        return A0Q(context).A2U(A0R(3495, 41, 17), false);
    }

    public static boolean A1D(Context context) {
        return A0Q(context).A2U(A0R(2887, 22, 91), false);
    }

    public static boolean A1E(Context context) {
        return A0Q(context).A2U(A0R(3953, 28, 49), true);
    }

    public static boolean A1F(Context context) {
        return A0Q(context).A2U(A0R(3981, 31, 76), true);
    }

    public static boolean A1G(Context context) {
        return A0Q(context).A2U(A0R(4417, 30, 60), false);
    }

    public static boolean A1H(Context context) {
        return A0Q(context).A2U(A0R(4447, 32, 50), false);
    }

    public static boolean A1I(Context context) {
        return A0Q(context).A2U(A0R(222, 46, 76), false);
    }

    public static boolean A1J(Context context) {
        return A0Q(context).A2U(A0R(3462, 33, 86), false);
    }

    public static boolean A1K(Context context) {
        return A0Q(context).A2U(A0R(3381, 15, 117), false);
    }

    public static boolean A1L(Context context) {
        return A0Q(context).A2U(A0R(2577, 38, 69), false);
    }

    public static boolean A1M(Context context) {
        return A0Q(context).A2U(A0R(2849, 19, 47), true);
    }

    public static boolean A1N(Context context) {
        return A0Q(context).A2U(A0R(2353, 45, 13), false);
    }

    public static boolean A1O(Context context) {
        return A0Q(context).A2U(A0R(1771, 25, 34), true);
    }

    public static boolean A1P(Context context) {
        return A0Q(context).A2U(A0R(3751, 41, 78), true);
    }

    public static boolean A1Q(Context context) {
        return A0Q(context).A2U(A0R(2868, 19, 64), true);
    }

    public static boolean A1R(Context context) {
        return A0Q(context).A2U(A0R(3792, 35, 123), true);
    }

    public static boolean A1S(Context context) {
        return A0Q(context).A2U(A0R(3827, 31, 3), true);
    }

    public static boolean A1T(Context context) {
        return A0Q(context).A2U(A0R(3858, 32, 67), true);
    }

    public static boolean A1U(Context context) {
        return A0Q(context).A2U(A0R(1796, 45, 117), true);
    }

    public static boolean A1V(Context context) {
        return A0Q(context).A2U(A0R(1841, 57, 108), false);
    }

    public static boolean A1W(Context context) {
        return A0Q(context).A2U(A0R(1898, 59, 20), true);
    }

    public static boolean A1X(Context context) {
        return A0Q(context).A2U(A0R(3150, 32, 88), false);
    }

    public static boolean A1Y(Context context) {
        return A0Q(context).A2U(A0R(4894, 33, 68), false);
    }

    public static boolean A1Z(Context context) {
        return A0Q(context).A2U(A0R(4012, 38, 54), true);
    }

    public static boolean A1a(Context context) {
        return A0Q(context).A2U(A0R(4081, 38, 39), true);
    }

    public static boolean A1b(Context context) {
        return A0Q(context).A2U(A0R(3570, 23, 111), true);
    }

    public static boolean A1c(Context context) {
        return A0Q(context).A2U(A0R(2431, 21, 106), false);
    }

    public static boolean A1d(Context context) {
        return A0Q(context).A2U(A0R(1957, 44, 98), true);
    }

    public static boolean A1e(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0Q(context).A2U(A0R(720, 46, 74), false);
    }

    public static boolean A1f(Context context) {
        return A0Q(context).A2U(A0R(766, 51, 60), true);
    }

    public static boolean A1g(Context context) {
        return A0Q(context).A2U(A0R(IronSourceConstants.NT_CALLBACK_SHOW, 43, 72), true);
    }

    public static boolean A1h(Context context) {
        return A0Q(context).A2U(A0R(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 38, 50), false);
    }

    public static boolean A1i(Context context) {
        return A0Q(context).A2U(A0R(3669, 30, 109), true);
    }

    public static boolean A1j(Context context) {
        return A0Q(context).A2U(A0R(2326, 27, 85), false);
    }

    public static boolean A1k(Context context) {
        return A0Q(context).A2U(A0R(1414, 51, 54), false);
    }

    public static boolean A1l(Context context) {
        return A0Q(context).A2U(A0R(1238, 40, 69), true);
    }

    public static boolean A1m(Context context) {
        return A0Q(context).A2U(A0R(2001, 31, 72), false);
    }

    public static boolean A1n(Context context) {
        return A0Q(context).A2U(A0R(1278, 41, 90), false);
    }

    public static boolean A1o(Context context) {
        return A0Q(context).A2U(A0R(4162, 31, 45), false);
    }

    public static boolean A1p(Context context) {
        return A0Q(context).A2U(A0R(4193, 53, 52), false);
    }

    public static boolean A1q(Context context) {
        return A0Q(context).A2U(A0R(4246, 38, 108), true);
    }

    public static boolean A1r(Context context) {
        return A0Q(context).A2U(A0R(4284, 33, 47), false);
    }

    public static boolean A1s(Context context) {
        return A0Q(context).A2U(A0R(2032, 53, 102), false);
    }

    public static boolean A1t(Context context) {
        return A0Q(context).A2U(A0R(3058, 34, 69), false);
    }

    public static boolean A1u(Context context) {
        return A0Q(context).A2U(A0R(2085, 48, 61), false);
    }

    public static boolean A1v(Context context) {
        return A0Q(context).A2U(A0R(4317, 25, 37), false);
    }

    public static boolean A1w(Context context) {
        return A0Q(context).A2U(A0R(2452, 34, 22), false);
    }

    public static boolean A1x(Context context) {
        return A0Q(context).A2U(A0R(4342, 35, 10), false);
    }

    public static boolean A1y(Context context) {
        return A0Q(context).A2U(A0R(3890, 26, 0), false);
    }

    public static boolean A1z(Context context) {
        return A0Q(context).A2U(A0R(2133, 51, 53), true);
    }

    public static boolean A20(Context context) {
        return A0Q(context).A2U(A0R(4050, 31, 110), false);
    }

    public static boolean A21(Context context) {
        return A0Q(context).A2U(A0R(1360, 31, 100), false);
    }

    public static boolean A22(Context context) {
        return A0Q(context).A2U(A0R(4479, 23, 121), true);
    }

    public static boolean A23(Context context) {
        return A0Q(context).A2U(A0R(4601, 27, 62), false);
    }

    public static boolean A24(Context context) {
        return A0Q(context).A2U(A0R(4707, 36, 80), false);
    }

    public static boolean A25(Context context) {
        return A0Q(context).A2U(A0R(2803, 46, 0), true);
    }

    public static boolean A26(Context context) {
        return A0Q(context).A2U(A0R(3347, 34, 44), false);
    }

    public static boolean A27(Context context) {
        return A0Q(context).A2U(A0R(4843, 25, 101), false);
    }

    public static boolean A28(Context context) {
        return A0Q(context).A2U(A0R(4676, 31, 109), false);
    }

    public static boolean A29(Context context) {
        return A0Q(context).A2U(A0R(4377, 40, 28), true);
    }

    public static boolean A2A(Context context) {
        return A0Q(context).A2U(A0R(2909, 16, 58), true);
    }

    public static boolean A2B(Context context) {
        return A0Q(context).A2U(A0R(4628, 48, 81), false);
    }

    public static boolean A2C(Context context) {
        return A0Q(context).A2U(A0R(4743, 23, 86), true);
    }

    public static boolean A2D(Context context) {
        return A0Q(context).A2U(A0R(2184, 18, 90), false);
    }

    public static boolean A2E(Context context) {
        return A0Q(context).A2U(A0R(2202, 40, 20), false);
    }

    public static boolean A2F(Context context) {
        return A0Q(context).A2U(A0R(4766, 36, 4), false);
    }

    public static boolean A2G(Context context) {
        return A0Q(context).A2U(A0R(4802, 41, 38), true);
    }

    public static boolean A2H(Context context) {
        return A0Q(context).A2U(A0R(888, 40, 46), false);
    }

    public static boolean A2I(Context context) {
        return A0Q(context).A2U(A0R(1511, 39, 51), false);
    }

    public static boolean A2J(Context context) {
        return A0Q(context).A2U(A0R(3699, 25, 69), false);
    }

    public static boolean A2K(Context context) {
        return A0Q(context).A2U(A0R(4868, 26, 50), true);
    }

    public static boolean A2L(Context context) {
        return A0Q(context).A2U(A0R(2242, 40, 124), true);
    }

    public static boolean A2M(Context context, boolean z) {
        return A2O(context, z) && A0Q(context).A2U(A0R(2699, 27, 66), false);
    }

    public static boolean A2N(Context context, boolean z) {
        return Build.VERSION.SDK_INT >= 21 && A2M(context, z) && A0Q(context).A2U(A0R(2726, 35, 2), true);
    }

    public static boolean A2O(Context context, boolean z) {
        return z && Build.VERSION.SDK_INT >= 19 && A0Q(context).A2U(A0R(2761, 24, 84), false);
    }

    public final int A2P(String str, int i2) {
        String string = this.A00.getString(str, String.valueOf(i2));
        if (string != null) {
            try {
                String value = A0R(5050, 4, 81);
                if (string.equals(value)) {
                    return i2;
                }
                i2 = Integer.parseInt(string);
                return i2;
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        return i2;
    }

    public final long A2Q(String str, long j2) {
        String string = this.A00.getString(str, String.valueOf(j2));
        if (string != null) {
            try {
                String value = A0R(5050, 4, 81);
                if (string.equals(value)) {
                    return j2;
                }
                j2 = Long.parseLong(string);
                return j2;
            } catch (NumberFormatException unused) {
                return j2;
            }
        }
        return j2;
    }

    public final String A2R(String str, String str2) {
        String string = this.A00.getString(str, str2);
        if (string == null) {
            return str2;
        }
        String value = A0R(5050, 4, 81);
        return string.equals(value) ? str2 : string;
    }

    public final void A2S(String str) throws JSONException {
        A0e(str, null);
    }

    public final void A2T(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0f(jSONObject, null);
    }

    public final boolean A2U(String str, boolean z) {
        String string = this.A00.getString(str, String.valueOf(z));
        if (string != null) {
            String value = A0R(5050, 4, 81);
            boolean zEquals = string.equals(value);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return zEquals ? z : Boolean.parseBoolean(string);
        }
        return z;
    }
}
