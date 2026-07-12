package io.bidmachine.models;

import android.location.Location;
import io.bidmachine.utils.Gender;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface TargetingInfo {
    String getCity();

    String getCountry();

    Location getDeviceLocation();

    Gender getGender();

    String[] getKeywords();

    String getStoreUrl();

    Integer getUserAge();

    Integer getUserBirthdayYear();

    String getUserId();

    String getZip();

    Boolean isPaid();
}
