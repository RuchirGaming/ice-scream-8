package io.bidmachine;

import io.bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public enum TrackEventType {
    GetBidToken(513),
    InitLoading(506),
    AuctionRequest(507),
    AuctionRequestCancel(508),
    AuctionRequestExpired(509),
    AuctionRequestDestroy(510),
    Load(500),
    FillAd(512),
    Impression(502),
    Show(501),
    Click(503),
    Close(504),
    Expired(511),
    Error(1000),
    Destroy(505),
    TrackingError(1001),
    HeaderBiddingNetworksPrepare(703),
    HeaderBiddingNetworkInitialize(701),
    HeaderBiddingNetworkPrepare(702),
    MediationWin(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE),
    MediationLoss(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE);

    private final int actionValue;

    TrackEventType(int i2) {
        this.actionValue = i2;
    }

    public static TrackEventType fromNumber(int i2) {
        for (TrackEventType trackEventType : values()) {
            if (trackEventType.actionValue == i2) {
                return trackEventType;
            }
        }
        return null;
    }

    public int getActionValue() {
        return this.actionValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("%s (%s)", name(), Integer.valueOf(this.actionValue));
    }
}
