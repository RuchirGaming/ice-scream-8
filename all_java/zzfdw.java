package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import io.bidmachine.utils.IabUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzfdw {
    private String zza;

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    zzfdw(JsonReader jsonReader) throws IOException {
        byte b2;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (strNextName.equals(IabUtils.KEY_DESCRIPTION)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                jsonReader.nextInt();
            } else if (b2 != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = strNextString;
    }

    public final String zza() {
        return this.zza;
    }
}
