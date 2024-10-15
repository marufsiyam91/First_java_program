package com.maruf;

public class Casting {
    public static void main(String[] args){

        double bigNumber = 25412521254521232212542122212D;
        int storeDouble = (int) bigNumber;


        int number = 2024;
        byte storeInt = (byte) number;

        System.out.println(storeDouble);
        System.out.println(storeInt);
    }
}
