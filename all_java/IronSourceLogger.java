package com.ironsource.mediationsdk.logger;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f16552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16553b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    IronSourceLogger(String str) {
        this.f16553b = str;
        this.f16552a = 0;
    }

    IronSourceLogger(String str, int i2) {
        this.f16553b = str;
        this.f16552a = i2;
    }

    int a() {
        return this.f16552a;
    }

    String b() {
        return this.f16553b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IronSourceLogger)) {
            return false;
        }
        IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
        String str = this.f16553b;
        return str != null && str.equals(ironSourceLogger.f16553b);
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i2);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i2) {
        this.f16552a = i2;
    }
}
