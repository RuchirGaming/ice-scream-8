package com.unity.purchasing.common;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface IStore {
    void FinishTransaction(ProductDefinition productDefinition, String str);

    void Purchase(ProductDefinition productDefinition);

    void Purchase(ProductDefinition productDefinition, String str);

    void RetrieveProducts(List<ProductDefinition> list);
}
