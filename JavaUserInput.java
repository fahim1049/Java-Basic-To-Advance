import java.util.Scanner;
public class JavaUserInput {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter Your Number :");
        number=input.nextInt();
        System.out.println("Number = " +number);


    }
}
