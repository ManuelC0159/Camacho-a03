/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */


package baseline;

public class Solution30 {
    public static void main(String[] args){
        int[][] timesTable = makeTable();
        for(int i =0; i < 12;i++){
            for(int j =0; j < 12; j++){
                System.out.printf("%5d", timesTable[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] makeTable(){
        int[][] temp = new int[12][12];
        for(int i=0; i < 12; i++){
            for(int j=0; j <12; j++){
                temp[i][j] = (i+1)*(j+1);
            }
        }
        return temp;
    }
}

/*
* make a double array to store the table in
* have a method that stores the values of the times table
* in new method, make a double array with size 12
* make a for loop i
* make a nester for loop j inside
* for each loop of j, have the value of i and j multiply and put that in the array
* after loops are over, return array to main
*
* */
