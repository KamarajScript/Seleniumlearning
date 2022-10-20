package com.sample.views;

import java.util.Scanner;

public class Compositenumber {


    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(n%i==0)
               count++;
        }
        if (count>3){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
