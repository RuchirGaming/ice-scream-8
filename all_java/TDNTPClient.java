package cn.thinkinganalyticsclone.android.utils;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
class TDNTPClient {
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final String TAG = "ThinkingAnalyticsClone.TDNTPClient";
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private long mOffSet;

    TDNTPClient() {
    }

    public long getOffset() {
        return this.mOffSet;
    }

    public boolean requestTime(String host, int timeout) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(timeout);
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, InetAddress.getByName(host), 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                writeTimeStamp(bArr, 40, jCurrentTimeMillis);
                datagramSocket2.send(datagramPacket);
                datagramSocket2.receive(new DatagramPacket(bArr, 48));
                long jElapsedRealtime = jCurrentTimeMillis + (SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
                long timeStamp = readTimeStamp(bArr, 24);
                this.mOffSet = ((readTimeStamp(bArr, 32) - timeStamp) + (readTimeStamp(bArr, 40) - jElapsedRealtime)) / 2;
                datagramSocket2.close();
                return true;
            } catch (Exception unused) {
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private long read32(byte[] buffer, int offset) {
        int i2 = buffer[offset];
        int i3 = buffer[offset + 1];
        int i4 = buffer[offset + 2];
        int i5 = buffer[offset + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    private long readTimeStamp(byte[] buffer, int offset) {
        return ((read32(buffer, offset) - OFFSET_1900_TO_1970) * 1000) + ((read32(buffer, offset + 4) * 1000) / 4294967296L);
    }

    private void writeTimeStamp(byte[] buffer, int offset, long time) {
        long j2 = (time / 1000) + OFFSET_1900_TO_1970;
        int i2 = offset + 1;
        buffer[offset] = (byte) (j2 >> 24);
        int i3 = i2 + 1;
        buffer[i2] = (byte) (j2 >> 16);
        int i4 = i3 + 1;
        buffer[i3] = (byte) (j2 >> 8);
        int i5 = i4 + 1;
        buffer[i4] = (byte) j2;
        long j3 = ((time - (j2 * 1000)) * 4294967296L) / 1000;
        int i6 = i5 + 1;
        buffer[i5] = (byte) (j3 >> 24);
        int i7 = i6 + 1;
        buffer[i6] = (byte) (j3 >> 16);
        buffer[i7] = (byte) (j3 >> 8);
        buffer[i7 + 1] = (byte) (Math.random() * 255.0d);
    }
}
