package com.yandex.div.internal.util;

import android.database.Cursor;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class IOUtils {
    private static final int BUFFER_SIZE = 2048;

    private IOUtils() {
    }

    public static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeCursorSilently(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static void flushSilently(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 > 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String toString(InputStream inputStream) throws IOException {
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder(inputStream.available());
        while (true) {
            int i2 = bufferedReader.read(cArr);
            if (i2 != -1) {
                sb.append(cArr, 0, i2);
            } else {
                return sb.toString();
            }
        }
    }

    public static String toString(InputStream inputStream, Charset charset) throws IOException {
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
        StringBuilder sb = new StringBuilder(inputStream.available());
        while (true) {
            int i2 = bufferedReader.read(cArr);
            if (i2 != -1) {
                sb.append(cArr, 0, i2);
            } else {
                return sb.toString();
            }
        }
    }
}
