package com.mbridge.msdk.foundation.download;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public enum DownloadResourceType {
    DOWNLOAD_RESOURCE_TYPE_VIDEO(0),
    DOWNLOAD_RESOURCE_TYPE_ZIP(1),
    DOWNLOAD_RESOURCE_TYPE_IMAGE(2),
    DOWNLOAD_RESOURCE_TYPE_HTML(3),
    DOWNLOAD_RESOURCE_TYPE_OTHER(4);

    public int resourceType;

    DownloadResourceType(int i2) {
        this.resourceType = i2;
    }

    public static DownloadResourceType getDownloadResourceType(int i2) {
        if (i2 == 0) {
            return DOWNLOAD_RESOURCE_TYPE_VIDEO;
        }
        if (i2 == 1) {
            return DOWNLOAD_RESOURCE_TYPE_ZIP;
        }
        if (i2 == 2) {
            return DOWNLOAD_RESOURCE_TYPE_IMAGE;
        }
        if (i2 == 3) {
            return DOWNLOAD_RESOURCE_TYPE_HTML;
        }
        if (i2 != 4) {
            return null;
        }
        return DOWNLOAD_RESOURCE_TYPE_OTHER;
    }
}
