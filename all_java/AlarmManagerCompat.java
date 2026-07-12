package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class AlarmManagerCompat {
    public static void setAlarmClock(AlarmManager alarmManager, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setAlarmClock(alarmManager, Api21Impl.createAlarmClockInfo(j2, pendingIntent), pendingIntent2);
        } else {
            setExact(alarmManager, 0, j2, pendingIntent2);
        }
    }

    public static void setAndAllowWhileIdle(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setAndAllowWhileIdle(alarmManager, i2, j2, pendingIntent);
        } else {
            alarmManager.set(i2, j2, pendingIntent);
        }
    }

    public static void setExact(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            Api19Impl.setExact(alarmManager, i2, j2, pendingIntent);
        } else {
            alarmManager.set(i2, j2, pendingIntent);
        }
    }

    public static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setExactAndAllowWhileIdle(alarmManager, i2, j2, pendingIntent);
        } else {
            setExact(alarmManager, i2, j2, pendingIntent);
        }
    }

    private AlarmManagerCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setAlarmClock(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }

        static AlarmManager.AlarmClockInfo createAlarmClockInfo(long j2, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j2, pendingIntent);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setAndAllowWhileIdle(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i2, j2, pendingIntent);
        }

        static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i2, j2, pendingIntent);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void setExact(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setExact(i2, j2, pendingIntent);
        }
    }
}
