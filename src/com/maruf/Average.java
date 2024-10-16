package com.maruf;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();


        int total = 0;
        for(int i = 1; i <= number; i++){
            total += i;
        }

        float average = (float) total / number;
        System.out.println(average);

    }
}
