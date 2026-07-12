package cn.thinkinganalyticsclone.android.utils;

import android.os.SystemClock;
import java.util.Date;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TDCalibratedTimeWithNTP implements ICalibratedTime {
    private static final int DEFAULT_TIME_OUT = 3000;
    private static final String TAG = "ThinkingAnalyticsClone.NTP";
    private long mSystemElapsedRealtime;
    private final Thread mThread;
    private final String[] ntpServer;
    private long startTime;

    public TDCalibratedTimeWithNTP(final String... ntpServer) {
        Thread thread = new Thread(new Runnable() { // from class: cn.thinkinganalyticsclone.android.utils.TDCalibratedTimeWithNTP.1
            final TDNTPClient ntpClient = new TDNTPClient();

            @Override // java.lang.Runnable
            public void run() {
                for (String str : TDCalibratedTimeWithNTP.this.ntpServer) {
                    if (this.ntpClient.requestTime(str, 3000)) {
                        TDLog.i(TDCalibratedTimeWithNTP.TAG, "NTP offset from " + str + " is: " + this.ntpClient.getOffset());
                        TDCalibratedTimeWithNTP.this.startTime = System.currentTimeMillis() + this.ntpClient.getOffset();
                        TDCalibratedTimeWithNTP.this.mSystemElapsedRealtime = SystemClock.elapsedRealtime();
                        return;
                    }
                }
            }
        });
        this.mThread = thread;
        this.ntpServer = ntpServer;
        thread.start();
    }

    @Override // cn.thinkinganalyticsclone.android.utils.ICalibratedTime
    public Date get(long elapsedRealtime) {
        try {
            this.mThread.join(3000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return this.mSystemElapsedRealtime == 0 ? new Date((System.currentTimeMillis() - SystemClock.elapsedRealtime()) + elapsedRealtime) : new Date((elapsedRealtime - this.mSystemElapsedRealtime) + this.startTime);
    }
}
