package com.perscholas.java_basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     /*
     ask for status
     ask for income
     if statement for status and tax rate
     if income and taxrate
     display 
      */
        System.out.println("Enter status: ");
        String userStatus = input.nextLine();
        System.out.println("Enter income: ");
        int userIncome = input.nextInt();
    //filing single
        if (userStatus.equalsIgnoreCase("single") && (userIncome >= 0 && userIncome <= 8350)) {
            System.out.println("Your tax rate is 10%");
        } else if
        (userStatus.equalsIgnoreCase("single") && (userIncome >= 8351 && userIncome <= 33950)) {
            System.out.println("Your tax rate is 15%");
        } else if
        (userStatus.equalsIgnoreCase("single") && (userIncome >= 33951 && userIncome <= 82250)) {
            System.out.println("Your tax rate is 20%");
        } else if
        (userStatus.equalsIgnoreCase("single") && (userIncome >= 82251 && userIncome <= 171550)) {
            System.out.println("Your tax rate is 28%");
        } else if
        (userStatus.equalsIgnoreCase("single") && (userIncome >= 171551 && userIncome <= 372950)) {
            System.out.println("Your tax rate is 33%");
        } else if ((userStatus.equalsIgnoreCase("single") && (userIncome >= 372951))){
            System.out.println("Your tax rate is 35%");
        }
    //filling married jointly
        if (userStatus.equalsIgnoreCase("married jointly") && (userIncome >= 0 && userIncome <= 16700)) {
            System.out.println("Your tax rate is 10%");
        } else if (userStatus.equalsIgnoreCase("married jointly") && (userIncome >= 16701 && userIncome <= 67900)) {
            System.out.println("Your tax rate is 15%");
        } else if
        (userStatus.equalsIgnoreCase("married jointly") && (userIncome >= 67901 && userIncome <= 137050)) {
            System.out.println("Your tax rate is 20%");
        } else if
        (userStatus.equalsIgnoreCase("married jointly") && (userIncome >= 137051 && userIncome <= 208850)) {
            System.out.println("Your tax rate is 28%");
        } else if
        (userStatus.equalsIgnoreCase("married jointly") && (userIncome >= 208851 && userIncome <= 372950)) {
            System.out.println("Your tax rate is 33%");
        } else if (userStatus.equalsIgnoreCase("married jointly") && userIncome >= 372951) {
            System.out.println("Your tax rate is 35%");
        }
    //filing married seperate
        if (userStatus.equalsIgnoreCase("married seperate") && (userIncome >= 0 && userIncome <= 8350)) {
            System.out.println("Your tax rate is 10%");
        } else if (userStatus.equalsIgnoreCase("married seperate") && (userIncome >= 8351 && userIncome <= 33950)) {
            System.out.println("Your tax rate is 15%");
        } else if
        (userStatus.equalsIgnoreCase("married seperate") && (userIncome >= 33951 && userIncome <= 68525)) {
            System.out.println("Your tax rate is 20%");
        } else if
        (userStatus.equalsIgnoreCase("married seperate") && (userIncome >= 68526&& userIncome <= 104425)) {
            System.out.println("Your tax rate is 28%");
        } else if
        (userStatus.equalsIgnoreCase("married seperate") && (userIncome >= 104426 && userIncome <= 186475)) {
            System.out.println("Your tax rate is 33%");
        } else if (userStatus.equalsIgnoreCase("married seperate") && userIncome >= 186476) {
            System.out.println("Your tax rate is 35%");
    //filling head of house
        }if (userStatus.equalsIgnoreCase("head") && (userIncome >= 0 && userIncome <= 11950)) {
            System.out.println("Your tax rate is 10%");
        } else if (userStatus.equalsIgnoreCase("head") && (userIncome >= 11951 && userIncome <= 45500)) {
            System.out.println("Your tax rate is 15%");
        } else if
        (userStatus.equalsIgnoreCase("Head") && (userIncome >= 45501 && userIncome <= 117450)) {
            System.out.println("Your tax rate is 20%");
        } else if
        (userStatus.equalsIgnoreCase("head") && (userIncome >= 117451 && userIncome <= 190200)) {
            System.out.println("Your tax rate is 28%");
        } else if
        (userStatus.equalsIgnoreCase("head") && (userIncome >= 190201 && userIncome <= 372950)) {
            System.out.println("Your tax rate is 33%");
        } else if (userStatus.equalsIgnoreCase("head") && userIncome >= 372951) {
            System.out.println("Your tax rate is 35%");
        }

    }//end main
}//end class
