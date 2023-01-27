package com.sample.string;

public class Stringexample3 {

    public static void main(String[] args) {
        String s = "Java";
        String rev = "";
        int Le = s.length();
        for (int i=Le-1;i>=0;i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
