package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface HeartBeatInfo {
    HeartBeat getHeartBeatCode(String str);

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        HeartBeat(int i2) {
            this.code = i2;
        }

        public int getCode() {
            return this.code;
        }
    }
}
