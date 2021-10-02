package baseline;

import java.util.Scanner;

public class Solution25 {



    public static void main(String[] args){
        String password = input();
        int strength = passwordValidator(password);
        output(strength, password);
    }
    public static String input(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int passwordValidator(String password){
        boolean letters = false;
        boolean numbers = false;
        boolean symbols = false;

        for(int i =0; i< password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))) {
                letters = true;
            }
            if (Character.isDigit(password.charAt(i)))
            {
                numbers = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                symbols = true;
            }
        }
        if(password.length() < 8 && letters){
            return 1;
        }
        else if(password.length() > 8 && numbers && symbols){
            return 3;
        }
        else if(password.length() > 8 && numbers){
            return 2;
        }
        else if(password.length() < 8){
            return 0;
        }

        return 4;
    }
    public static void output(int num, String password){
        if(num ==0){
            System.out.println("The password \""+password +"\" is a very weak password.");
        }
        if(num==1){
            System.out.println("The password \""+password +"\" is a weak password.");

        }
        if(num ==2){
            System.out.println("The password \""+password +"\" is a strong password");

        }
        if(num==3){System.out.println("The password \""+password +"\" is a  very strong password");

        }
        else if(num==4){
            System.out.println("The password \""+password +"\" is of unknown strength");
        }

    }
}


