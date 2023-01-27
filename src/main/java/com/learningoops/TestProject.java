package com.learningoops;

import java.util.Scanner;

public class TestProject {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Student Name:");
            String my_name = scan.nextLine();
            System.out.println("Enter the Student Marks:");
            int my_mark = scan.nextInt();
            Student obj = new Student(my_name, my_mark);
            // obj.get_details();
            obj.show_details();
        }
    }
}
