package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    static float[] copyOfRange(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        int iMin = Math.min(i4, length - i2);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, iMin);
        return fArr2;
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] pathDataNodeArrCreateNodesFromPathData = createNodesFromPathData(str);
        if (pathDataNodeArrCreateNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(pathDataNodeArrCreateNodesFromPathData, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int iNextStart = nextStart(str, i2);
            String strTrim = str.substring(i3, iNextStart).trim();
            if (strTrim.length() > 0) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i3 = iNextStart;
            i2 = iNextStart + 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            addNode(arrayList, str.charAt(i3), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr2[i2] = new PathDataNode(pathDataNodeArr[i2]);
        }
        return pathDataNodeArr2;
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            if (pathDataNodeArr[i2].mType != pathDataNodeArr2[i2].mType || pathDataNodeArr[i2].mParams.length != pathDataNodeArr2[i2].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i2 = 0; i2 < pathDataNodeArr2.length; i2++) {
            pathDataNodeArr[i2].mType = pathDataNodeArr2[i2].mType;
            for (int i3 = 0; i3 < pathDataNodeArr2[i2].mParams.length; i3++) {
                pathDataNodeArr[i2].mParams[i3] = pathDataNodeArr2[i2].mParams[i3];
            }
        }
    }

    private static int nextStart(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                extract(str, i2, extractFloatResult);
                int i4 = extractFloatResult.mEndPosition;
                if (i2 < i4) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i4));
                    i3++;
                }
                i2 = extractFloatResult.mEndWithNegOrDot ? i4 : i4 + 1;
            }
            return copyOfRange(fArr, 0, i3);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    private static void extract(String str, int i2, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = i2; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == ' ') {
                z = false;
                z3 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z = false;
                        z3 = true;
                        break;
                    case '-':
                        if (i3 == i2 || z) {
                            z = false;
                        } else {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        }
                        break;
                    case '.':
                        if (z2) {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = true;
            }
            if (z3) {
                extractFloatResult.mEndPosition = i3;
            }
        }
        extractFloatResult.mEndPosition = i3;
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr[i2].interpolatePathDataNode(pathDataNodeArr2[i2], pathDataNodeArr3[i2], f2);
        }
        return true;
    }

    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        PathDataNode(char c2, float[] fArr) {
            this.mType = c2;
            this.mParams = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                addCommand(path, fArr, c2, pathDataNodeArr[i2].mType, pathDataNodeArr[i2].mParams);
                c2 = pathDataNodeArr[i2].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f2) {
            this.mType = pathDataNode.mType;
            int i2 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i2 >= fArr.length) {
                    return;
                }
                this.mParams[i2] = (fArr[i2] * (1.0f - f2)) + (pathDataNode2.mParams[i2] * f2);
                i2++;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void addCommand(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i2;
            int i3;
            int i4;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            char c4 = c3;
            boolean z = false;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i2 = 7;
                    i3 = i2;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    i3 = i2;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i3 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i3 = 2;
                    break;
            }
            float f16 = f10;
            float f17 = f11;
            float f18 = f14;
            float f19 = f15;
            int i5 = 0;
            char c5 = c2;
            while (i5 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        i4 = i5;
                        int i6 = i4 + 2;
                        int i7 = i4 + 3;
                        int i8 = i4 + 4;
                        int i9 = i4 + 5;
                        path.cubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                        f16 = fArr2[i8];
                        float f20 = fArr2[i9];
                        float f21 = fArr2[i6];
                        float f22 = fArr2[i7];
                        f17 = f20;
                        f13 = f22;
                        f12 = f21;
                    } else if (c4 == 'H') {
                        i4 = i5;
                        int i10 = i4 + 0;
                        path.lineTo(fArr2[i10], f17);
                        f16 = fArr2[i10];
                    } else if (c4 == 'Q') {
                        i4 = i5;
                        int i11 = i4 + 0;
                        int i12 = i4 + 1;
                        int i13 = i4 + 2;
                        int i14 = i4 + 3;
                        path.quadTo(fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        float f23 = fArr2[i11];
                        float f24 = fArr2[i12];
                        f16 = fArr2[i13];
                        f17 = fArr2[i14];
                        f12 = f23;
                        f13 = f24;
                    } else if (c4 == 'V') {
                        i4 = i5;
                        int i15 = i4 + 0;
                        path.lineTo(f16, fArr2[i15]);
                        f17 = fArr2[i15];
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                int i16 = i5 + 0;
                                path.rLineTo(fArr2[i16], 0.0f);
                                f16 += fArr2[i16];
                            } else if (c4 != 'q') {
                                if (c4 == 'v') {
                                    int i17 = i5 + 0;
                                    path.rLineTo(0.0f, fArr2[i17]);
                                    f5 = fArr2[i17];
                                } else if (c4 == 'L') {
                                    int i18 = i5 + 0;
                                    int i19 = i5 + 1;
                                    path.lineTo(fArr2[i18], fArr2[i19]);
                                    f16 = fArr2[i18];
                                    f17 = fArr2[i19];
                                } else if (c4 == 'M') {
                                    int i20 = i5 + 0;
                                    f16 = fArr2[i20];
                                    int i21 = i5 + 1;
                                    f17 = fArr2[i21];
                                    if (i5 > 0) {
                                        path.lineTo(fArr2[i20], fArr2[i21]);
                                    } else {
                                        path.moveTo(fArr2[i20], fArr2[i21]);
                                        i4 = i5;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    float f25 = f17;
                                    int i22 = i5 + 0;
                                    int i23 = i5 + 1;
                                    int i24 = i5 + 2;
                                    int i25 = i5 + 3;
                                    path.cubicTo(f16, f25, fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f2 = fArr2[i22];
                                    f3 = fArr2[i23];
                                    f16 = fArr2[i24];
                                    f17 = fArr2[i25];
                                    f12 = f2;
                                    f13 = f3;
                                } else if (c4 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    int i26 = i5 + 0;
                                    int i27 = i5 + 1;
                                    path.quadTo(f16, f17, fArr2[i26], fArr2[i27]);
                                    float f26 = fArr2[i26];
                                    float f27 = fArr2[i27];
                                    i4 = i5;
                                    f13 = f17;
                                    f12 = f16;
                                    f16 = f26;
                                    f17 = f27;
                                } else if (c4 == 'l') {
                                    int i28 = i5 + 0;
                                    int i29 = i5 + 1;
                                    path.rLineTo(fArr2[i28], fArr2[i29]);
                                    f16 += fArr2[i28];
                                    f5 = fArr2[i29];
                                } else if (c4 == 'm') {
                                    int i30 = i5 + 0;
                                    f16 += fArr2[i30];
                                    int i31 = i5 + 1;
                                    f17 += fArr2[i31];
                                    if (i5 > 0) {
                                        path.rLineTo(fArr2[i30], fArr2[i31]);
                                    } else {
                                        path.rMoveTo(fArr2[i30], fArr2[i31]);
                                        i4 = i5;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f28 = f16 - f12;
                                        f6 = f17 - f13;
                                        f7 = f28;
                                    } else {
                                        f7 = 0.0f;
                                        f6 = 0.0f;
                                    }
                                    int i32 = i5 + 0;
                                    int i33 = i5 + 1;
                                    int i34 = i5 + 2;
                                    int i35 = i5 + 3;
                                    path.rCubicTo(f7, f6, fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                                    f2 = fArr2[i32] + f16;
                                    f3 = fArr2[i33] + f17;
                                    f16 += fArr2[i34];
                                    f4 = fArr2[i35];
                                } else if (c4 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f8 = f16 - f12;
                                        f9 = f17 - f13;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i36 = i5 + 0;
                                    int i37 = i5 + 1;
                                    path.rQuadTo(f8, f9, fArr2[i36], fArr2[i37]);
                                    float f29 = f8 + f16;
                                    float f30 = f9 + f17;
                                    f16 += fArr2[i36];
                                    f17 += fArr2[i37];
                                    f13 = f30;
                                    f12 = f29;
                                }
                                f17 += f5;
                            } else {
                                int i38 = i5 + 0;
                                int i39 = i5 + 1;
                                int i40 = i5 + 2;
                                int i41 = i5 + 3;
                                path.rQuadTo(fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                                f2 = fArr2[i38] + f16;
                                f3 = fArr2[i39] + f17;
                                f16 += fArr2[i40];
                                f4 = fArr2[i41];
                            }
                            i4 = i5;
                        } else {
                            int i42 = i5 + 2;
                            int i43 = i5 + 3;
                            int i44 = i5 + 4;
                            int i45 = i5 + 5;
                            path.rCubicTo(fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i42], fArr2[i43], fArr2[i44], fArr2[i45]);
                            f2 = fArr2[i42] + f16;
                            f3 = fArr2[i43] + f17;
                            f16 += fArr2[i44];
                            f4 = fArr2[i45];
                        }
                        f17 += f4;
                        f12 = f2;
                        f13 = f3;
                        i4 = i5;
                    } else {
                        int i46 = i5 + 5;
                        int i47 = i5 + 6;
                        i4 = i5;
                        drawArc(path, f16, f17, fArr2[i46] + f16, fArr2[i47] + f17, fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f, fArr2[i5 + 4] != 0.0f);
                        f16 += fArr2[i46];
                        f17 += fArr2[i47];
                    }
                    i5 = i4 + i3;
                    c5 = c3;
                    c4 = c5;
                    z = false;
                } else {
                    i4 = i5;
                    int i48 = i4 + 5;
                    int i49 = i4 + 6;
                    drawArc(path, f16, f17, fArr2[i48], fArr2[i49], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                    f16 = fArr2[i48];
                    f17 = fArr2[i49];
                }
                f13 = f17;
                f12 = f16;
                i5 = i4 + i3;
                c5 = c3;
                c4 = c5;
                z = false;
            }
            fArr[z ? 1 : 0] = f16;
            fArr[1] = f17;
            fArr[2] = f12;
            fArr[3] = f13;
            fArr[4] = f18;
            fArr[5] = f19;
        }

        private static void drawArc(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f8);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d4 = f2;
            double d5 = d4 * dCos;
            double d6 = f3;
            double d7 = f6;
            double d8 = (d5 + (d6 * dSin)) / d7;
            double d9 = (((double) (-f2)) * dSin) + (d6 * dCos);
            double d10 = f7;
            double d11 = d9 / d10;
            double d12 = f5;
            double d13 = ((((double) f4) * dCos) + (d12 * dSin)) / d7;
            double d14 = ((((double) (-f4)) * dSin) + (d12 * dCos)) / d10;
            double d15 = d8 - d13;
            double d16 = d11 - d14;
            double d17 = (d8 + d13) / 2.0d;
            double d18 = (d11 + d14) / 2.0d;
            double d19 = (d15 * d15) + (d16 * d16);
            if (d19 == TelemetryConfig.DEFAULT_SAMPLING_FACTOR) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d20 = (1.0d / d19) - 0.25d;
            if (d20 < TelemetryConfig.DEFAULT_SAMPLING_FACTOR) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d19);
                float fSqrt = (float) (Math.sqrt(d19) / 1.99999d);
                drawArc(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d20);
            double d21 = d15 * dSqrt;
            double d22 = dSqrt * d16;
            if (z == z2) {
                d2 = d17 - d22;
                d3 = d18 + d21;
            } else {
                d2 = d17 + d22;
                d3 = d18 - d21;
            }
            double dAtan2 = Math.atan2(d11 - d3, d8 - d2);
            double dAtan3 = Math.atan2(d14 - d3, d13 - d2) - dAtan2;
            if (z2 != (dAtan3 >= TelemetryConfig.DEFAULT_SAMPLING_FACTOR)) {
                dAtan3 = dAtan3 > TelemetryConfig.DEFAULT_SAMPLING_FACTOR ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d23 = d2 * d7;
            double d24 = d3 * d10;
            arcToBezier(path, (d23 * dCos) - (d24 * dSin), (d23 * dSin) + (d24 * dCos), d7, d10, d4, d6, radians, dAtan2, dAtan3);
        }

        private static void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d4;
            int iCeil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d8);
            double dSin = Math.sin(d8);
            double dCos2 = Math.cos(d9);
            double dSin2 = Math.sin(d9);
            double d12 = -d11;
            double d13 = d12 * dCos;
            double d14 = d5 * dSin;
            double d15 = (d13 * dSin2) - (d14 * dCos2);
            double d16 = d12 * dSin;
            double d17 = d5 * dCos;
            double d18 = (dSin2 * d16) + (dCos2 * d17);
            double d19 = d10 / ((double) iCeil);
            double d20 = d18;
            double d21 = d15;
            int i2 = 0;
            double d22 = d6;
            double d23 = d7;
            double d24 = d9;
            while (i2 < iCeil) {
                double d25 = d24 + d19;
                double dSin3 = Math.sin(d25);
                double dCos3 = Math.cos(d25);
                double d26 = (d2 + ((d11 * dCos) * dCos3)) - (d14 * dSin3);
                double d27 = d3 + (d11 * dSin * dCos3) + (d17 * dSin3);
                double d28 = (d13 * dSin3) - (d14 * dCos3);
                double d29 = (dSin3 * d16) + (dCos3 * d17);
                double d30 = d25 - d24;
                double dTan = Math.tan(d30 / 2.0d);
                double dSin4 = (Math.sin(d30) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d31 = d22 + (d21 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d31, (float) (d23 + (d20 * dSin4)), (float) (d26 - (dSin4 * d28)), (float) (d27 - (dSin4 * d29)), (float) d26, (float) d27);
                i2++;
                d19 = d19;
                dSin = dSin;
                d22 = d26;
                d16 = d16;
                dCos = dCos;
                d24 = d25;
                d20 = d29;
                d21 = d28;
                iCeil = iCeil;
                d23 = d27;
                d11 = d4;
            }
        }
    }

    private PathParser() {
    }
}
