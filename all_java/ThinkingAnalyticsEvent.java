package cn.thinkinganalyticsclone.android;

import cn.thinkinganalyticsclone.android.utils.TDConstants;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public abstract class ThinkingAnalyticsEvent {
    private final String mEventName;
    private Date mEventTime;
    private final JSONObject mProperties;
    private TimeZone mTimeZone;

    abstract TDConstants.DataType getDataType();

    abstract String getExtraField();

    abstract String getExtraValue();

    ThinkingAnalyticsEvent(String eventName, JSONObject properties) {
        this.mEventName = eventName;
        this.mProperties = properties;
    }

    public void setEventTime(Date time) {
        this.mEventTime = time;
    }

    public void setEventTime(Date time, TimeZone timeZone) {
        this.mEventTime = time;
        this.mTimeZone = timeZone;
    }

    String getEventName() {
        return this.mEventName;
    }

    JSONObject getProperties() {
        return this.mProperties;
    }

    Date getEventTime() {
        return this.mEventTime;
    }

    TimeZone getTimeZone() {
        return this.mTimeZone;
    }
}
