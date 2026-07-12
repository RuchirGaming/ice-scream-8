package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    private static int clamp(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static int hsvToRgb(float f2, float f3, float f4) {
        float f5 = f2 * 6.0f;
        int i2 = (int) f5;
        float f6 = f5 - i2;
        float f7 = f4 * 255.0f;
        int i3 = (int) (((1.0f - f3) * f7) + 0.5f);
        int i4 = (int) (((1.0f - (f6 * f3)) * f7) + 0.5f);
        int i5 = (int) (((1.0f - ((1.0f - f6) * f3)) * f7) + 0.5f);
        int i6 = (int) (f7 + 0.5f);
        if (i2 == 0) {
            return ((i6 << 16) + (i5 << 8) + i3) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i2 == 1) {
            return ((i4 << 16) + (i6 << 8) + i3) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i2 == 2) {
            return ((i3 << 16) + (i6 << 8) + i5) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i2 == 3) {
            return ((i3 << 16) + (i4 << 8) + i6) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i2 == 4) {
            return ((i5 << 16) + (i3 << 8) + i6) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i2 != 5) {
            return 0;
        }
        return ((i6 << 16) + (i3 << 8) + i4) | ViewCompat.MEASURED_STATE_MASK;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public boolean isContinuous() {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public void setFloatValue(float f2) {
        this.mFloatValue = f2;
    }

    public void setColorValue(int i2) {
        this.mColorValue = i2;
    }

    public void setIntValue(int i2) {
        this.mIntegerValue = i2;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public int numberOfInterpolatedValues() {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        return (i2 == 4 || i2 == 5) ? 4 : 1;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i2 = this.mColorValue;
                int i3 = (i2 >> 24) & 255;
                float fPow = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i2 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i3 / 255.0f;
                return;
            case INT_TYPE:
                fArr[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 2:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iHsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = iHsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (iHsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 7:
                this.mFloatValue = fArr[0];
                return;
            case 8:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public boolean diff(CustomAttribute customAttribute) {
        if (customAttribute == null || this.mType != customAttribute.mType) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case 2:
                return this.mBooleanValue == customAttribute.mBooleanValue;
            case 3:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case 4:
            case 5:
                return this.mColorValue == customAttribute.mColorValue;
            case 7:
                return this.mFloatValue == customAttribute.mFloatValue;
            case 8:
                return this.mFloatValue == customAttribute.mFloatValue;
            default:
                return false;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z;
        setValue(obj);
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case 2:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.mStringValue = (String) obj;
                break;
            case 4:
            case 5:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case 7:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case 8:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }

    public static HashMap<String, CustomAttribute> extractAttributes(HashMap<String, CustomAttribute> map, Object obj) {
        HashMap<String, CustomAttribute> map2 = new HashMap<>();
        Class<?> cls = obj.getClass();
        for (String str : map.keySet()) {
            try {
                map2.put(str, new CustomAttribute(map.get(str), cls.getMethod("getMap" + str, new Class[0]).invoke(obj, new Object[0])));
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return map2;
    }

    public static void setAttributes(Object obj, HashMap<String, CustomAttribute> map) {
        Class<?> cls = obj.getClass();
        for (String str : map.keySet()) {
            CustomAttribute customAttribute = map.get(str);
            String str2 = customAttribute.mMethod ? str : "set" + str;
            try {
                switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[customAttribute.mType.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(obj, Integer.valueOf(customAttribute.mIntegerValue));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(obj, Boolean.valueOf(customAttribute.mBooleanValue));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(obj, customAttribute.mStringValue);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(obj, Integer.valueOf(customAttribute.mColorValue));
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(obj, Integer.valueOf(customAttribute.mIntegerValue));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(obj, Float.valueOf(customAttribute.mFloatValue));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(obj, Float.valueOf(customAttribute.mFloatValue));
                        break;
                }
            } catch (IllegalAccessException e2) {
                Utils.loge(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Utils.loge(TAG, e3.getMessage());
                Utils.loge(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Utils.loge(TAG, sb.toString());
            } catch (InvocationTargetException e4) {
                Utils.loge(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e4.printStackTrace();
            }
        }
    }

    public void applyCustom(Object obj) {
        String str;
        Class<?> cls = obj.getClass();
        String str2 = this.mName;
        if (this.mMethod) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(this.mIntegerValue));
                    break;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(obj, Boolean.valueOf(this.mBooleanValue));
                    break;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(obj, this.mStringValue);
                    break;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(this.mColorValue));
                    break;
                case 5:
                default:
                    break;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(this.mFloatValue));
                    break;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(this.mFloatValue));
                    break;
            }
        } catch (IllegalAccessException e2) {
            Utils.loge(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            Utils.loge(TAG, e3.getMessage());
            Utils.loge(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" must have a method ");
            sb.append(str);
            Utils.loge(TAG, sb.toString());
        } catch (InvocationTargetException e4) {
            Utils.loge(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e4.printStackTrace();
        }
    }

    public void setInterpolatedValue(Object obj, float[] fArr) {
        Class<?> cls = obj.getClass();
        String str = "set" + this.mName;
        try {
            int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
            boolean z = true;
            if (i2 == 2) {
                Method method = cls.getMethod(str, Boolean.TYPE);
                Object[] objArr = new Object[1];
                if (fArr[0] <= 0.5f) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                method.invoke(obj, objArr);
                return;
            }
            if (i2 == 3) {
                throw new RuntimeException("unable to interpolate strings " + this.mName);
            }
            if (i2 == 4) {
                cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf((clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                return;
            }
            if (i2 == 6) {
                cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf((int) fArr[0]));
            } else if (i2 == 7) {
                cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(fArr[0]));
            } else {
                if (i2 != 8) {
                    return;
                }
                cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(fArr[0]));
            }
        } catch (IllegalAccessException e2) {
            Utils.loge(TAG, "cannot access method " + str + " on View \"" + obj.getClass().getName() + "\"");
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            Utils.loge(TAG, "no method " + str + " on View \"" + obj.getClass().getName() + "\"");
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }
}
