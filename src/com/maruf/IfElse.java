package com.maruf;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int baseSalary = input.nextInt();


        if(baseSalary > 25000) {
            baseSalary = baseSalary + 5000;
        }
        else {
            baseSalary = baseSalary + 2000;
        }

        System.out.println(baseSalary);

    }}
