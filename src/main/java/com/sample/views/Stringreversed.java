package com.sample.views;

import java.util.Scanner;

public class Stringreversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = sc.nextLine();
        System.out.println("Reverse String:");
        int n = str.length();
        for (int i=n-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
