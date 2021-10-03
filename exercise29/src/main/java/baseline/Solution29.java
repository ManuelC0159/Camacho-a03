/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */



package baseline;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args){

        int counter =0;
        do{
            String rate = input("What is the rate of return?");

            counter = findYears(rate);


        }while(counter <= 0);
        System.out.println("It will take"+counter+ "years to double your initial investment ");
    }

    public static int findYears(String rate){

     try{
         int rateInt = Integer.parseInt(rate);
         int years = 72 /rateInt;
         if(years>0){
             return years;
         }
     }
     catch(NumberFormatException e){
         System.out.println("Only enter a number, try again");
     }
     catch(ArithmeticException e){
         System.out.println("Cannot divide by 0");
     }
        return 0;
    }
    public static String input(String textToSay){
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }
}
/*
* start a counter at 0
* do a loop that repeats while counter is <= 0
* in the loop ask user for rate
* validate the user rate through try and catch method
* if it's not a valid input repeat loop and try again
* if divided by zero repeat loop
* if input is valid print results and end loop
* */