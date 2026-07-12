package com.iab.omid.library.ironsrc.adsession.media;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public enum InteractionType {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
