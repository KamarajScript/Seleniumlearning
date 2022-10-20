package com.sample.views;


import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int count = 0;
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            if(n%i==0)
                count++;
        }
        if(count == 2) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

    }
}

