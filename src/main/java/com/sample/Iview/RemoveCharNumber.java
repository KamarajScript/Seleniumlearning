package com.sample.Iview;

public class RemoveCharNumber {

    public static String removeAllDigit(String str) {

        return str.replaceAll("\\d", "");

    }

    public static void main(String[] args) {
        String str = "Java123Programmer";
        System.out.println(removeAllDigit(str));
    }
}
