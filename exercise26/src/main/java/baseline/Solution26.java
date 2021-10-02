/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Manuel Camacho
 *
*/



package baseline;


import java.util.Scanner;

public class Solution26 {

    public static void main(String[] args){
        double balance= Double.parseDouble(input("What is your balance"));
        double apr = Double.parseDouble(input("What is the APR on the card (as a percent)?"));
        double monthlyPayment = Double.parseDouble(input("What is the monthly payment you can make?"));

        PaymentCalculator calc = new PaymentCalculator(balance, apr, monthlyPayment);

        int months = calc.calculateMonthsUntilPaidOff();
        System.out.println("It will take you "+ months + " months to pay off this card.");
    }

    public static String input(String textToSay){
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

}

/*
* get input for apr, balance, and monthly payments
* make new class to do the math
* in new method find daily rate
* in new method use given formula to find months needed to pay
* call the new class in main class
* print the return of the calculations 
* */

