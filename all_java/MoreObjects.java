package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class MoreObjects {
    public static <T> T firstNonNull(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        java.util.Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }

    public static final class ToStringHelper {
        private final String className;
        private final a holderHead;
        private a holderTail;
        private boolean omitNullValues;

        private ToStringHelper(String str) {
            a aVar = new a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        public ToStringHelper add(String str, boolean z) {
            return addHolder(str, String.valueOf(z));
        }

        public ToStringHelper add(String str, char c2) {
            return addHolder(str, String.valueOf(c2));
        }

        public ToStringHelper add(String str, double d2) {
            return addHolder(str, String.valueOf(d2));
        }

        public ToStringHelper add(String str, float f2) {
            return addHolder(str, String.valueOf(f2));
        }

        public ToStringHelper add(String str, int i2) {
            return addHolder(str, String.valueOf(i2));
        }

        public ToStringHelper add(String str, long j2) {
            return addHolder(str, String.valueOf(j2));
        }

        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        public ToStringHelper addValue(boolean z) {
            return addHolder(String.valueOf(z));
        }

        public ToStringHelper addValue(char c2) {
            return addHolder(String.valueOf(c2));
        }

        public ToStringHelper addValue(double d2) {
            return addHolder(String.valueOf(d2));
        }

        public ToStringHelper addValue(float f2) {
            return addHolder(String.valueOf(f2));
        }

        public ToStringHelper addValue(int i2) {
            return addHolder(String.valueOf(i2));
        }

        public ToStringHelper addValue(long j2) {
            return addHolder(String.valueOf(j2));
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str = "";
            for (a aVar = this.holderHead.oz; aVar != null; aVar = aVar.oz) {
                Object obj = aVar.oy;
                if (!z || obj != null) {
                    sb.append(str);
                    if (aVar.name != null) {
                        sb.append(aVar.name);
                        sb.append(com.ironsource.sdk.constants.b.R);
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    str = ", ";
                }
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }

        private a addHolder() {
            a aVar = new a();
            this.holderTail.oz = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().oy = obj;
            return this;
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            a aVarAddHolder = addHolder();
            aVarAddHolder.oy = obj;
            aVarAddHolder.name = (String) Preconditions.checkNotNull(str);
            return this;
        }

        private static final class a {

            @NullableDecl
            String name;

            @NullableDecl
            Object oy;

            @NullableDecl
            a oz;

            private a() {
            }
        }
    }

    private MoreObjects() {
    }
}
