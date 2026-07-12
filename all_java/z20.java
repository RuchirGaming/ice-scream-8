package com.yandex.mobile.ads.impl;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class z20 extends WebChromeClient {
    z20() {
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        consoleMessage.sourceId();
        consoleMessage.lineNumber();
        int i2 = ga0.f30971a;
        return true;
    }
}
