package com.applovin.sdk;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface AppLovinTargetingData {
    void clearAll();

    String getEmail();

    AppLovinGender getGender();

    List<String> getInterests();

    List<String> getKeywords();

    AppLovinAdContentRating getMaximumAdContentRating();

    String getPhoneNumber();

    Integer getYearOfBirth();

    void setEmail(String str);

    void setGender(AppLovinGender appLovinGender);

    void setInterests(List<String> list);

    void setKeywords(List<String> list);

    void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating);

    void setPhoneNumber(String str);

    void setYearOfBirth(Integer num);
}
