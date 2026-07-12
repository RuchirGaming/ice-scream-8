package com.yodo1.mas.utils;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1MasPropertiesUtils {
    private static final String FILE_NAME_PROPERTIES = "yodo1_games_config";
    private static Yodo1MasPropertiesUtils mInstance;
    private Properties mBasicConfig;

    private Yodo1MasPropertiesUtils(Context context) {
        initProperties(context);
    }

    public static Yodo1MasPropertiesUtils getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new Yodo1MasPropertiesUtils(context);
        }
        return mInstance;
    }

    private Properties getPropertiesFromRaw(Context context, int rawResId) {
        Properties properties;
        InputStream inputStreamOpenRawResource = null;
        try {
            try {
                if (rawResId > 0) {
                    try {
                        properties = new Properties();
                        try {
                            inputStreamOpenRawResource = context.getResources().openRawResource(rawResId);
                            properties.load(inputStreamOpenRawResource);
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (inputStreamOpenRawResource != null) {
                                inputStreamOpenRawResource.close();
                            }
                            return properties;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        properties = null;
                    }
                } else {
                    properties = null;
                }
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return properties;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void initProperties(Context context) {
        int iRaw;
        if (this.mBasicConfig != null || (iRaw = raw(context, FILE_NAME_PROPERTIES)) <= 0) {
            return;
        }
        this.mBasicConfig = getPropertiesFromRaw(context, iRaw);
    }

    private int raw(Context context, String name) {
        return context.getResources().getIdentifier(name, "raw", context.getPackageName());
    }

    public String getBasicConfigValue(String key) {
        Properties properties = this.mBasicConfig;
        if (properties == null) {
            return null;
        }
        return properties.getProperty(key);
    }
}
