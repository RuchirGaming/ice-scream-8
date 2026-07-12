package cn.thinkinganalyticsclone.android.aop.push;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TANotificationInfo {
    String content;
    long time;
    String title;

    TANotificationInfo(String title, String content, long time) {
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public static TANotificationInfo fromJson(String json) {
        try {
            JSONObject jSONObject = new JSONObject(json);
            return new TANotificationInfo(jSONObject.optString("title"), jSONObject.optString("content"), jSONObject.optLong("time"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", this.title);
            jSONObject.put("content", this.content);
            jSONObject.put("time", this.time);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
