package io.bidmachine.core;

import android.util.Log;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Logger {
    private static final int MAX_CHAR_COUNT = 1000;
    private static final String TAG = "BidMachineLog";
    private static boolean isLoggingEnabled = false;
    private static final List<LoggerListener> loggerListeners = new CopyOnWriteArrayList();
    private static LoggerMessageBuilder messageBuilder = new DefaultMessageBuilder();

    public interface LoggerListener {
        void onLog(String str, boolean z);

        void onLog(Throwable th);
    }

    public interface LoggerMessageBuilder {
        String buildMessage(String str);
    }

    public static void setLoggingEnabled(boolean z) {
        isLoggingEnabled = z;
    }

    public static boolean isLoggingEnabled() {
        return isLoggingEnabled;
    }

    public static void addLoggerListener(LoggerListener loggerListener) {
        loggerListeners.add(loggerListener);
    }

    public static void removeLoggerListener(LoggerListener loggerListener) {
        loggerListeners.remove(loggerListener);
    }

    public static boolean canSendLog() {
        return isLoggingEnabled() || !loggerListeners.isEmpty();
    }

    public static void setMessageBuilder(LoggerMessageBuilder loggerMessageBuilder) {
        messageBuilder = loggerMessageBuilder;
    }

    public static void log(Throwable th) {
        sendWarning(th);
    }

    public static void logError(String str, String str2) {
        logError(String.format("[%s] %s", str, str2));
    }

    public static void logError(String str) {
        log(str, true);
    }

    public static void log(String str, String str2) {
        log(String.format("[%s] %s", str, str2));
    }

    public static void log(String str) {
        log(str, false);
    }

    public static void log(String str, boolean z) {
        if (canSendLog()) {
            if (str.length() > 1000) {
                int length = ((str.length() + 1000) - 1) / 1000;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1000;
                    sendMessage(str.substring(i3, Math.min(str.length(), i4)), z);
                    i2++;
                    i3 = i4;
                }
                return;
            }
            sendMessage(str, z);
        }
    }

    public static void log(String str, Map<?, ?> map) {
        if (canSendLog()) {
            StringBuilder sb = new StringBuilder();
            if (Utils.isEmpty(map)) {
                sb.append("Empty");
            } else {
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    String string = null;
                    if (entry.getValue() instanceof Collection) {
                        Collection collection = (Collection) entry.getValue();
                        StringBuilder sb2 = new StringBuilder();
                        for (Object obj : collection) {
                            if (obj != null) {
                                if (sb2.length() > 0) {
                                    sb2.append(",");
                                }
                                sb2.append(obj);
                            }
                        }
                        if (sb2.length() == 0) {
                            sb2.append("Empty");
                        }
                        string = sb2.toString();
                    } else if (entry.getValue() != null) {
                        string = entry.getValue().toString();
                    }
                    sb.append(entry.getKey());
                    sb.append(": ");
                    sb.append(string);
                }
            }
            sb.insert(0, "\n").insert(0, str);
            sendMessage(sb.toString(), false);
        }
    }

    private static void sendMessage(String str, boolean z) {
        String strBuildMessage = messageBuilder.buildMessage(str);
        if (isLoggingEnabled()) {
            if (z) {
                Log.e(TAG, strBuildMessage);
            } else {
                Log.d(TAG, strBuildMessage);
            }
        }
        List<LoggerListener> list = loggerListeners;
        if (list.isEmpty()) {
            return;
        }
        Iterator<LoggerListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onLog(strBuildMessage, z);
        }
    }

    private static void sendWarning(Throwable th) {
        if (isLoggingEnabled()) {
            if (th instanceof UnknownHostException) {
                th.printStackTrace();
            } else {
                Log.w(TAG, th);
            }
        }
        List<LoggerListener> list = loggerListeners;
        if (list.isEmpty()) {
            return;
        }
        Iterator<LoggerListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onLog(th);
        }
    }

    private static final class DefaultMessageBuilder implements LoggerMessageBuilder {
        @Override // io.bidmachine.core.Logger.LoggerMessageBuilder
        public String buildMessage(String str) {
            return str;
        }

        private DefaultMessageBuilder() {
        }
    }
}
