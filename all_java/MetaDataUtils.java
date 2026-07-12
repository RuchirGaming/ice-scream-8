package com.ironsource.mediationsdk.metadata;

import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        return (str == null || str.length() > 64 || !str.matches("[A-Za-z0-9_\\-.]+")) ? "The MetaData key you entered is invalid. Please enter a key of maximum 64 characters that consists of only letters, digits and the following characters: . - _" : "";
    }

    public static String checkMetaDataValueValidity(List<String> list) {
        if (list.size() == 0) {
            return "The MetaData list should include at least one element.";
        }
        for (String str : list) {
            if (str == null || str.length() > 64 || !str.matches("[A-Za-z0-9_\\-.]+")) {
                return "The MetaData value(s) you entered is invalid. Please enter a value of maximum 64 characters that consists of only letters, digits and the following characters: . - _";
            }
        }
        return "";
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (!isKnownKey(str)) {
            return new MetaData(str, list);
        }
        String lowerCase = StringUtils.toLowerCase(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
            String valueForType = formatValueForType(str2, valueTypeForKey);
            arrayList.add(valueTypeForKey);
            arrayList2.add(valueForType);
        }
        return new MetaData(lowerCase, arrayList2, arrayList);
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        if (metaDataValueTypes != MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN) {
            return str;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
            return "true";
        }
        return (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no")) ? "false" : "";
    }

    public static boolean getMetaDataBooleanValue(String str) {
        return !str.equals("false");
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        return (str.equalsIgnoreCase(a.f16578a) || str.equalsIgnoreCase(a.f16579b) || str.equalsIgnoreCase(a.f16580c) || str.equalsIgnoreCase(a.f16581d)) ? MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN : MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
    }

    public static boolean isKnownKey(String str) {
        return str.equalsIgnoreCase(a.f16578a) || str.equalsIgnoreCase(a.f16579b) || str.equalsIgnoreCase(a.f16580c) || str.equalsIgnoreCase(a.f16584g) || str.equalsIgnoreCase(a.f16581d);
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        return str.equalsIgnoreCase(a.f16580c) || str.equalsIgnoreCase(a.f16581d);
    }

    public static boolean isMediationOnlyKey(String str) {
        return str.equalsIgnoreCase(a.f16579b) || str.equalsIgnoreCase(a.f16580c) || str.equalsIgnoreCase(a.f16584g) || str.equalsIgnoreCase(a.f16581d);
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        return isValidMetaData(str, a.f16578a, str2);
    }

    public static boolean isValidMetaData(String str, String str2, String str3) {
        return str.equalsIgnoreCase(str2) && !TextUtils.isEmpty(str3);
    }
}
