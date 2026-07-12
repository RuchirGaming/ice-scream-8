package cn.thinkinganalyticsclone.android;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ScreenAutoTracker {
    String getScreenUrl();

    JSONObject getTrackProperties() throws JSONException;
}
