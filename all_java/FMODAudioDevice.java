package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class FMODAudioDevice implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Thread f37745a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f37746b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f37747c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37748d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f37749e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f37750f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile a f37751g;

    private native int fmodGetInfo(int i2);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f37747c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f37747c.stop();
            }
            this.f37747c.release();
            this.f37747c = null;
        }
        this.f37749e = null;
        this.f37750f = null;
        this.f37748d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(ByteBuffer byteBuffer, int i2);

    public boolean isRunning() {
        return this.f37745a != null && this.f37745a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2 = 3;
        while (this.f37746b) {
            if (!this.f37748d && i2 > 0) {
                releaseAudioTrack();
                int iFmodGetInfo = fmodGetInfo(0);
                int i3 = fmodGetInfo(4) == 1 ? 4 : 12;
                int minBufferSize = AudioTrack.getMinBufferSize(iFmodGetInfo, i3, 2);
                int iFmodGetInfo2 = fmodGetInfo(4) * 2;
                int iRound = Math.round(minBufferSize * 1.1f) & (~(iFmodGetInfo2 - 1));
                int iFmodGetInfo3 = fmodGetInfo(1);
                int iFmodGetInfo4 = fmodGetInfo(2) * iFmodGetInfo3 * iFmodGetInfo2;
                AudioTrack audioTrack = new AudioTrack(3, iFmodGetInfo, i3, 2, iFmodGetInfo4 > iRound ? iFmodGetInfo4 : iRound, 1);
                this.f37747c = audioTrack;
                boolean z = audioTrack.getState() == 1;
                this.f37748d = z;
                if (z) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iFmodGetInfo3 * iFmodGetInfo2);
                    this.f37749e = byteBufferAllocateDirect;
                    this.f37750f = new byte[byteBufferAllocateDirect.capacity()];
                    this.f37747c.play();
                    i2 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f37747c.getState() + ")");
                    releaseAudioTrack();
                    i2 += -1;
                }
            }
            if (this.f37748d) {
                if (fmodGetInfo(3) == 1) {
                    fmodProcess(this.f37749e);
                    ByteBuffer byteBuffer = this.f37749e;
                    byteBuffer.get(this.f37750f, 0, byteBuffer.capacity());
                    this.f37747c.write(this.f37750f, 0, this.f37749e.capacity());
                    this.f37749e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f37745a != null) {
            stop();
        }
        this.f37745a = new Thread(this, "FMODAudioDevice");
        this.f37745a.setPriority(10);
        this.f37746b = true;
        this.f37745a.start();
        if (this.f37751g != null) {
            this.f37751g.c();
        }
    }

    public synchronized int startAudioRecord(int i2, int i3, int i4) {
        if (this.f37751g == null) {
            this.f37751g = new a(this, i2, i3, 2);
            this.f37751g.c();
        }
        return this.f37751g.a();
    }

    public synchronized void stop() {
        while (this.f37745a != null) {
            this.f37746b = false;
            try {
                this.f37745a.join();
                this.f37745a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.f37751g != null) {
            this.f37751g.d();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.f37751g != null) {
            this.f37751g.d();
            this.f37751g = null;
        }
    }
}
