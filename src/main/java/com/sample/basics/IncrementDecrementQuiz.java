package com.sample.basics;

public class IncrementDecrementQuiz {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        c= a + b + a++ + b++ + ++a + ++b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
