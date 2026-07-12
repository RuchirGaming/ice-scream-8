package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class AppLovinBroadcastManager {
    private static final Map<Receiver, ArrayList<b>> azG = new HashMap();
    private static final Map<String, ArrayList<b>> azH = new HashMap();
    private static final ArrayList<a> azI = new ArrayList<>();
    private static final Handler acG = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.AT();
            } else {
                super.handleMessage(message);
            }
        }
    };

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    private static class b {
        final IntentFilter azM;
        final Receiver azN;
        boolean azO;
        boolean azP;

        b(IntentFilter intentFilter, Receiver receiver) {
            this.azM = intentFilter;
            this.azN = receiver;
        }
    }

    private static class a {
        final Intent azJ;
        final Map<String, Object> azK;
        final List<b> azL;

        a(Intent intent, Map<String, Object> map, List<b> list) {
            this.azJ = intent;
            this.azK = map;
            this.azL = list;
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map<Receiver, ArrayList<b>> map = azG;
        synchronized (map) {
            b bVar = new b(intentFilter, receiver);
            ArrayList<b> arrayList = map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            while (itActionsIterator.hasNext()) {
                String next = itActionsIterator.next();
                Map<String, ArrayList<b>> map2 = azH;
                ArrayList<b> arrayList2 = map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map<Receiver, ArrayList<b>> map = azG;
        synchronized (map) {
            ArrayList<b> arrayListRemove = map.remove(receiver);
            if (arrayListRemove == null) {
                return;
            }
            for (b bVar : arrayListRemove) {
                bVar.azP = true;
                Iterator<String> itActionsIterator = bVar.azM.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    ArrayList<b> arrayList = azH.get(next);
                    if (arrayList != null) {
                        Iterator<b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().azN == receiver) {
                                bVar.azP = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            azH.remove(next);
                        }
                    }
                }
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (azG) {
            List<b> listA = a(intent);
            if (listA == null) {
                return false;
            }
            azI.add(new a(intent, map, listA));
            Handler handler = acG;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<b> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (b bVar : listA) {
            if (!bVar.azP) {
                bVar.azN.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            AT();
        }
    }

    private static List<b> a(Intent intent) {
        synchronized (azG) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<b> arrayList = azH.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList arrayList2 = null;
            for (b bVar : arrayList) {
                if (!bVar.azO && bVar.azM.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(bVar);
                    bVar.azO = true;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            Iterator<b> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().azO = false;
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AT() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (azG) {
                ArrayList<a> arrayList = azI;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                arrayList.toArray(aVarArr);
                arrayList.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = aVarArr[i2];
                if (aVar != null) {
                    for (b bVar : aVar.azL) {
                        if (bVar != null && !bVar.azP) {
                            bVar.azN.onReceive(aVar.azJ, aVar.azK);
                        }
                    }
                }
            }
        }
    }
}
