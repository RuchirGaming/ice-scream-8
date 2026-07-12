package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f16575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f16576c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f16574a = str;
        this.f16575b = list;
        this.f16576c = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f16576c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f16574a = str;
        this.f16575b = list;
        this.f16576c = list2;
    }

    public String getMetaDataKey() {
        return this.f16574a;
    }

    public List<String> getMetaDataValue() {
        return this.f16575b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f16576c;
    }
}
