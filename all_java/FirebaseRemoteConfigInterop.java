package com.google.firebase.remoteconfig.interop;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface FirebaseRemoteConfigInterop {
    void registerRolloutsStateSubscriber(String str, RolloutsStateSubscriber rolloutsStateSubscriber);
}
