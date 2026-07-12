package com.yodo1.mas.ui.seekbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class SeekBarUtil {
    public static Bitmap drawableToBitmap(Context context, int width, int height, int drawableId) {
        if (context == null || width <= 0 || height <= 0 || drawableId == 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawableToBitmap(width, height, context.getResources().getDrawable(drawableId, null));
        }
        return drawableToBitmap(width, height, context.getResources().getDrawable(drawableId));
    }

    public static Bitmap drawableToBitmap(int width, int height, Drawable drawable) {
        Bitmap bitmap;
        try {
            if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.getHeight() > 0) {
                Matrix matrix = new Matrix();
                matrix.postScale((width * 1.0f) / bitmap.getWidth(), (height * 1.0f) / bitmap.getHeight());
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void drawNinePath(Canvas canvas, Bitmap bmp, Rect rect) {
        NinePatch.isNinePatchChunk(bmp.getNinePatchChunk());
        new NinePatch(bmp, bmp.getNinePatchChunk(), null).draw(canvas, rect);
    }

    public static void drawBitmap(Canvas canvas, Paint paint, Bitmap bmp, Rect rect) {
        try {
            if (NinePatch.isNinePatchChunk(bmp.getNinePatchChunk())) {
                drawNinePath(canvas, bmp, rect);
                return;
            }
        } catch (Exception unused) {
        }
        canvas.drawBitmap(bmp, rect.left, rect.top, paint);
    }

    public static int dp2px(Context context, float dpValue) {
        if (context == null || compareFloat(0.0f, dpValue) == 0) {
            return 0;
        }
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int compareFloat(float a2, float b2) {
        int iRound = Math.round(a2 * 1000000.0f);
        int iRound2 = Math.round(b2 * 1000000.0f);
        if (iRound > iRound2) {
            return 1;
        }
        return iRound < iRound2 ? -1 : 0;
    }

    public static float parseFloat(String s2) {
        try {
            return Float.parseFloat(s2);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static Rect measureText(String text, float textSize) {
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTextSize(textSize);
        paint.getTextBounds(text, 0, text.length(), rect);
        paint.reset();
        return rect;
    }

    public static boolean verifyBitmap(Bitmap bitmap) {
        return bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0;
    }

    public static int getColor(Context context, int colorId) {
        if (context != null) {
            return Build.VERSION.SDK_INT >= 23 ? context.getColor(colorId) : context.getResources().getColor(colorId);
        }
        return -1;
    }
}
