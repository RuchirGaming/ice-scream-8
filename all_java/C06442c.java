package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C06442c {
    public static C06442c A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C06432b>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C06432b>> A03 = new HashMap<>();
    public final ArrayList<C06422a> A02 = new ArrayList<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, 27, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, 28, 48, Base64.padSymbol, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, 14, -1, 1, 9, 12, 19, 9, 6, 25, 6, 29, 34, 25, 14, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C06442c(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2Z
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        this.A00.A02();
                        break;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        };
    }

    public static C06442c A00(Context context) {
        C06442c c06442c;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C06442c(context.getApplicationContext());
            }
            c06442c = A05;
        }
        return c06442c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C06422a[] c06422aArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c06422aArr = new C06422a[size];
                    this.A02.toArray(c06422aArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C06422a c06422a : c06422aArr) {
                int j2 = c06422a.A01.size();
                for (int nbr = 0; nbr < j2; nbr++) {
                    C06432b c06432b = c06422a.A01.get(nbr);
                    if (!c06432b.A01) {
                        c06432b.A02.onReceive(this.A00, c06422a.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C06432b> arrayListRemove = this.A04.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                C06432b c06432b = arrayListRemove.get(size);
                c06432b.A01 = true;
                for (int j2 = 0; j2 < c06432b.A03.countActions(); j2++) {
                    String action = c06432b.A03.getAction(j2);
                    ArrayList<C06432b> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i2 = arrayList.size();
                        for (int i3 = i2 - 1; i3 >= 0; i3--) {
                            C06432b c06432b2 = arrayList.get(i3);
                            if (c06432b2.A02 == broadcastReceiver) {
                                c06432b2.A01 = true;
                                arrayList.remove(i3);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C06432b c06432b = new C06432b(intentFilter, broadcastReceiver);
            ArrayList<C06432b> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c06432b);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<C06432b> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c06432b);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String str;
        String strA01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String type = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                String str2 = A01(128, 15, 14) + strResolveTypeIfNeeded + A01(62, 8, 14) + type + A01(51, 11, 42) + intent;
            }
            ArrayList<C06432b> arrayList = this.A03.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    String str3 = A01(70, 13, 23) + arrayList;
                }
                ArrayList arrayList2 = null;
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    C06432b c06432b = arrayList.get(i2);
                    if (z) {
                        String str4 = A01(104, 24, 48) + c06432b.A03;
                    }
                    if (!c06432b.A00) {
                        str = strResolveTypeIfNeeded;
                        int iMatch = c06432b.A03.match(action, strResolveTypeIfNeeded, type, data, categories, A01(83, 21, 127));
                        if (iMatch >= 0) {
                            if (z) {
                                String str5 = A01(24, 27, 33) + Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c06432b);
                            c06432b.A00 = true;
                        } else if (z) {
                            switch (iMatch) {
                                case -4:
                                    strA01 = A01(149, 8, 74);
                                    break;
                                case -3:
                                    strA01 = A01(143, 6, 60);
                                    break;
                                case -2:
                                    strA01 = A01(157, 4, 85);
                                    break;
                                case -1:
                                    strA01 = A01(161, 4, 89);
                                    break;
                                default:
                                    strA01 = A01(165, 14, 6);
                                    break;
                            }
                            String str6 = A01(0, 24, 28) + strA01;
                        }
                    } else if (z) {
                        str = strResolveTypeIfNeeded;
                    } else {
                        str = strResolveTypeIfNeeded;
                    }
                    i2++;
                    strResolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((C06432b) arrayList2.get(i3)).A00 = false;
                    }
                    this.A02.add(new C06422a(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
