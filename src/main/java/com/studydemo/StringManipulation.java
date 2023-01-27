package com.studydemo;

import io.cucumber.plugin.event.Node;

public class StringManipulation {

    public static void main(String[] args) {

        String str1 = "abc";
        char[] arr ={'a','b','c'};
        String str2 = new String(arr);
        System.out.println((str1.equals(str2))+ " , " + (str1==str2));

        String str = "Automation Elearn" + " ";
        //System.out.println(str);
        str = str.concat("Sadhasivam");
        //System.out.println(str);
        str = str.toUpperCase();
        //System.out.println(str);
        str = str.replace("SADHASIVAM", "Sivam");
        System.out.println(str);
    }
}
