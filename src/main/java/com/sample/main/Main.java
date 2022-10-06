package com.sample.main;

import com.sample.basics.Helloworld;
import com.sample.oops.Address;

public class Main {

    public static void main(String[] args) {
        Helloworld helloworld = new Helloworld();
        helloworld.printWorld();
        Address address = new Address();
        address.printAddress();
       // Address Address1 = new Address("900","ABC Street","Chennai",300020);
    }

}
