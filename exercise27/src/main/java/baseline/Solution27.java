/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args){
        String input = validateInput();
        System.out.println(input);
    }
    public static String validateInput(){
        String output;
        output = validateName(input("Enter the first name: "));
        output += validateLastName(input("Enter the last name:"));
        output += validateZip(input("Enter the ZIP doe: "));
        output += validateID(input("Enter the employee ID: "));

        if(output.equals("")){
            System.out.println("There were no errors found");
        }
        return output;
    }

    public static String validateName(String name){
         String text = "";

        if(name.equals("")){
            text = "The first name must be filled in.\n";
        }
        if(name.length()<2){
            text += "The first name must be at least 2 characters long.\n";
        }
        return text;

    }
    public static String validateLastName(String lastName){
        String text = "";

        if(lastName.equals("")){
            text = "The last name must be filled in";
        }
        if(lastName.length()<2){
            text = "The last name bust be at least 2 characters long\n";
        }
        return text;
    }
    public static String validateZip(String zip){
        int zipNum;

        try{
            zipNum = Integer.parseInt(zip);
            if(zipNum >= 100000 || zipNum < 10000){
                throw new NumberFormatException();
            }
        }
        catch(NumberFormatException e){
            return "The zipcode must be a 5 digit number.\n";
        }
        return "";


    }
    public static String validateID(String id){

        String text = "The employee ID must be in the format of AA-1234\n";
        for(int i =0; i < id.length(); i++){
            if(i < 2) {
                if (!Character.isLetter(id.toUpperCase().charAt(i))) {
                    return text;
                }
            }
            else if(i == 2) {
                   if (id.charAt(i) != '-') {
                       return text;
                   }
            }
            else{
                if(!Character.isDigit(id.charAt(i))){
                    return text;
                }
            }
        }
        return "";
    }
    public static String input(String textToSay){
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }
}

/*
* get user input
* create functions that validate each input(first name, last name, zip, id)
* have first function check to see if first name is not blank greater than 2
* have last name function  check for the same things first name checks
* have zip code function check to make the zip code is a 5 digit number
* have the function that checks for ID run a loop to make sure the 3rd character is "-", the first 2 are characters, and the last set to be ints.
* for each validation failed, output error message explaining error
* if no errors found print no errors found
* */
