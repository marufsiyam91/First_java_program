package com.maruf;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){

//        int value = 1;
//
//        while(value != 11){
//
//            int innerValue = 1;
//            while (innerValue != 11) {
//                System.out.println(value + " * " + innerValue + " = " + (value * innerValue));
//                innerValue++;
//            }
//            value++;
//        };


        // print numbers from 1 to n


        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for(int num = 0; num <= number; num++){
            System.out.println("the value is now " + num);

            num++;
        }
    }
}
