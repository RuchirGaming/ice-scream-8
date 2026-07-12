package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.ironsource.sdk.constants.a;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zziq {
    public static final zziq zza = new zziq(null, null, 100);
    private final EnumMap<zza, zzit> zzb;
    private final int zzc;

    static String zza(int i2) {
        if (i2 == -30) {
            return "TCF";
        }
        if (i2 == -20) {
            return "API";
        }
        if (i2 == -10) {
            return "MANIFEST";
        }
        if (i2 == 0) {
            return "1P_API";
        }
        if (i2 == 30) {
            return "1P_INIT";
        }
        if (i2 != 90) {
            return i2 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static boolean zza(int i2, int i3) {
        return ((i2 == -20 && i3 == -30) || ((i2 == -30 && i3 == -20) || i2 == i3)) || i2 < i3;
    }

    static char zza(zzit zzitVar) {
        if (zzitVar == null) {
            return '-';
        }
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final int hashCode() {
        int iHashCode = this.zzc * 17;
        Iterator<zzit> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzb((zzit) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zza) entry.getKey()).zze, strZzb);
            }
        }
        return bundle;
    }

    static zzit zza(String str) {
        if (str == null) {
            return zzit.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzit.GRANTED;
        }
        if (str.equals("denied")) {
            return zzit.DENIED;
        }
        return zzit.UNINITIALIZED;
    }

    public final zzit zzc() {
        zzit zzitVar = this.zzb.get(zza.AD_STORAGE);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    public final zzit zzd() {
        zzit zzitVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    static zzit zza(char c2) {
        if (c2 == '+') {
            return zzit.DEFAULT;
        }
        if (c2 == '0') {
            return zzit.DENIED;
        }
        if (c2 == '1') {
            return zzit.GRANTED;
        }
        return zzit.UNINITIALIZED;
    }

    static zzit zza(Boolean bool) {
        if (bool == null) {
            return zzit.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzit.GRANTED;
        }
        return zzit.DENIED;
    }

    public static zziq zza(Bundle bundle, int i2) {
        if (bundle == null) {
            return new zziq(null, null, i2);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzis.STORAGE.zzd) {
            enumMap.put(zzaVar, zza(bundle.getString(zzaVar.zze)));
        }
        return new zziq(enumMap, i2);
    }

    public static zziq zza(zzit zzitVar, zzit zzitVar2, int i2) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put(zza.AD_STORAGE, zzitVar);
        enumMap.put(zza.ANALYTICS_STORAGE, zzitVar2);
        return new zziq(enumMap, -10);
    }

    public static zziq zzb(String str) {
        return zza(str, 100);
    }

    public static zziq zza(String str, int i2) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zzaVarArrZza = zzis.STORAGE.zza();
        for (int i3 = 0; i3 < zzaVarArrZza.length; i3++) {
            zza zzaVar = zzaVarArrZza[i3];
            int i4 = i3 + 2;
            if (i4 < str.length()) {
                enumMap.put(zzaVar, zza(str.charAt(i4)));
            } else {
                enumMap.put(zzaVar, zzit.UNINITIALIZED);
            }
        }
        return new zziq(enumMap, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    public final zziq zza(zziq zziqVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzis.STORAGE.zzd) {
            zzit zzitVar = this.zzb.get(zzaVar);
            zzit zzitVar2 = zziqVar.zzb.get(zzaVar);
            if (zzitVar == null) {
                zzitVar = zzitVar2;
            } else if (zzitVar2 != null) {
                if (zzitVar == zzit.UNINITIALIZED) {
                    zzitVar = zzitVar2;
                } else if (zzitVar2 != zzit.UNINITIALIZED) {
                    if (zzitVar == zzit.DEFAULT) {
                        zzitVar = zzitVar2;
                    } else if (zzitVar2 != zzit.DEFAULT) {
                        zzitVar = (zzitVar == zzit.DENIED || zzitVar2 == zzit.DENIED) ? zzit.DENIED : zzit.GRANTED;
                    }
                }
            }
            if (zzitVar != null) {
                enumMap.put(zzaVar, zzitVar);
            }
        }
        return new zziq(enumMap, 100);
    }

    public final zziq zzb(zziq zziqVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzis.STORAGE.zzd) {
            zzit zzitVar = this.zzb.get(zzaVar);
            if (zzitVar == zzit.UNINITIALIZED) {
                zzitVar = zziqVar.zzb.get(zzaVar);
            }
            if (zzitVar != null) {
                enumMap.put(zzaVar, zzitVar);
            }
        }
        return new zziq(enumMap, this.zzc);
    }

    public final Boolean zze() {
        zzit zzitVar = this.zzb.get(zza.AD_STORAGE);
        if (zzitVar == null) {
            return null;
        }
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return true;
    }

    public final Boolean zzf() {
        zzit zzitVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zzitVar == null) {
            return null;
        }
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return true;
    }

    static String zzb(zzit zzitVar) {
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static String zza(Bundle bundle) {
        String string;
        zza[] zzaVarArr = zzis.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i2 = 0;
        while (true) {
            Boolean bool = null;
            if (i2 >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i2];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string != null) {
                    if (string.equals("granted")) {
                        bool = Boolean.TRUE;
                    } else if (string.equals("denied")) {
                        bool = Boolean.FALSE;
                    }
                }
                if (bool == null) {
                    return string;
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String zzg() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzis.STORAGE.zza()) {
            zzit zzitVar = this.zzb.get(zzaVar);
            char c2 = '-';
            if (zzitVar != null && (iOrdinal = zzitVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzis.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        for (zza zzaVar : zzis.STORAGE.zzd) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append(a.i.f17746b);
            zzit zzitVar = this.zzb.get(zzaVar);
            if (zzitVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzitVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("default");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        return sb.toString();
    }

    private zziq(EnumMap<zza, zzit> enumMap, int i2) {
        EnumMap<zza, zzit> enumMap2 = new EnumMap<>(zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i2;
    }

    public zziq(Boolean bool, Boolean bool2, int i2) {
        EnumMap<zza, zzit> enumMap = new EnumMap<>(zza.class);
        this.zzb = enumMap;
        enumMap.put(zza.AD_STORAGE, zza(bool));
        enumMap.put(zza.ANALYTICS_STORAGE, zza(bool2));
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        for (zza zzaVar : zzis.STORAGE.zzd) {
            if (this.zzb.get(zzaVar) != zziqVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zziqVar.zzc;
    }

    public final boolean zza(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zziqVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzi() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzit.DENIED;
    }

    public final boolean zzj() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzk() {
        Iterator<zzit> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzit.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zziq zziqVar) {
        return zzb(zziqVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public final boolean zzb(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzit zzitVar = this.zzb.get(zzaVar);
            zzit zzitVar2 = zziqVar.zzb.get(zzaVar);
            if (zzitVar == zzit.DENIED && zzitVar2 != zzit.DENIED) {
                return true;
            }
        }
        return false;
    }
}
