package com.sample.Iview;

public class ExampleMethodOverload {

    public void insertStudent(int age,String loc,int phoneNo) {
        System.out.println("Student Info without AadharCard");
    }

    public void insertStudent(int age,String loc,int phoneNo,long  aadharCardNo) {
        System.out.println("Student Info with AadharCard");
    }



    public static void main(String[] args) {
        ExampleMethodOverload emo = new ExampleMethodOverload();
        emo.insertStudent(10,"pune",600002);
        ExampleMethodOverload emo1 = new ExampleMethodOverload();
        emo1.insertStudent(10,"SET", 600032, 1289_9120_2111_2212l);
        emo1.insertStudent(20,"TEST", 709920);
    }
}
