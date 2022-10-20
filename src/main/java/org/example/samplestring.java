package org.example;

import java.util.Formatter;

public class samplestring {

    public static String Strreserve(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        samplestring ss = new samplestring();
        System.out.println(ss.Strreserve("KAMARAJ"));

    }
}
