package com.maruf;

public class Loops {
    public static void main(String[] args){

        int value = 1;

        while(value != 11){

            int innerValue = 1;
            while (innerValue != 11) {
                System.out.println(value + " * " + innerValue + " = " + (value * innerValue));
                innerValue++;
            }
            value++;
        };
    }
}
