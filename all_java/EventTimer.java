package cn.thinkinganalyticsclone.android;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
class EventTimer {
    static final long MAX_DURATION = 86400000;
    private long backgroundDuration;
    private final TimeUnit timeUnit;
    private long startTime = SystemClock.elapsedRealtime();
    private long eventAccumulatedDuration = 0;

    EventTimer(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    String duration() {
        return durationFormat((SystemClock.elapsedRealtime() - this.startTime) + this.eventAccumulatedDuration);
    }

    String backgroundDuration() {
        return durationFormat(this.backgroundDuration);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0007, B:10:0x0015, B:12:0x001a, B:14:0x0020, B:27:0x0048, B:28:0x004d, B:15:0x0022, B:17:0x002a, B:18:0x002d, B:20:0x0035, B:21:0x0037, B:22:0x0039, B:24:0x003f), top: B:32:0x0005 }] */
    String durationFormat(long duration) {
        float f2;
        float f3;
        try {
            if (duration < 0) {
                return String.valueOf(0);
            }
            if (duration > MAX_DURATION) {
                return durationFormat(MAX_DURATION);
            }
            if (this.timeUnit == TimeUnit.MILLISECONDS) {
                f3 = duration;
            } else if (this.timeUnit == TimeUnit.SECONDS) {
                f3 = duration / 1000.0f;
            } else {
                if (this.timeUnit == TimeUnit.MINUTES) {
                    f2 = duration / 1000.0f;
                } else if (this.timeUnit == TimeUnit.HOURS) {
                    f2 = (duration / 1000.0f) / 60.0f;
                } else {
                    f3 = duration;
                }
                f3 = f2 / 60.0f;
            }
            return f3 < 0.0f ? String.valueOf(0) : String.format(Locale.CHINA, "%.3f", Float.valueOf(f3));
        } catch (Exception e2) {
            e2.printStackTrace();
            return String.valueOf(0);
        }
    }

    long getStartTime() {
        return this.startTime;
    }

    long getEventAccumulatedDuration() {
        return this.eventAccumulatedDuration;
    }

    void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    void setEventAccumulatedDuration(long eventAccumulatedDuration) {
        this.eventAccumulatedDuration = eventAccumulatedDuration;
    }

    void setBackgroundDuration(long backgroundDuration) {
        this.backgroundDuration = backgroundDuration;
    }

    long getBackgroundDuration() {
        return this.backgroundDuration;
    }
}
