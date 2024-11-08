import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        String Me;
        System.out.print("Enter Your Name : ");
        Me = name.nextLine();
        System.out.println("My name is " +Me);

    }
}
