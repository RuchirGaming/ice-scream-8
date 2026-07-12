package io.bidmachine.models;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface IUserRestrictionsParams<SelfType> {
    SelfType setConsentConfig(boolean z, String str);

    SelfType setCoppa(Boolean bool);

    SelfType setGPP(String str, List<Integer> list);

    SelfType setSubjectToGDPR(Boolean bool);

    SelfType setUSPrivacyString(String str);
}
