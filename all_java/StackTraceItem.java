package com.yandex.metrica.plugins;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f28783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f28784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f28785e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f28788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f28789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f28790e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f28786a, this.f28787b, this.f28788c, this.f28789d, this.f28790e);
        }

        public Builder withClassName(String str) {
            this.f28786a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f28789d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f28787b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f28788c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f28790e = str;
            return this;
        }
    }

    public String getClassName() {
        return this.f28781a;
    }

    public Integer getColumn() {
        return this.f28784d;
    }

    public String getFileName() {
        return this.f28782b;
    }

    public Integer getLine() {
        return this.f28783c;
    }

    public String getMethodName() {
        return this.f28785e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f28781a = str;
        this.f28782b = str2;
        this.f28783c = num;
        this.f28784d = num2;
        this.f28785e = str3;
    }
}
