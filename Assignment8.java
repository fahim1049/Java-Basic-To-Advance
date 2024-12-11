/*
Logical AND assignment
Check eligible candidate
Step 1: Ask the candidate have you completed your masters? y/n
Step 2: Ask the candidate are you fulent in English? y/n
Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
Step 4: else print Sorry. you are not eligible to for the job interview
 */




import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        System.out.println("Are You Complete Masters?");
        Scanner input = new Scanner(System.in);
        char ans1;
        ans1 = input.next().charAt(0);
        System.out.println("Are You Fluent in English?");
        char ans2;
        ans2 = input.next().charAt(0);

        if (ans1 == 'y' || ans1=='Y' && ans2 == 'y'|| ans2=='Y') {
            System.out.println("you are the eligible candidate");
        } else {
            System.out.println("you are not eligible to for the job interview");
        }

    }
}
