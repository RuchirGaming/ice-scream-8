package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class BitmapCompat {
    public static int sizeAtStep(int i2, int i3, int i4, int i5) {
        if (i4 == 0) {
            return i3;
        }
        return i4 > 0 ? i2 * (1 << (i5 - i4)) : i3 << ((-i4) - 1);
    }

    public static boolean hasMipMap(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Api17Impl.hasMipMap(bitmap);
        }
        return false;
    }

    public static void setHasMipMap(Bitmap bitmap, boolean z) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.setHasMipMap(bitmap, z);
        }
    }

    public static int getAllocationByteCount(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.getAllocationByteCount(bitmap);
        }
        return bitmap.getByteCount();
    }

    public static Bitmap createScaledBitmap(Bitmap bitmap, int i2, int i3, Rect rect, boolean z) {
        double dFloor;
        double dFloor2;
        int i4;
        int i5;
        Rect rect2;
        Bitmap bitmapCreateBitmap;
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        Bitmap bitmapCopyBitmapIfHardware = Build.VERSION.SDK_INT >= 27 ? Api27Impl.copyBitmapIfHardware(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f2 = i2 / iWidth;
        float f3 = i3 / iHeight;
        int i6 = rect != null ? rect.left : 0;
        int i7 = rect != null ? rect.top : 0;
        if (i6 == 0 && i7 == 0 && i2 == bitmap.getWidth() && i3 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapCopyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : bitmapCopyBitmapIfHardware;
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setPaintBlendMode(paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i2 && iHeight == i3) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i2, i3, bitmapCopyBitmapIfHardware.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCopyBitmapIfHardware, -i6, -i7, paint);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        if (f2 > 1.0f) {
            dFloor = Math.ceil(Math.log(f2) / dLog);
        } else {
            dFloor = Math.floor(Math.log(f2) / dLog);
        }
        int i8 = (int) dFloor;
        if (f3 > 1.0f) {
            dFloor2 = Math.ceil(Math.log(f3) / dLog);
        } else {
            dFloor2 = Math.floor(Math.log(f3) / dLog);
        }
        int i9 = (int) dFloor2;
        Bitmap bitmap2 = null;
        if (!z || Build.VERSION.SDK_INT < 27 || Api27Impl.isAlreadyF16AndLinear(bitmap)) {
            i4 = i6;
            i5 = 0;
        } else {
            Bitmap bitmapCreateBitmapWithSourceColorspace = Api27Impl.createBitmapWithSourceColorspace(i8 > 0 ? sizeAtStep(iWidth, i2, 1, i8) : iWidth, i9 > 0 ? sizeAtStep(iHeight, i3, 1, i9) : iHeight, bitmap, true);
            new Canvas(bitmapCreateBitmapWithSourceColorspace).drawBitmap(bitmapCopyBitmapIfHardware, -i6, -i7, paint);
            i5 = 1;
            i7 = 0;
            i4 = 0;
            bitmap2 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmapWithSourceColorspace;
        }
        Rect rect3 = new Rect(i4, i7, iWidth, iHeight);
        Rect rect4 = new Rect();
        int i10 = i8;
        int i11 = i9;
        while (true) {
            if (i10 == 0 && i11 == 0) {
                break;
            }
            if (i10 < 0) {
                i10++;
            } else if (i10 > 0) {
                i10--;
            }
            if (i11 < 0) {
                i11++;
            } else if (i11 > 0) {
                i11--;
            }
            int i12 = i11;
            Paint paint2 = paint;
            Rect rect5 = rect3;
            rect4.set(0, 0, sizeAtStep(iWidth, i2, i10, i8), sizeAtStep(iHeight, i3, i12, i9));
            boolean z2 = i10 == 0 && i12 == 0;
            boolean z3 = bitmap2 != null && bitmap2.getWidth() == i2 && bitmap2.getHeight() == i3;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z) {
                    rect2 = rect4;
                    if (Build.VERSION.SDK_INT < 27 || Api27Impl.isAlreadyF16AndLinear(bitmap2)) {
                    }
                    Rect rect6 = rect2;
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect5, rect6, paint2);
                    rect5.set(rect6);
                    i11 = i12;
                    Bitmap bitmap3 = bitmapCopyBitmapIfHardware;
                    bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint = paint2;
                    bitmap2 = bitmap3;
                } else {
                    rect2 = rect4;
                }
                if (!z2 || (z3 && i5 == 0)) {
                    bitmapCreateBitmap = bitmap2;
                }
                Rect rect7 = rect2;
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect5, rect7, paint2);
                rect5.set(rect7);
                i11 = i12;
                Bitmap bitmap4 = bitmapCopyBitmapIfHardware;
                bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
                rect4 = rect7;
                rect3 = rect5;
                paint = paint2;
                bitmap2 = bitmap4;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int iSizeAtStep = sizeAtStep(iWidth, i2, i10 > 0 ? i5 : i10, i8);
            int iSizeAtStep2 = sizeAtStep(iHeight, i3, i12 > 0 ? i5 : i12, i9);
            if (Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = Api27Impl.createBitmapWithSourceColorspace(iSizeAtStep, iSizeAtStep2, bitmap, z && !z2);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iSizeAtStep, iSizeAtStep2, bitmapCopyBitmapIfHardware.getConfig());
            }
            Rect rect8 = rect2;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect5, rect8, paint2);
            rect5.set(rect8);
            i11 = i12;
            Bitmap bitmap5 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
            rect4 = rect8;
            rect3 = rect5;
            paint = paint2;
            bitmap2 = bitmap5;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return bitmapCopyBitmapIfHardware;
    }

    private BitmapCompat() {
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static boolean hasMipMap(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        static void setHasMipMap(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static int getAllocationByteCount(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    static class Api27Impl {
        private Api27Impl() {
        }

        static Bitmap createBitmapWithSourceColorspace(int i2, int i3, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return Bitmap.createBitmap(i2, i3, config, bitmap.hasAlpha(), colorSpace);
        }

        static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }

        static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config hardwareBitmapConfig = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                hardwareBitmapConfig = Api31Impl.getHardwareBitmapConfig(bitmap);
            }
            return bitmap.copy(hardwareBitmapConfig, true);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return Bitmap.Config.RGBA_F16;
            }
            return Bitmap.Config.ARGB_8888;
        }
    }
}
