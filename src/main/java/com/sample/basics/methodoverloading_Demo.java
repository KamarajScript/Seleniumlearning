package com.sample.basics;

public class methodoverloading_Demo {

    public void calculation(int a,int b){
        System.out.println("Sum of 2 Number:" + (a+b));
    }

    public void calculation(int x,Double y){
        System.out.println("Sum of 2 Number:" + (x+y));
    }

    public void calculation(float x,float y){
        System.out.println("Sum of 2 Number:" + (x+y));
    }

    public void calculation(float x,Double y){
        System.out.println("Sum of 2 Number:" + (x+y));
    }

    public static void main(String[] args) {
        methodoverloading_Demo add = new methodoverloading_Demo();
        add.calculation(10,20);
        add.calculation(10,30.00);
        add.calculation(3.0f,4.0f);
        add.calculation(2.0f,4);
    }


}
