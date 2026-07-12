package com.applovin.exoplayer2.common.base;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, int i2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, char c2, char c3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, char c2, int i2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, char c2, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, char c2, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), obj));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, int i2, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i2), Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, int i2, int i3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, int i2, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i2), Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, int i2, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i2), obj));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, long j2, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, long j2, int i2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), Integer.valueOf(i2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, long j2, long j3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, long j2, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), obj));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object obj, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object obj, int i2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Integer.valueOf(i2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object obj, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, int i2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, char c2, char c3) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, char c2, int i2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, char c2, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, char c2, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), obj));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, int i2, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i2), Character.valueOf(c2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, int i2, int i3) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, int i2, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i2), Long.valueOf(j2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, int i2, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i2), obj));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, long j2, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, long j2, int i2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), Integer.valueOf(i2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, long j2, long j3) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, long j2, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), obj));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object obj, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Character.valueOf(c2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object obj, int i2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Integer.valueOf(i2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object obj, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Long.valueOf(j2)));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkState(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, objArr));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, char c2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, long j2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, char c2, char c3) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, char c2, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, char c2, long j2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, char c2, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), obj));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, int i2, char c2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i2), Character.valueOf(c2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, int i2, int i3) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, int i2, long j2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i2), Long.valueOf(j2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, int i2, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i2), obj));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, long j2, char c2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), Character.valueOf(c2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, long j2, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), Integer.valueOf(i2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, long j2, long j3) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, long j2, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), obj));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj, char c2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Character.valueOf(c2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Integer.valueOf(i2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj, long j2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Long.valueOf(j2)));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static int checkElementIndex(int i2, int i3) {
        return checkElementIndex(i2, i3, FirebaseAnalytics.Param.INDEX);
    }

    public static int checkElementIndex(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(badElementIndex(i2, i3, str));
        }
        return i2;
    }

    private static String badElementIndex(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    public static int checkPositionIndex(int i2, int i3) {
        return checkPositionIndex(i2, i3, FirebaseAnalytics.Param.INDEX);
    }

    public static int checkPositionIndex(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(badPositionIndex(i2, i3, str));
        }
        return i2;
    }

    private static String badPositionIndex(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    public static void checkPositionIndexes(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i2, i3, i4));
        }
    }

    private static String badPositionIndexes(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i4) {
            return badPositionIndex(i2, i4, "start index");
        }
        return (i3 < 0 || i3 > i4) ? badPositionIndex(i3, i4, "end index") : Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
