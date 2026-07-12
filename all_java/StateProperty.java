package com.amazon.device.ads;

/* JADX INFO: compiled from: MraidProperty.java */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
class StateProperty extends MraidStringProperty {
    MraidStateType stateType;

    StateProperty(MraidStateType mraidStateType) {
        super("state");
        this.stateType = mraidStateType;
    }

    @Override // com.amazon.device.ads.MraidStringProperty
    String getValue() {
        return this.stateType.toString();
    }
}
