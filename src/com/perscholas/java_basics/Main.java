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
       /* System.out.println("Enter status: ");
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


        System.out.println("Enter your birth year: ");
        int userYear = input.nextInt();
        int year = userYear % 12;
        String output;

        switch(year){
            case 0: System.out.println("Monkey"); break;
            case 1: System.out.println("Rooster"); break;
            case 2: System.out.println("Dog"); break;
            case 3: System.out.println("Pig"); break;
            case 4: System.out.println("Rat"); break;
            case 5: System.out.println("Ox"); break;
            case 6: System.out.println("Tiger"); break;
            case 7: System.out.println("Rabbit"); break;
            case 8: System.out.println("Dragon"); break;
            case 9: System.out.println("Snake"); break;
            case 10: System.out.println("Horse"); break;
            case 11: System.out.println("Sheep"); break;
            default : System.out.println("null"); break;
        }
*/
        double userWeight;
        double userHeight;
        double sqrHeight;
        double bmi;

        System.out.println("Enter your height in meters: ");
        userHeight = input.nextDouble();
        System.out.println("Enter your weight in kilograms: ");
        userWeight = input.nextDouble();
        sqrHeight = (userHeight * userHeight);
        bmi = userWeight / sqrHeight;
        System.out.printf("Your BMI is %.2f :", bmi);





    }//end main
}//end class
