package com.sample.accessmodifiers;

public class ProtectedAccessmodifier {
    // Private Access Modifier
    protected int a;
    protected int b;

    protected int result;

    // Private Access Modifier
    protected void addition() {
        result = a + b;
    }

    // Private Access Modifier
    protected ProtectedAccessmodifier() {
        a = 10;
        b = 5;
    }

    // Private Access Modifier
    protected void printResult() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        ProtectedAccessmodifier arth = new ProtectedAccessmodifier();
        arth.a = 10;
        arth.b = 20;
        arth.addition();
        arth.printResult();

    }
}
