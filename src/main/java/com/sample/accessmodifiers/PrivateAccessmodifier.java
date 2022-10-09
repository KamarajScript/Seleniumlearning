package com.sample.accessmodifiers;

public class PrivateAccessmodifier {
    // Private Access Modifier
    private  int a;
    private  int b;

    private int result;

    // Private Access Modifier
    private void addition() {
        result = a + b;
    }

    // Private Access Modifier
    private PrivateAccessmodifier() {
        int a = 10;
        int b = 5;
    }

    // Private Access Modifier
    private void printResult() {
        System.out.println(result);
    }
    public static void main(String[] args) {
        PrivateAccessmodifier arth = new PrivateAccessmodifier();
        arth.a =10;
        arth.b =20;
        arth.addition();
        arth.printResult();

    }
}
