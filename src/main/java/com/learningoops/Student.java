package com.learningoops;

import java.util.Scanner;

public class Student {

    String name = "";
    int marks = 0;

    public Student(String n, int m) {
        name = n;
        marks = m;
    }

    public void get_details() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Student Name:");
            name = scan.nextLine();
            System.out.println("Enter the Student Marks:");
            marks = scan.nextInt();
        }

    }

    public void show_details() {
        System.out.println("Name of the Student:" + name);
        System.out.println("Marks Scored by the Student are:" + marks);
    }
}
