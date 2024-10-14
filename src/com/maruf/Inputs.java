package com.maruf;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your rollNumber here: ");
        int rollNumber = input.nextInt();
        System.out.println("your roll number is " + rollNumber);
    }
}
