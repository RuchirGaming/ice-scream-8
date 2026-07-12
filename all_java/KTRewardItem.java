package com.ktplay.open;

import com.ktplay.b.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class KTRewardItem {
    public String icon;
    public String name;
    public String typeId;
    public long value;

    void copyFromObject(Object obj) {
        if (obj != null) {
            this.typeId = (String) a.a(obj, "getTypeId", null, new Object[0]);
            this.value = ((Long) a.a(obj, "getValue", null, new Object[0])).longValue();
            this.name = (String) a.a(obj, "getName", null, new Object[0]);
            this.icon = (String) a.a(obj, "getIcon", null, new Object[0]);
        }
    }

    public static KTRewardItem createFromJSON(JSONObject jSONObject) {
        KTRewardItem kTRewardItem = new KTRewardItem();
        kTRewardItem.parse(jSONObject);
        return kTRewardItem;
    }

    public String getTypeId() {
        return this.typeId;
    }

    public void setTypeId(String str) {
        this.typeId = str;
    }

    public long getValue() {
        return this.value;
    }

    public void setValue(long j2) {
        this.value = j2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    void parse(JSONObject jSONObject) {
        fromJSON(jSONObject, "");
    }

    public void fromJSON(JSONObject jSONObject, String str) {
        this.typeId = jSONObject.optString("id");
        this.name = jSONObject.optString("name");
        this.value = jSONObject.optLong("value");
        this.icon = jSONObject.optString(CampaignEx.JSON_KEY_ICON_URL);
    }

    public String getId() {
        return this.typeId;
    }
}
