package com.mbridge.msdk.thrid.okhttp.internal.tls;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.dn = name;
        this.length = name.length();
    }

    private String nextAT() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        while (true) {
            i2 = this.pos;
            i3 = this.length;
            if (i2 >= i3 || this.chars[i2] != ' ') {
                break;
            }
            this.pos = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.beg = i2;
        this.pos = i2 + 1;
        while (true) {
            i4 = this.pos;
            i5 = this.length;
            if (i4 >= i5) {
                break;
            }
            char[] cArr = this.chars;
            if (cArr[i4] == '=' || cArr[i4] == ' ') {
                break;
            }
            this.pos = i4 + 1;
        }
        if (i4 >= i5) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        this.end = i4;
        if (this.chars[i4] == ' ') {
            while (true) {
                i6 = this.pos;
                i7 = this.length;
                if (i6 >= i7) {
                    break;
                }
                char[] cArr2 = this.chars;
                if (cArr2[i6] == '=' || cArr2[i6] != ' ') {
                    break;
                }
                this.pos = i6 + 1;
            }
            if (this.chars[i6] != '=' || i6 == i7) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
        }
        this.pos++;
        while (true) {
            int i8 = this.pos;
            if (i8 >= this.length || this.chars[i8] != ' ') {
                break;
            }
            this.pos = i8 + 1;
        }
        int i9 = this.end;
        int i10 = this.beg;
        if (i9 - i10 > 4) {
            char[] cArr3 = this.chars;
            if (cArr3[i10 + 3] == '.' && ((cArr3[i10] == 'O' || cArr3[i10] == 'o') && ((cArr3[i10 + 1] == 'I' || cArr3[i10 + 1] == 'i') && (cArr3[i10 + 2] == 'D' || cArr3[i10 + 2] == 'd')))) {
                this.beg = i10 + 4;
            }
        }
        char[] cArr4 = this.chars;
        int i11 = this.beg;
        return new String(cArr4, i11, i9 - i11);
    }

    private String quotedAV() {
        int i2 = this.pos + 1;
        this.pos = i2;
        this.beg = i2;
        this.end = i2;
        while (true) {
            int i3 = this.pos;
            if (i3 == this.length) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
            char[] cArr = this.chars;
            if (cArr[i3] == '\"') {
                this.pos = i3 + 1;
                while (true) {
                    int i4 = this.pos;
                    if (i4 >= this.length || this.chars[i4] != ' ') {
                        break;
                    }
                    this.pos = i4 + 1;
                }
                char[] cArr2 = this.chars;
                int i5 = this.beg;
                return new String(cArr2, i5, this.end - i5);
            }
            if (cArr[i3] == '\\') {
                cArr[this.end] = getEscaped();
            } else {
                cArr[this.end] = cArr[i3];
            }
            this.pos++;
            this.end++;
        }
    }

    private String hexAV() {
        int i2 = this.pos;
        if (i2 + 4 >= this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        this.beg = i2;
        this.pos = i2 + 1;
        while (true) {
            int i3 = this.pos;
            if (i3 != this.length) {
                char[] cArr = this.chars;
                if (cArr[i3] != '+' && cArr[i3] != ',' && cArr[i3] != ';') {
                    if (cArr[i3] == ' ') {
                        this.end = i3;
                        this.pos = i3 + 1;
                        while (true) {
                            int i4 = this.pos;
                            if (i4 >= this.length || this.chars[i4] != ' ') {
                                break;
                            }
                            this.pos = i4 + 1;
                        }
                    } else {
                        if (cArr[i3] >= 'A' && cArr[i3] <= 'F') {
                            cArr[i3] = (char) (cArr[i3] + ' ');
                        }
                        this.pos = i3 + 1;
                    }
                }
            }
            this.end = i3;
            break;
        }
        int i5 = this.end;
        int i6 = this.beg;
        int i7 = i5 - i6;
        if (i7 < 5 || (i7 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        int i8 = i7 / 2;
        byte[] bArr = new byte[i8];
        int i9 = i6 + 1;
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) getByte(i9);
            i9 += 2;
        }
        return new String(this.chars, this.beg, i7);
    }

    private String escapedAV() {
        int i2;
        int i3;
        int i4 = this.pos;
        this.beg = i4;
        this.end = i4;
        while (true) {
            int i5 = this.pos;
            if (i5 >= this.length) {
                char[] cArr = this.chars;
                int i6 = this.beg;
                return new String(cArr, i6, this.end - i6);
            }
            char[] cArr2 = this.chars;
            char c2 = cArr2[i5];
            if (c2 != ' ') {
                if (c2 != ';') {
                    if (c2 == '\\') {
                        int i7 = this.end;
                        this.end = i7 + 1;
                        cArr2[i7] = getEscaped();
                        this.pos++;
                    } else if (c2 != '+' && c2 != ',') {
                        int i8 = this.end;
                        this.end = i8 + 1;
                        cArr2[i8] = cArr2[i5];
                        this.pos = i5 + 1;
                    }
                }
                int i9 = this.beg;
                return new String(cArr2, i9, this.end - i9);
            }
            int i10 = this.end;
            this.cur = i10;
            this.pos = i5 + 1;
            this.end = i10 + 1;
            cArr2[i10] = ' ';
            while (true) {
                i2 = this.pos;
                i3 = this.length;
                if (i2 >= i3) {
                    break;
                }
                char[] cArr3 = this.chars;
                if (cArr3[i2] != ' ') {
                    break;
                }
                int i11 = this.end;
                this.end = i11 + 1;
                cArr3[i11] = ' ';
                this.pos = i2 + 1;
            }
            if (i2 != i3) {
                char[] cArr4 = this.chars;
                if (cArr4[i2] == ',' || cArr4[i2] == '+' || cArr4[i2] == ';') {
                }
            }
            char[] cArr5 = this.chars;
            int i12 = this.beg;
            return new String(cArr5, i12, this.cur - i12);
        }
    }

    private char getEscaped() {
        int i2 = this.pos + 1;
        this.pos = i2;
        if (i2 == this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        char[] cArr = this.chars;
        char c2 = cArr[i2];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
            switch (c2) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c2) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return getUTF8();
                    }
                    break;
            }
        }
        return cArr[i2];
    }

    private char getUTF8() {
        int i2;
        int i3;
        int i4 = getByte(this.pos);
        this.pos++;
        if (i4 < 128) {
            return (char) i4;
        }
        if (i4 < 192 || i4 > 247) {
            return '?';
        }
        if (i4 <= 223) {
            i3 = i4 & 31;
            i2 = 1;
        } else if (i4 <= 239) {
            i2 = 2;
            i3 = i4 & 15;
        } else {
            i2 = 3;
            i3 = i4 & 7;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = this.pos + 1;
            this.pos = i6;
            if (i6 == this.length || this.chars[i6] != '\\') {
                return '?';
            }
            int i7 = i6 + 1;
            this.pos = i7;
            int i8 = getByte(i7);
            this.pos++;
            if ((i8 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i3 = (i3 << 6) + (i8 & 63);
        }
        return (char) i3;
    }

    private int getByte(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 >= this.length) {
            throw new IllegalStateException("Malformed DN: " + this.dn);
        }
        char[] cArr = this.chars;
        char c2 = cArr[i2];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            i3 = c2 - '7';
        }
        char c3 = cArr[i5];
        if (c3 >= '0' && c3 <= '9') {
            i4 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i4 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            i4 = c3 - '7';
        }
        return (i3 << 4) + i4;
    }

    public String findMostSpecific(String str) {
        String strQuotedAV;
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String strNextAT = nextAT();
        if (strNextAT == null) {
            return null;
        }
        do {
            int i2 = this.pos;
            if (i2 == this.length) {
                return null;
            }
            char c2 = this.chars[i2];
            if (c2 == '\"') {
                strQuotedAV = quotedAV();
            } else if (c2 == '#') {
                strQuotedAV = hexAV();
            } else {
                strQuotedAV = (c2 == '+' || c2 == ',' || c2 == ';') ? "" : escapedAV();
            }
            if (str.equalsIgnoreCase(strNextAT)) {
                return strQuotedAV;
            }
            int i3 = this.pos;
            if (i3 >= this.length) {
                return null;
            }
            char[] cArr = this.chars;
            if (cArr[i3] != ',' && cArr[i3] != ';' && cArr[i3] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            this.pos = i3 + 1;
            strNextAT = nextAT();
        } while (strNextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }
}
