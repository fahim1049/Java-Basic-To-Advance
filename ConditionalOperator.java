import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        System.out.println("Enter Two Number : ");
        int num1,num2,big;
        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();

        big = (num1>num2) ? num1 : num2;
        System.out.println("Large Number = " +big);


    }
}
