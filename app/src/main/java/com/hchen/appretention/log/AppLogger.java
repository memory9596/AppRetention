/*
 * This file is part of AppRetentionHook.

 * AppRetentionHook is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.

 * Copyright (C) 2023-2025 HChenX
 */
package com.hchen.appretention.log;

import com.hchen.hooktool.HCData;
import com.hchen.hooktool.log.LogExpand;
import com.hchen.hooktool.log.XposedLog;

/**
 * LSP 框架日志
 *
 * @author 焕晨HChen
 */
public class AppLogger {
    // -------- logE -------------
    public static void logE(String tag, String log) {
        XposedLog.logE(tag, log);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][E]: " + log);
    }

    public static void logE(String tag, Throwable e) {
        XposedLog.logE(tag, e);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][E]:\n" + LogExpand.printStackTrace(e));
    }

    public static void logE(String tag, String log, String stackTrace) {
        XposedLog.logE(tag, log, stackTrace);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][E]: " + log + "\n[Stack Info]: " + stackTrace);
    }

    public static void logE(String tag, String log, Throwable e) {
        XposedLog.logE(tag, log, e);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][E]: " + log + "\n[Stack Info]: " + LogExpand.printStackTrace(e));
    }

    public static void logENoSave(String tag, String log) {
        XposedLog.logE(tag, log);
    }

    public static void logENoSave(String tag, Throwable e) {
        XposedLog.logE(tag, e);
    }

    public static void logENoSave(String tag, String log, Throwable e) {
        XposedLog.logE(tag, log, e);
    }

    // ----------- logW --------------
    public static void logW(String tag, String log) {
        XposedLog.logW(tag, log);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][W]: " + log);
    }

    public static void logW(String tag, Throwable e) {
        XposedLog.logW(tag, e);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][W]:\n" + LogExpand.printStackTrace(e));
    }

    public static void logW(String tag, String log, String stackTrace) {
        XposedLog.logW(tag, log, stackTrace);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][W]: " + log + "\n[Stack Info]: " + stackTrace);
    }

    public static void logW(String tag, String log, Throwable e) {
        XposedLog.logW(tag, log, e);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][W]: " + log + "\n[Stack Info]: " + LogExpand.printStackTrace(e));
    }

    // ----------- logI --------------
    public static void logI(String log) {
        XposedLog.logI(log);
        SaveLog.saveLogContent("Any", getXposedTag() + "[I]: " + log);
    }

    public static void logI(String tag, String log) {
        XposedLog.logI(tag, log);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][I]: " + log);
    }

    public static void logI(String tag, String log, String stackTrace) {
        XposedLog.logI(tag, log, stackTrace);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][I]: " + log + "\n[Stack Info]: " + stackTrace);
    }

    public static void logI(String tag, String log, Throwable e) {
        XposedLog.logI(tag, log, e);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][I]: " + log + "\n[Stack Info]: " + LogExpand.printStackTrace(e));
    }

    public static void logINoSave(String tag, String log) {
        XposedLog.logI(tag, log);
    }

    // ------------ logD --------------
    public static void logD(String tag, String log) {
        XposedLog.logD(tag, log);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][D]: " + log);
    }

    public static void logD(String tag, Throwable e) {
        XposedLog.logD(tag, e);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][D]:\n" + LogExpand.printStackTrace(e));
    }

    public static void logD(String tag, String log, String stackTrace) {
        XposedLog.logD(tag, log, stackTrace);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][D]: " + log + "\n[Stack Info]: " + stackTrace);
    }

    public static void logD(String tag, String log, Throwable e) {
        XposedLog.logD(tag, log, e);
        SaveLog.saveLogContent(tag, getXposedTag() + "[" + HCData.getTargetPackageName() + "][" + tag + "][D]: " + log + "\n[Stack Info]: " + LogExpand.printStackTrace(e));
    }

    private static String getXposedTag() {
        return "[" + HCData.getTag() + "]";
    }
}
