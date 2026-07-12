package io.bidmachine.models;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface ISessionAdParams<SelfType> {
    SelfType setClickRate(Float f2);

    SelfType setCompletionRate(Float f2);

    SelfType setImpressionCount(Integer num);

    SelfType setIsUserClickedOnLastAd(Boolean bool);

    SelfType setSessionDuration(Integer num);
}
