/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Manuel Camacho
 */



package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args){

        int sum = findSum();
        System.out.println("The total is "+sum);
    }
    public static int findSum(){

        int sum = 0;
        for (int i = 0; i < 5; i++){
            int temp = Integer.parseInt(input("Enter a number: "));
            sum += temp;
        }
        return sum;
    }

    public static String input(String textToSay){
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

}
/*
* make a function that creates a loop that repeats 5 times total
* before the loop, make a sum variable = 0
* each time the loop loops, get int from the user
* add int into sum until it loops all 5 times
* return sum
* print sum
* */