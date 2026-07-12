package com.facebook.ads.redexgen.X;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4L, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C4L {
    public static String[] A01 = {"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    public final C4K A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A00(List<C06893x> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A05(List<C06893x> list) {
        while (true) {
            int iA00 = A00(list);
            if (iA00 == -1) {
                return;
            } else {
                A01(list, iA00, iA00 + 1);
            }
        }
    }

    public C4L(C4K c4k) {
        this.A00 = c4k;
    }

    private void A01(List<C06893x> list, int i2, int i3) {
        C06893x c06893x = list.get(i2);
        C06893x c06893x2 = list.get(i3);
        switch (c06893x2.A00) {
            case 1:
                A02(list, i2, c06893x, i3, c06893x2);
                break;
            case 2:
                A03(list, i2, c06893x, i3, c06893x2);
                break;
            case 4:
                A04(list, i2, c06893x, i3, c06893x2);
                break;
        }
    }

    private void A02(List<C06893x> list, int i2, C06893x c06893x, int i3, C06893x c06893x2) {
        int i4 = 0;
        int i5 = c06893x.A01;
        int offset = c06893x2.A02;
        if (i5 < offset) {
            i4 = 0 - 1;
        }
        int i6 = c06893x.A02;
        int offset2 = c06893x2.A02;
        if (i6 < offset2) {
            i4++;
        }
        int i7 = c06893x2.A02;
        int offset3 = c06893x.A02;
        if (i7 <= offset3) {
            int i8 = c06893x.A02;
            int offset4 = c06893x2.A01;
            c06893x.A02 = i8 + offset4;
        }
        int i9 = c06893x2.A02;
        int offset5 = c06893x.A01;
        if (i9 <= offset5) {
            int i10 = c06893x.A01;
            int offset6 = c06893x2.A01;
            c06893x.A01 = i10 + offset6;
        }
        int offset7 = c06893x2.A02;
        c06893x2.A02 = offset7 + i4;
        list.set(i2, c06893x2);
        list.set(i3, c06893x);
    }

    private final void A03(List<C06893x> list, int i2, C06893x c06893x, int i3, C06893x c06893x2) {
        boolean z;
        C06893x c06893xAAI = null;
        boolean z2 = false;
        if (c06893x.A02 < c06893x.A01) {
            z = false;
            if (c06893x2.A02 == c06893x.A02 && c06893x2.A01 == c06893x.A01 - c06893x.A02) {
                z2 = true;
            }
        } else {
            z = true;
            if (c06893x2.A02 == c06893x.A01 + 1) {
                int remaining = c06893x2.A01;
                if (remaining == c06893x.A02 - c06893x.A01) {
                    z2 = true;
                }
            }
        }
        if (c06893x.A01 < c06893x2.A02) {
            c06893x2.A02--;
        } else {
            int remaining2 = c06893x.A01;
            if (remaining2 < c06893x2.A02 + c06893x2.A01) {
                c06893x2.A01--;
                c06893x.A00 = 2;
                c06893x.A01 = 1;
                int remaining3 = c06893x2.A01;
                if (A01[6].length() == 11) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
                strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
                if (remaining3 == 0) {
                    list.remove(i3);
                    this.A00.AEJ(c06893x2);
                    return;
                }
                return;
            }
        }
        if (c06893x.A02 <= c06893x2.A02) {
            c06893x2.A02++;
        } else if (c06893x.A02 < c06893x2.A02 + c06893x2.A01) {
            int remaining4 = (c06893x2.A02 + c06893x2.A01) - c06893x.A02;
            c06893xAAI = this.A00.AAI(2, c06893x.A02 + 1, remaining4, null);
            c06893x2.A01 = c06893x.A02 - c06893x2.A02;
        }
        if (z2) {
            list.set(i2, c06893x2);
            list.remove(i3);
            this.A00.AEJ(c06893x);
            return;
        }
        if (z) {
            if (c06893xAAI != null) {
                if (c06893x.A02 > c06893xAAI.A02) {
                    c06893x.A02 -= c06893xAAI.A01;
                }
                if (c06893x.A01 > c06893xAAI.A02) {
                    c06893x.A01 -= c06893xAAI.A01;
                }
            }
            if (c06893x.A02 > c06893x2.A02) {
                c06893x.A02 -= c06893x2.A01;
            }
            if (c06893x.A01 > c06893x2.A02) {
                c06893x.A01 -= c06893x2.A01;
            }
        } else {
            if (c06893xAAI != null) {
                if (c06893x.A02 >= c06893xAAI.A02) {
                    c06893x.A02 -= c06893xAAI.A01;
                }
                if (c06893x.A01 >= c06893xAAI.A02) {
                    c06893x.A01 -= c06893xAAI.A01;
                }
            }
            if (c06893x.A02 >= c06893x2.A02) {
                c06893x.A02 -= c06893x2.A01;
            }
            if (c06893x.A01 >= c06893x2.A02) {
                c06893x.A01 -= c06893x2.A01;
            }
        }
        list.set(i2, c06893x2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c06893x.A02 != c06893x.A01) {
            list.set(i3, c06893x);
        } else {
            list.remove(i3);
        }
        if (c06893xAAI != null) {
            list.add(i2, c06893xAAI);
        }
    }

    private final void A04(List<C06893x> list, int i2, C06893x c06893x, int i3, C06893x c06893x2) {
        C06893x c06893xAAI = null;
        C06893x c06893xAAI2 = null;
        if (c06893x.A01 < c06893x2.A02) {
            c06893x2.A02--;
        } else {
            int remaining = c06893x.A01;
            if (remaining < c06893x2.A02 + c06893x2.A01) {
                c06893x2.A01--;
                c06893xAAI = this.A00.AAI(4, c06893x.A02, 1, c06893x2.A03);
            }
        }
        if (c06893x.A02 <= c06893x2.A02) {
            c06893x2.A02++;
        } else if (c06893x.A02 < c06893x2.A02 + c06893x2.A01) {
            int i4 = (c06893x2.A02 + c06893x2.A01) - c06893x.A02;
            c06893xAAI2 = this.A00.AAI(4, c06893x.A02 + 1, i4, c06893x2.A03);
            c06893x2.A01 -= i4;
        }
        list.set(i3, c06893x);
        if (c06893x2.A01 > 0) {
            list.set(i2, c06893x2);
        } else {
            list.remove(i2);
            this.A00.AEJ(c06893x2);
        }
        if (c06893xAAI != null) {
            list.add(i2, c06893xAAI);
        }
        if (c06893xAAI2 != null) {
            list.add(i2, c06893xAAI2);
        }
    }
}
