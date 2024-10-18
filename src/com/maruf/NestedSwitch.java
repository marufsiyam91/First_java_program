package com.maruf;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int employeeId = in.nextInt();
        String department = in.next();


        switch (employeeId){
            case 1:
                System.out.println("Maruf Siyam");
                break;
            case 2:
                System.out.println("Rakib hossain");
                break;
            case 3:
                System.out.println("Rahim");
                switch (department){
                    case "development":
                        System.out.println("your Id is 3 and you belong from developer development");
                        break;
                    case "management":
                        System.out.println("your Id is 3 and you belong from management department");
                        break;
                    case "design":
                        System.out.println("your Id is 3 and you belong from design department");
                        break;
                    default: System.out.println("provide a valid department");
                }
                break;
            default: System.out.println("enter a valid id or department");
        }



    }
}
