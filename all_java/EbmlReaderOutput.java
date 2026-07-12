package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
interface EbmlReaderOutput {
    public static final int TYPE_BINARY = 4;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_MASTER = 1;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_UNSIGNED_INT = 2;

    public @interface ElementType {
    }

    void binaryElement(int i2, int i3, ExtractorInput extractorInput) throws InterruptedException, IOException;

    void endMasterElement(int i2) throws ParserException;

    void floatElement(int i2, double d2) throws ParserException;

    int getElementType(int i2);

    void integerElement(int i2, long j2) throws ParserException;

    boolean isLevel1Element(int i2);

    void startMasterElement(int i2, long j2, long j3) throws ParserException;

    void stringElement(int i2, String str) throws ParserException;
}
