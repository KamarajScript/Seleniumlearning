package com.sample;

public class Fibonacci {



     public void type1method() {
         int n = 10,firstTerm = 0,secondTerm = 1;
         System.out.println("Fibonacci Series till " + n + " terms:");
         for (int i=1; i<=n; ++i) {
             System.out.print(firstTerm + ",");
             int nextTerm = firstTerm + secondTerm;
             firstTerm = secondTerm;
             secondTerm = nextTerm;
         }
     }

    public void type2method() {
        int i = 1,n = 10,firstTerm = 0,secondTerm = 1;
        System.out.print("\n");
        System.out.println("Fibonacci Series till " + n + " terms:" );
        while ( i <= n) {
           System.out.print(firstTerm + ",");
           int nextTerm = firstTerm + secondTerm;
           firstTerm = secondTerm;
           secondTerm = nextTerm;
           i++;
          }
        }

    public static void main(String[] args) {
            Fibonacci fib = new Fibonacci();
            fib.type1method();
            fib.type2method();

    }



}
