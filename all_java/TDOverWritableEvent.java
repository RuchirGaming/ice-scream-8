package cn.thinkinganalyticsclone.android;

import cn.thinkinganalyticsclone.android.utils.TDConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TDOverWritableEvent extends ThinkingAnalyticsEvent {
    private final String mEventId;

    @Override // cn.thinkinganalyticsclone.android.ThinkingAnalyticsEvent
    String getExtraField() {
        return TDConstants.KEY_EVENT_ID;
    }

    public TDOverWritableEvent(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties);
        this.mEventId = eventId;
    }

    @Override // cn.thinkinganalyticsclone.android.ThinkingAnalyticsEvent
    String getExtraValue() {
        return this.mEventId;
    }

    @Override // cn.thinkinganalyticsclone.android.ThinkingAnalyticsEvent
    TDConstants.DataType getDataType() {
        return TDConstants.DataType.TRACK_OVERWRITE;
    }
}
