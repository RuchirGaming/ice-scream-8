package sg.bigo.ads.api;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface VideoController {

    public interface VideoLifeCallback {
        void onMuteChange(boolean z);

        void onVideoEnd();

        void onVideoPause();

        void onVideoPlay();

        void onVideoStart();
    }

    public interface a {
        void g(boolean z);
    }

    public interface b extends VideoLifeCallback {
        void a();

        void b();
    }

    public interface c {
        void a();
    }

    public interface d {
        void a(int i2, int i3);
    }

    a getBackupLoadCallback();

    c getLoadHTMLCallback();

    d getProgressChangeListener();

    VideoLifeCallback getVideoLifeCallback();

    boolean isMuted();

    boolean isPaused();

    boolean isPlaying();

    void mute(boolean z);

    void notifyBackupResourceReady();

    void notifyPlayViewRegister();

    void notifyResourceReady();

    void pause();

    void play();

    void setBackupLoadCallback(a aVar);

    void setLoadHTMLCallback(c cVar);

    void setProgressChangeListener(d dVar);

    void setVideoLifeCallback(VideoLifeCallback videoLifeCallback);
}
