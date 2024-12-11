import java.util.Scanner;

public class Assignment5 {
    public static void main(String[]args){
        System.out.println("Enter Your Age : ");
        Scanner input  = new Scanner(System.in);
        int age;
        age = input.nextInt();
        if(age>=18){
            System.out.println("Valid For Vote");
        }
        else {

            System.out.println("Not valid For Vote");
        }
    }
}
