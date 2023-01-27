package com.sample.string;

public class Mainstring {

    public static void main(String[] args) {
        String a = "Arulraja";
        System.out.println(a);
        a = "Kamaraj";
        System.out.println(a);
        String b = "Kamaraj";
        System.out.println(a == b);

        String name = new String("Kamaraj");
        String bb = new String("Kamaraj  ");
        System.out.println(name);
        System.out.println(bb);
        System.out.println(name.equals(bb));
    }
}
