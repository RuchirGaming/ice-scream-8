package com.yodo1.mas.utils;

import android.content.Context;
import android.util.Log;
import com.yodo1.mas.Yodo1MasLog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1MasInitCacheUtil {
    private static final String INIT_CACHE_FILENAME = "initCacheConfig";
    private static final String TAG = "Yodo1MasInitCacheUtil";

    public static boolean isInitConfigCacheAvaliable(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + INIT_CACHE_FILENAME);
        return file.exists() && file.isFile();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008a A[Catch: IOException -> 0x0086, TRY_LEAVE, TryCatch #1 {IOException -> 0x0086, blocks: (B:27:0x0082, B:31:0x008a), top: B:47:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2 A[Catch: IOException -> 0x00ae, TRY_LEAVE, TryCatch #7 {IOException -> 0x00ae, blocks: (B:39:0x00aa, B:43:0x00b2), top: B:53:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean updateInitConfigCache(Context context, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        bufferedWriter2 = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(new File(context.getFilesDir().getAbsolutePath() + File.separator + INIT_CACHE_FILENAME), false);
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
                try {
                    bufferedWriter.write(str);
                    try {
                        bufferedWriter.close();
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        Yodo1MasLog.d(TAG, "updateInitConfigCache: error: " + e2.getMessage());
                    }
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        Log.w(TAG, "updateInitConfigCache: error: " + e.getMessage());
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                            } catch (IOException e4) {
                                Yodo1MasLog.d(TAG, "updateInitConfigCache: error: " + e4.getMessage());
                                return false;
                            }
                        } else if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        bufferedWriter2 = bufferedWriter;
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (IOException e5) {
                                Yodo1MasLog.d(TAG, "updateInitConfigCache: error: " + e5.getMessage());
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                bufferedWriter = null;
            } catch (Throwable th3) {
                th = th3;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } else if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            bufferedWriter = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static String readInitConfigCache(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + INIT_CACHE_FILENAME);
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileInputStream.close();
        } catch (FileNotFoundException e2) {
            Log.w(TAG, "readInitConfigCache: error: " + e2.getMessage());
        } catch (IOException e3) {
            Log.w(TAG, "readInitConfigCache: error: " + e3.getMessage());
        }
        return stringBuffer.toString();
    }
}
