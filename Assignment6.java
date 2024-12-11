/*
 * Digit spelling program using if,else if, else
 * step 1: ask for a digit between 0-9
 * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
 * step 3: if the digit is not among 0-9 then print Invalid digit
 */


import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        System.out.println("Enter Your Digit: ");
        Scanner input = new Scanner(System.in);
        int digit;
        digit = input.nextInt();

        if(digit==0){
            System.out.println("Enter Zero");
        }
        else if(digit==1){
            System.out.println("Enter One");
        }
        else if(digit==2){
            System.out.println("Enter Two");
        }
        else if(digit==3){
            System.out.println("Enter Three");
        }
        else if(digit==4){
            System.out.println("Enter Four");
        }
        else if(digit==5){
            System.out.println("Enter Five");
        }
        else if(digit==6){
            System.out.println("Enter Six");
        }
        else if(digit==7){
            System.out.println("Enter Seven");
        }
        else if(digit==8){
            System.out.println("Enter Eight");
        }
        else if(digit==9){
            System.out.println("Enter Nine");
        }
        else{
            System.out.println("Invalid Digit");
        }
    }
}
