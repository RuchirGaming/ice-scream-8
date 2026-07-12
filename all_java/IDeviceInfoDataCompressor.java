package com.unity3d.services.core.device.reader;

import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface IDeviceInfoDataCompressor extends IDeviceInfoDataContainer {
    byte[] compressDeviceInfo(Map<String, Object> map);
}
