package com.N00byEdge.BD.handlers;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.N00byEdge.BD.lib.Reference;

import cpw.mods.fml.common.FMLLog;

public class LogHelper {

    private static Logger bdLogger = Logger.getLogger(Reference.MODID);

    public static void init() {

        bdLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        bdLogger.log(logLevel, message);
    }

    public static void severe(String message) {

        log(Level.SEVERE, message);
    }

    public static void warning(String message) {

        log(Level.WARNING, message);
    }

    public static void info(String message) {

        log(Level.INFO, message);
    }

    public static void config(String message) {

        log(Level.CONFIG, message);
    }

    public static void fine(String message) {

        log(Level.FINE, message);
    }

    public static void finer(String message) {

        log(Level.FINER, message);
    }

    public static void finest(String message) {

        log(Level.FINEST, message);
    }
}