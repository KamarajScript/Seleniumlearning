package com.studydemo;

public class EncapsulationExample {

    public static void main(String[] args) {
        EmployeeCount obj = new EmployeeCount();
        obj.setNumOfEmployees(5616);
        System.out.println("No of Employees: " + obj.getNoOfEmployees());
    }
}
