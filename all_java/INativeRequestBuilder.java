package io.bidmachine.models;

import io.bidmachine.MediaAssetType;
import io.bidmachine.models.INativeRequestBuilder;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface INativeRequestBuilder<SelfType extends INativeRequestBuilder> {
    SelfType setMediaAssetTypes(MediaAssetType... mediaAssetTypeArr);
}
