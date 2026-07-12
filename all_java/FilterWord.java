package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class FilterWord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<FilterWord> f4531d;

    public FilterWord(String str, String str2) {
        this.f4528a = str;
        this.f4529b = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.f4528a;
    }

    public void setId(String str) {
        this.f4528a = str;
    }

    public String getName() {
        return this.f4529b;
    }

    public void setName(String str) {
        this.f4529b = str;
    }

    public boolean getIsSelected() {
        return this.f4530c;
    }

    public void setIsSelected(boolean z) {
        this.f4530c = z;
    }

    public List<FilterWord> getOptions() {
        return this.f4531d;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.f4531d == null) {
            this.f4531d = new ArrayList();
        }
        this.f4531d.add(filterWord);
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.f4528a) || TextUtils.isEmpty(this.f4529b)) ? false : true;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f4531d;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
