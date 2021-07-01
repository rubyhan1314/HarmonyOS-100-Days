package com.example.hanruluckycirclepancomponent.utils;

import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

/**
 * LogUtils类，对HiLog日志进行封装。
 */
public class LogUtils {
    private static final String TAG_LOG = "LogUtil"; 
 
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(0, 0, LogUtils.TAG_LOG);
 
    private static final String LOG_FORMAT = "%{public}s: %{public}s"; 
 
    private LogUtils() { 
    } 
 
    /** 
     * Print debug log 
     * 
     * @param tag log tag 
     * @param msg log message 
     */ 
    public static void debug(String tag, String msg) { 
        HiLog.debug(LABEL_LOG, LOG_FORMAT, tag, msg);
    } 
 
    /** 
     * Print info log 
     * 
     * @param tag log tag 
     * @param msg log message 
     */ 
    public static void info(String tag, String msg) { 
        HiLog.info(LABEL_LOG, LOG_FORMAT, tag, msg); 
    } 
 
    /** 
     * Print warn log 
     * 
     * @param tag log tag 
     * @param msg log message 
     */ 
    public static void warn(String tag, String msg) { 
        HiLog.warn(LABEL_LOG, LOG_FORMAT, tag, msg); 
    } 
 
    /** 
     * Print error log 
     * 
     * @param tag log tag 
     * @param msg log message 
     */ 
    public static void error(String tag, String msg) { 
        HiLog.error(LABEL_LOG, LOG_FORMAT, tag, msg); 
    } 
}

