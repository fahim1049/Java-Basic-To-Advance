 /*
 Logical or assignment
 step 1: Print "Do you love java? "
step 2: take user input y / Y / n / N
 step 3: if user input y / Y then print you are a java lover
 step 4: if user input n / N then print you are not a java lover
  */


import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        System.out.println("Enter Your Latter:");
            Scanner input = new Scanner(System.in);
            char ch;
            ch = input.next().charAt(0);

            if(ch=='y' || ch=='Y'){
                System.out.println("You are Java Lover");
            }
            else if(ch=='n' || ch=='N'){
                System.out.println("You are Not Java Lover");
            }
    }
}
