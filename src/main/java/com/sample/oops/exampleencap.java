package com.sample.oops;

public class exampleencap {

    private int age;

    public void setAge(int ageStudent) {
        if (ageStudent > 0) {
            age = ageStudent;
            System.out.println("Age is " + age);
        } else {
             age = 0;
            System.out.println("Age is :" + age);
        }
    }

    public static void main(String[] args) {
        exampleencap ex = new exampleencap();
        ex.age = 45;
        ex.setAge(ex.age);
    }
}
