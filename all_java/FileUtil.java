package androidx.room.util;

import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class FileUtil {
    public static void copy(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        try {
            if (Build.VERSION.SDK_INT > 23) {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            } else {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStreamNewInputStream.read(bArr);
                    if (i2 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i2);
                    }
                }
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }

    private FileUtil() {
    }
}
