package com.maruf;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0;
        int b = 1;

        int fibonacchi = 0;



        if(n == 1){
            fibonacchi = a;
        }else if(n == 2) {
            fibonacchi = b;
        }
        else{
        for(int num = 2; num <= n; num++){
            fibonacchi = a + b;
            a= b;
            b = fibonacchi;
        }
        }

        System.out.println("fibonacchi number at position " + n + " is " + fibonacchi);
    }
}
