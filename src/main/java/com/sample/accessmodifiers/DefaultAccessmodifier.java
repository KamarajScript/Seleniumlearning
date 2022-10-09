package com.sample.accessmodifiers;

public class DefaultAccessmodifier {
    // Private Access Modifier
    int a;
    int b;

    int result;

    void addition() {
        result = a + b;
    }

    DefaultAccessmodifier() {
        int a = 10;
        int b = 5;
    }

    void printResult() {

        System.out.println(result);
    }

    public static void main(String[] args) {
        DefaultAccessmodifier arth = new DefaultAccessmodifier();
        arth.a =10;
        arth.b =20;
        arth.addition();
        arth.printResult();

    }
}
