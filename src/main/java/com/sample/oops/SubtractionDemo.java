package com.sample.oops;

import com.sample.accessmodifiers.ProtectedAccessmodifier;

public class SubtractionDemo extends ProtectedAccessmodifier {

    public static void main(String[] args) {
        SubtractionDemo sub = new SubtractionDemo();
        sub.a = 10;
        sub.b = 10;
        sub.addition();
        sub.printResult();
    }


}
