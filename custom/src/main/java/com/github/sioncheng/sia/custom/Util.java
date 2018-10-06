package com.github.sioncheng.sia.custom;

class Util {

    public static void printCallstack() {
        StackTraceElement[] stes = Thread.currentThread().getStackTrace();
        if (stes.length <= 2 ) {
            return;
        }
        for (int i = 2; i < stes.length; i++) {
            System.out.println(stes[i]);
        }
    }
}
