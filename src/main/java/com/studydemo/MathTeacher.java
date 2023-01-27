package com.studydemo;

public class MathTeacher extends Teacher {
    String mainSubject = "Maths";

    public static void main(String[] args) {
        MathTeacher tech = new MathTeacher();
        System.out.println(tech.college);
        System.out.println(tech.designation);
        System.out.println(tech.mainSubject);
    }
}
