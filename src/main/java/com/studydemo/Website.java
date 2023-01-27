package com.studydemo;

public class Website {

          String WebName;
          int  WebAge;

          Website(String name, int age) {
            this.WebAge = age;
            this.WebName = name;
          }

    public static void main(String[] args) {
         Website wb = new Website("Kamaraj", 90);
         Website wb2 = new Website("Arulraja", 20);
         System.out.println(wb.WebName + " " + wb.WebAge);
         System.out.println(wb2.WebName + " " + wb2.WebAge);
    }

}
