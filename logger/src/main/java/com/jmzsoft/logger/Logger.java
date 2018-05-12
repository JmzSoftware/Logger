package com.jmzsoft.logger;

import android.content.Context;
import android.util.Log;

import java.lang.reflect.Field;

public class Logger {

    private static Context context;

    public static void init(Context ctx) {
        context = ctx;
    }

    public static void error(String text) {
        if (getBuildConfigValue() && getBuildConfigValue() != null) {
            Log.e(context.getPackageName(), text);
        }
    }

    public static void verbose(String text) {
        if (getBuildConfigValue() && getBuildConfigValue() != null) {
            Log.v(context.getPackageName(), text);
        }
    }

    public static void info(String text) {
        if (getBuildConfigValue() && getBuildConfigValue() != null) {
            Log.i(context.getPackageName(), text);
        }
    }

    public static void out(String text) {
        if (getBuildConfigValue() && getBuildConfigValue() != null) {
            System.out.println(text);
        }
    }

    public static Boolean getBuildConfigValue() {
        try {
            Class<?> clazz = Class.forName(context.getPackageName() + ".BuildConfig");
            Field field = clazz.getField("DEBUG");
            return (Boolean) field.get(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

}
