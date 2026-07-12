package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
@Retention(RetentionPolicy.CLASS)
public @interface Update {
    Class<?> entity() default Object.class;

    int onConflict() default 3;
}
