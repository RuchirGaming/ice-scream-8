package cn.thinkinganalyticsclone.android;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ThinkingExpandableListViewItemTrackProperties {
    JSONObject getThinkingChildItemTrackProperties(int groupPosition, int childPosition) throws JSONException;

    JSONObject getThinkingGroupItemTrackProperties(int groupPosition) throws JSONException;
}
