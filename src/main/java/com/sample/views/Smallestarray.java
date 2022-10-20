package com.sample.views;

public class Smallestarray {



    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 1, 4, 9, 3 };
        int temp = arr[0];
        for (int i=1; i <arr.length; i++) {
              if ( temp > arr[i]) {
                  temp = arr[i];
            }

        }
        System.out.println("Smallest Number: " + temp);
    }

}
