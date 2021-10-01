package baseline;

import java.util.Arrays;
import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Manuel Camacho
 */
public class Solution24 {
    public static void main(String[] args){
        System.out.println("Enter two strings and I'll tell you if they are anagrams");
        String string1 = input("Enter the first string: ");
        String string2 = input("Enter the second string: ");

        if(isAnagram(string1, string2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams", string1, string2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams", string1, string2);
        }
    }

    public static String input(String textToSay) {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] firstArray = s1.toLowerCase().toCharArray();
        char[] secondArray = s2.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }
}
