package com.ktplay.open;

import com.ktplay.b.a;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class KTUser {
    public String birthday;
    public String city;
    public String gameUserId;
    public int gender;
    public String headerUrl;
    public String loginType;
    public boolean needPresentNickname;
    public String nickname;
    public long originScore;
    public long rank;
    public String score;
    public String scoreTag;
    public String snsUserId;
    public String userId;
    public int vipLevel;

    public static KTUser createFromObject(Object obj) {
        if (obj == null) {
            return null;
        }
        KTUser kTUser = new KTUser();
        kTUser.userId = (String) a.a(obj, "getUserId", null, new Object[0]);
        kTUser.headerUrl = (String) a.a(obj, "getHeaderUrl", null, new Object[0]);
        kTUser.nickname = (String) a.a(obj, "getNickname", null, new Object[0]);
        kTUser.gender = ((Integer) a.a(obj, "getGender", null, new Object[0])).intValue();
        kTUser.city = (String) a.a(obj, "getCity", null, new Object[0]);
        kTUser.score = (String) a.a(obj, "getScore", null, new Object[0]);
        kTUser.birthday = (String) a.a(obj, "getBirthday", null, new Object[0]);
        kTUser.rank = ((Long) a.a(obj, "getRank", null, new Object[0])).longValue();
        kTUser.scoreTag = (String) a.a(obj, "getScoreTag", null, new Object[0]);
        kTUser.originScore = ((Long) a.a(obj, "getOriginScore", null, new Object[0])).longValue();
        kTUser.gameUserId = (String) a.a(obj, "getGameUserId", null, new Object[0]);
        kTUser.needPresentNickname = ((Boolean) a.a(obj, "getNeedPresentNickname", null, new Object[0])).booleanValue();
        kTUser.vipLevel = ((Integer) a.a(obj, "getVipLevel", null, new Object[0])).intValue();
        return kTUser;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getGameUserId() {
        return this.gameUserId;
    }

    public void setGameUserId(String str) {
        this.gameUserId = str;
    }

    public String getHeaderUrl() {
        return this.headerUrl;
    }

    public void setHeaderUrl(String str) {
        this.headerUrl = str;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public int getGender() {
        return this.gender;
    }

    public void setGender(int i2) {
        this.gender = i2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public long getOriginScore() {
        return this.originScore;
    }

    public void setOriginScore(long j2) {
        this.originScore = j2;
    }

    public String getScoreTag() {
        return this.scoreTag;
    }

    public void setScoreTag(String str) {
        this.scoreTag = str;
    }

    public long getRank() {
        return this.rank;
    }

    public void setRank(long j2) {
        this.rank = j2;
    }

    public String getSnsUserId() {
        return this.snsUserId;
    }

    public void setSnsUserId(String str) {
        this.snsUserId = str;
    }

    public String getLoginType() {
        return this.loginType;
    }

    public void setLoginType(String str) {
        this.loginType = str;
    }

    public boolean getNeedPresentNickname() {
        return this.needPresentNickname;
    }

    public void setNeedPresentNickname(boolean z) {
        this.needPresentNickname = z;
    }

    public boolean isNicknameChanged() {
        return !getNeedPresentNickname();
    }

    public void setVipLevel(int i2) {
        this.vipLevel = i2;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public String toString() {
        return "userId:" + this.userId + "\nnickname:" + this.nickname + "\nheaderUrl:" + this.headerUrl + "\ngender:" + this.gender + "\ncity:" + this.city + "\nscore:" + this.score + "\nrank:" + this.rank + "\nscoreTag:" + this.scoreTag + "\noriginScore:" + this.originScore + "\nsnsUserId:" + this.snsUserId + "\nloginType:" + this.loginType + "\ngameUserId:" + this.gameUserId + "\nisNicknameChanged:" + isNicknameChanged() + '\n';
    }
}
