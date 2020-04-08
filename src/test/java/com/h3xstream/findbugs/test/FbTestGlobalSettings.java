package com.h3xstream.findbugs.test;

public class FbTestGlobalSettings {

    private static boolean runningFromMaven = false;

    public static boolean isRunningFromMaven() {
        return runningFromMaven;
    }

    public static void setRunningFromMaven(boolean runningFromMaven) {
        FbTestGlobalSettings.runningFromMaven = runningFromMaven;
    }
}