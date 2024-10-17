package com.maruf;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Language = input.nextLine();

        switch (Language){
            case "C" -> System.out.println("You are a pro programmer and your language is a lower level language");
            case "C++" -> System.out.println("You are likely a better programmer and your language is a mid level language");
            case "Python" -> System.out.print("Your language is a higher level object oriented programming language.");
            case "Javascript" -> System.out.println("You write code in world's most popular programming language");
            case "Java" ->  System.out.println("Now you are coding on this language. and you are the programmer");
            default ->  System.out.println("In which language do you code and program");
        }
    }
}
