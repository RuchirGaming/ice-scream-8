package com.google.gson.internal.bind.util;

import com.yandex.div2.PhoneMasks;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i2 = offset / 60000;
            int iAbs = Math.abs(i2 / 60);
            int iAbs2 = Math.abs(i2 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(AbstractJsonLexerKt.COLON);
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d3 A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:47:0x00cd, B:49:0x00d3, B:51:0x00da, B:75:0x0187, B:55:0x00e4, B:56:0x00ff, B:57:0x0100, B:61:0x011c, B:63:0x0129, B:66:0x0132, B:68:0x0151, B:71:0x0160, B:72:0x0182, B:74:0x0185, B:60:0x010b, B:77:0x01b8, B:78:0x01bf, B:40:0x00b4, B:41:0x00b7), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00da A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:47:0x00cd, B:49:0x00d3, B:51:0x00da, B:75:0x0187, B:55:0x00e4, B:56:0x00ff, B:57:0x0100, B:61:0x011c, B:63:0x0129, B:66:0x0132, B:68:0x0151, B:71:0x0160, B:72:0x0182, B:74:0x0185, B:60:0x010b, B:77:0x01b8, B:78:0x01bf, B:40:0x00b4, B:41:0x00b7), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x010b A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:47:0x00cd, B:49:0x00d3, B:51:0x00da, B:75:0x0187, B:55:0x00e4, B:56:0x00ff, B:57:0x0100, B:61:0x011c, B:63:0x0129, B:66:0x0132, B:68:0x0151, B:71:0x0160, B:72:0x0182, B:74:0x0185, B:60:0x010b, B:77:0x01b8, B:78:0x01bf, B:40:0x00b4, B:41:0x00b7), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:47:0x00cd, B:49:0x00d3, B:51:0x00da, B:75:0x0187, B:55:0x00e4, B:56:0x00ff, B:57:0x0100, B:61:0x011c, B:63:0x0129, B:66:0x0132, B:68:0x0151, B:71:0x0160, B:72:0x0182, B:74:0x0185, B:60:0x010b, B:77:0x01b8, B:78:0x01bf, B:40:0x00b4, B:41:0x00b7), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8 A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:47:0x00cd, B:49:0x00d3, B:51:0x00da, B:75:0x0187, B:55:0x00e4, B:56:0x00ff, B:57:0x0100, B:61:0x011c, B:63:0x0129, B:66:0x0132, B:68:0x0151, B:71:0x0160, B:72:0x0182, B:74:0x0185, B:60:0x010b, B:77:0x01b8, B:78:0x01bf, B:40:0x00b4, B:41:0x00b7), top: B:94:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x010b, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int i7 = parseInt(str, index, i6);
            if (checkOffset(str, i6, '-')) {
                i6++;
            }
            int i8 = i6 + 2;
            int i9 = parseInt(str, i6, i8);
            if (checkOffset(str, i8, '-')) {
                i8++;
            }
            int i10 = i8 + 2;
            int i11 = parseInt(str, i8, i10);
            boolean zCheckOffset = checkOffset(str, i10, 'T');
            if (!zCheckOffset && str.length() <= i10) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i7, i9 - 1, i11);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i10);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i12 = i10 + 1;
                int i13 = i12 + 2;
                int i14 = parseInt(str, i12, i13);
                if (checkOffset(str, i13, AbstractJsonLexerKt.COLON)) {
                    i13++;
                }
                int i15 = i13 + 2;
                int i16 = parseInt(str, i13, i15);
                if (checkOffset(str, i15, AbstractJsonLexerKt.COLON)) {
                    i15++;
                }
                if (str.length() <= i15 || (cCharAt2 = str.charAt(i15)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i3 = i16;
                    i4 = 0;
                    i2 = i14;
                    i10 = i15;
                } else {
                    int i17 = i15 + 2;
                    i5 = parseInt(str, i15, i17);
                    if (i5 > 59 && i5 < 63) {
                        i5 = 59;
                    }
                    if (checkOffset(str, i17, '.')) {
                        int i18 = i17 + 1;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i18 + 1);
                        int iMin = Math.min(iIndexOfNonDigit, i18 + 3);
                        int i19 = parseInt(str, i18, iMin);
                        int i20 = iMin - i18;
                        if (i20 == 1) {
                            i19 *= 100;
                        } else if (i20 == 2) {
                            i19 *= 10;
                        }
                        i3 = i16;
                        i4 = i19;
                        i2 = i14;
                        i10 = iIndexOfNonDigit;
                    } else {
                        i3 = i16;
                        i2 = i14;
                        i10 = i17;
                        i4 = 0;
                    }
                }
                if (str.length() > i10) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i10);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i10 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i10);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + PhoneMasks.EXTRA_NUMBERS;
                    }
                    length = i10 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id = timeZone2.getID();
                        if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i7);
                gregorianCalendar2.set(2, i9 - 1);
                gregorianCalendar2.set(5, i11);
                gregorianCalendar2.set(11, i2);
                gregorianCalendar2.set(12, i3);
                gregorianCalendar2.set(13, i5);
                gregorianCalendar2.set(14, i4);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            if (str.length() > i10) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i10);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i10 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i10);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + PhoneMasks.EXTRA_NUMBERS;
                }
                length = i10 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i7);
            gregorianCalendar3.set(2, i9 - 1);
            gregorianCalendar3.set(5, i11);
            gregorianCalendar3.set(11, i2);
            gregorianCalendar3.set(12, i3);
            gregorianCalendar3.set(13, i5);
            gregorianCalendar3.set(14, i4);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e2) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e2.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    private static boolean checkOffset(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    private static int parseInt(String str, int i2, int i3) throws NumberFormatException {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = -iDigit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int iDigit2 = Character.digit(str.charAt(i5), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = (i4 * 10) - iDigit2;
            i5 = i6;
        }
        return -i4;
    }

    private static void padInt(StringBuilder sb, int i2, int i3) {
        String string = Integer.toString(i2);
        for (int length = i3 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    private static int indexOfNonDigit(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }
}
