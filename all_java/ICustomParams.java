package io.bidmachine.models;

import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface ICustomParams<SelfType> {
    SelfType addParam(String str, String str2);

    SelfType addParams(Map<String, String> map);
}
