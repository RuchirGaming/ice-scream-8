package io.bidmachine.unified;

import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public abstract class UnifiedMediationParams {
    public abstract boolean contains(String str);

    public abstract boolean getBool(String str, boolean z);

    public abstract double getDouble(String str, double d2);

    public abstract float getFloat(String str, float f2);

    public abstract int getInt(String str, int i2);

    public abstract Integer getInteger(String str, Integer num);

    public <T> T getObject(String str, T t) {
        return null;
    }

    public abstract String getString(String str, String str2);

    public String getString(String str) {
        return getString(str, null);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public Integer getInteger(String str) {
        return getInteger(str, null);
    }

    public boolean getBool(String str) {
        return getBool(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public <T> T getObject(String str) {
        return (T) getObject(str, null);
    }

    public static class MappedUnifiedMediationParams extends UnifiedMediationParams {
        private final DataProvider dataProvider;

        public interface DataProvider {
            Map<String, Object> getData();
        }

        public MappedUnifiedMediationParams(DataProvider dataProvider) {
            this.dataProvider = dataProvider;
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public String getString(String str, String str2) {
            return (String) getObject(str, str2);
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public int getInt(String str, int i2) {
            return ((Integer) getObject(str, Integer.valueOf(i2))).intValue();
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public Integer getInteger(String str, Integer num) {
            return (Integer) getObject(str, num);
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public boolean getBool(String str, boolean z) {
            return ((Boolean) getObject(str, Boolean.valueOf(z))).booleanValue();
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public double getDouble(String str, double d2) {
            return ((Double) getObject(str, Double.valueOf(d2))).doubleValue();
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public float getFloat(String str, float f2) {
            return ((Float) getObject(str, Float.valueOf(f2))).floatValue();
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public boolean contains(String str) {
            return this.dataProvider.getData().containsKey(str);
        }

        @Override // io.bidmachine.unified.UnifiedMediationParams
        public <T> T getObject(String str, T t) {
            T t2;
            return (str == null || (t2 = (T) this.dataProvider.getData().get(str)) == null) ? t : t2;
        }
    }
}
