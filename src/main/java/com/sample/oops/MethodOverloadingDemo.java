package com.sample.oops;

public class MethodOverloadingDemo {

    int a;
    int b;
    int c;
    int d;

    int result;
    double result1;

    public void addition(int a,int b) {
        result = a+b;
    }
    public void addition(int a,int b,int c) {
        result = a+b+c;
    }
    public void addition(int a,int b,int c,int d) {
        result = a+b+c+d;
    }
    public void addition(int a,double a1) {
        result1 = a + a1;
    }

    public void PrintResult(){
        System.out.println(result);
    }
    public void PrintResult1(){
        System.out.println(result1);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo meov = new MethodOverloadingDemo();
        meov.addition(10,20);
        meov.PrintResult();
        meov.addition(10,20,30);
        meov.PrintResult();
        meov.addition(10,20,30,40);
        meov.PrintResult();
        meov.addition(10,20.98);
        meov.PrintResult1();
    }


}
