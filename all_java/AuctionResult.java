package io.bidmachine.models;

import io.bidmachine.CreativeFormat;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface AuctionResult {
    String[] getAdDomains();

    String getCid();

    CreativeFormat getCreativeFormat();

    String getCreativeId();

    Map<String, String> getCustomParams();

    String getDeal();

    String getDemandSource();

    String getId();

    String getNetworkKey();

    Map<String, String> getNetworkParams();

    double getPrice();
}
