package com.github.sioncheng.sia.custom;

class Util {

    public static void printCallstack() {
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }
    }
}
