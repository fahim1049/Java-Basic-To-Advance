/*
 switch assignment: call center
 if user select option 1 then set language bengali
 if user select option 2 then set language hindi
 if user select option 3 then set language urdu
 for any other option set language english
 */

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("Enter Your option: " );
        Scanner input  = new Scanner(System.in);
        int digit;
        digit = input.nextInt();

        switch (digit){
            case 1:
                System.out.println("Bengali");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Urdu");
                break;
            default:
                System.out.println("English");

        }
    }
}
