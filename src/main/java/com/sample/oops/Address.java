package com.sample.oops;

public class Address {

    String DNo;
    String StreetName;
    String City;
    int pin;

    public void printAddress() {
        System.out.println("DNo :" + DNo+"\n"+"StreetName :" + StreetName+"\n"+"City :" + City+"\n"+"Pin :" + pin+"\n");
    }

    public Address() {
        DNo = "130";
        StreetName = "XYZ Street";
        City = "Chennai";
        pin = 600042;
    }

    Address(String Dno,String StreetName,String City,int pin) {
        this.DNo = Dno;
        this.StreetName = StreetName;
        this.City = City;
        this.pin = pin;

    }

 /*   public static void main(String[] args) {
        Address address = new Address();
        address.printAddress();
        System.out.println("\n");
        Address Address1 = new Address("900","ABC Street","Chennai",300020);
        Address1.printAddress();
        System.out.println("\n");
        address.printAddress();
    }*/

}
