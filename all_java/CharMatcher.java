package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public abstract class CharMatcher implements Predicate<Character> {
    public abstract boolean matches(char c2);

    public static CharMatcher any() {
        return b.nK;
    }

    public static CharMatcher none() {
        return w.oe;
    }

    public static CharMatcher whitespace() {
        return aa.oj;
    }

    public static CharMatcher breakingWhitespace() {
        return e.nN;
    }

    public static CharMatcher ascii() {
        return d.nM;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.nO;
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.nW;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.nY;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.nZ;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.ob;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.oa;
    }

    public static CharMatcher javaIsoControl() {
        return o.nX;
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.nS;
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.oh;
    }

    public static CharMatcher is(char c2) {
        return new k(c2);
    }

    public static CharMatcher isNot(char c2) {
        return new m(c2);
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length == 1) {
            return is(charSequence.charAt(0));
        }
        if (length == 2) {
            return isEither(charSequence.charAt(0), charSequence.charAt(1));
        }
        return new c(charSequence);
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    public static CharMatcher inRange(char c2, char c3) {
        return new i(c2, c3);
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new h(predicate);
    }

    protected CharMatcher() {
    }

    public CharMatcher negate() {
        return new u(this);
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new x(this, charMatcher);
    }

    void setBits(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; i2--) {
            if (matches((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int indexIn(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i2, length);
        while (i2 < length) {
            if (matches(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public int countIn(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (matches(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i2 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i2++;
                } else {
                    charArray[iIndexIn - i2] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new String(charArray, 0, iIndexIn - i2);
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String replaceFrom(CharSequence charSequence, char c2) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c2;
        while (true) {
            iIndexIn++;
            if (iIndexIn < charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    charArray[iIndexIn] = c2;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) string, i2, iIndexIn);
            sb.append(charSequence2);
            i2 = iIndexIn + 1;
            iIndexIn = indexIn(string, i2);
        } while (iIndexIn != -1);
        sb.append((CharSequence) string, i2, length2);
        return sb.toString();
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!matches(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (matches(cCharAt)) {
                if (cCharAt != c2 || (i2 != length - 1 && matches(charSequence.charAt(i2 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                    sb.append(c2);
                    return finishCollapseFrom(charSequence, i2 + 1, length, c2, sb, true);
                }
                i2++;
            }
            i2++;
        }
        return charSequence.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && matches(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && matches(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return collapseFrom(charSequence, c2);
        }
        int i5 = i4 + 1;
        return finishCollapseFrom(charSequence, i3, i5, c2, new StringBuilder(i5 - i3), false);
    }

    private String finishCollapseFrom(CharSequence charSequence, int i2, int i3, char c2, StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (!matches(cCharAt)) {
                sb.append(cCharAt);
                z2 = false;
            } else if (!z2) {
                sb.append(c2);
                z2 = true;
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c2) {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    static abstract class g extends CharMatcher {
        g() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return new v(this);
        }
    }

    static abstract class t extends g {
        private final String oc;

        t(String str) {
            this.oc = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final String toString() {
            return this.oc;
        }
    }

    static class v extends u {
        v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    private static final class b extends t {
        static final b nK = new b();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return true;
        }

        private b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i2) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i2, length);
            if (i2 == length) {
                return -1;
            }
            return i2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c2) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c2);
            return new String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c2) {
            return charSequence.length() == 0 ? "" : String.valueOf(c2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return none();
        }
    }

    private static final class w extends t {
        static final w oe = new w();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return false;
        }

        private w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i2) {
            Preconditions.checkPositionIndex(i2, charSequence.length());
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return any();
        }
    }

    static final class aa extends t {
        static final int oi = Integer.numberOfLeadingZeros(31);
        static final aa oj = new aa();

        aa() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> oi) == c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            for (int i2 = 0; i2 < 32; i2++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i2));
            }
        }
    }

    private static final class e extends CharMatcher {
        static final CharMatcher nN = new e();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            if (c2 != ' ' && c2 != 133 && c2 != 5760) {
                if (c2 == 8199) {
                    return false;
                }
                if (c2 != 8287 && c2 != 12288 && c2 != 8232 && c2 != 8233) {
                    switch (c2) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c2 >= 8192 && c2 <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }

        private e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }
    }

    private static final class d extends t {
        static final d nM = new d();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return c2 <= 127;
        }

        d() {
            super("CharMatcher.ascii()");
        }
    }

    private static class y extends CharMatcher {
        private final String oc;
        private final char[] of;
        private final char[] og;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        y(String str, char[] cArr, char[] cArr2) {
            this.oc = str;
            this.of = cArr;
            this.og = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i2 = 0;
            while (i2 < cArr.length) {
                Preconditions.checkArgument(cArr[i2] <= cArr2[i2]);
                int i3 = i2 + 1;
                if (i3 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i2] < cArr[i3]);
                }
                i2 = i3;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            int iBinarySearch = Arrays.binarySearch(this.of, c2);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i2 = (~iBinarySearch) - 1;
            return i2 >= 0 && c2 <= this.og[i2];
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.oc;
        }
    }

    private static final class f extends y {
        static final f nO = new f();

        private static char[] eW() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private static char[] eX() {
            char[] cArr = new char[37];
            for (int i2 = 0; i2 < 37; i2++) {
                cArr[i2] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i2) + '\t');
            }
            return cArr;
        }

        private f() {
            super("CharMatcher.digit()", eW(), eX());
        }
    }

    private static final class n extends CharMatcher {
        static final n nW = new n();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }

        private n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return Character.isDigit(c2);
        }
    }

    private static final class p extends CharMatcher {
        static final p nY = new p();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }

        private p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return Character.isLetter(c2);
        }
    }

    private static final class q extends CharMatcher {
        static final q nZ = new q();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }

        private q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return Character.isLetterOrDigit(c2);
        }
    }

    private static final class s extends CharMatcher {
        static final s ob = new s();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }

        private s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return Character.isUpperCase(c2);
        }
    }

    private static final class r extends CharMatcher {
        static final r oa = new r();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }

        private r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return Character.isLowerCase(c2);
        }
    }

    private static final class o extends t {
        static final o nX = new o();

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return c2 <= 31 || (c2 >= 127 && c2 <= 159);
        }

        private o() {
            super("CharMatcher.javaIsoControl()");
        }
    }

    private static final class j extends y {
        static final j nS = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    private static final class z extends y {
        static final z oh = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    private static class u extends CharMatcher {
        final CharMatcher od;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        u(CharMatcher charMatcher) {
            this.od = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return !this.od.matches(c2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.od.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.od.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.od.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.od.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return this.od;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.od + ".negate()";
        }
    }

    private static final class a extends CharMatcher {
        final CharMatcher nI;
        final CharMatcher nJ;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.nI = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.nJ = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return this.nI.matches(c2) && this.nJ.matches(c2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.nI.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.nJ.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.nI + ", " + this.nJ + ")";
        }
    }

    private static final class x extends CharMatcher {
        final CharMatcher nI;
        final CharMatcher nJ;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.nI = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.nJ = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            this.nI.setBits(bitSet);
            this.nJ.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return this.nI.matches(c2) || this.nJ.matches(c2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.nI + ", " + this.nJ + ")";
        }
    }

    private static final class k extends g {
        private final char nT;

        k(char c2) {
            this.nT = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return c2 == this.nT;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c2) {
            return charSequence.toString().replace(this.nT, c2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.nT) ? this : none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.nT) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return isNot(this.nT);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.nT);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.nT) + "')";
        }
    }

    private static final class m extends g {
        private final char nT;

        m(char c2) {
            this.nT = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return c2 != this.nT;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.nT) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.nT) ? any() : this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(0, this.nT);
            bitSet.set(this.nT + 1, 65536);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return is(this.nT);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.nT) + "')";
        }
    }

    private static l isEither(char c2, char c3) {
        return new l(c2, c3);
    }

    private static final class l extends g {
        private final char nU;
        private final char nV;

        l(char c2, char c3) {
            this.nU = c2;
            this.nV = c3;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return c2 == this.nU || c2 == this.nV;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.nU);
            bitSet.set(this.nV);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.nU) + CharMatcher.showCharacter(this.nV) + "\")";
        }
    }

    private static final class c extends CharMatcher {
        private final char[] nL;

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.nL = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return Arrays.binarySearch(this.nL, c2) >= 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            for (char c2 : this.nL) {
                bitSet.set(c2);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c2 : this.nL) {
                sb.append(CharMatcher.showCharacter(c2));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class i extends g {
        private final char nQ;
        private final char nR;

        i(char c2, char c3) {
            Preconditions.checkArgument(c3 >= c2);
            this.nQ = c2;
            this.nR = c3;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return this.nQ <= c2 && c2 <= this.nR;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.nQ, this.nR + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.nQ) + "', '" + CharMatcher.showCharacter(this.nR) + "')";
        }
    }

    private static final class h extends CharMatcher {
        private final Predicate<? super Character> nP;

        h(Predicate<? super Character> predicate) {
            this.nP = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return this.nP.apply(Character.valueOf(c2));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Character ch) {
            return this.nP.apply(Preconditions.checkNotNull(ch));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.nP + ")";
        }
    }
}
