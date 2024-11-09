import java.util.Scanner;
public class ArithmeticOperator {
     public static void main(String[]args){
         Scanner Input = new Scanner(System.in);
         int a,b,result;


         System.out.print("Enter Your First Number :");
         a = Input.nextInt();
         System.out.print("Enter Your Second Number :");
         b = Input.nextInt();

         result = a + b;
         System.out.println("Addition Is : " +result);

         result = a - b;
         System.out.println("Subtraction Is : " +result);

         result = a * b;
         System.out.println("Multiplication Is : " +result);

         double result2 = (double) a / b; // Type Casting Variable
         System.out.println("Division Is : " +result2);

         result = a % b;
         System.out.println("Modulus Is : " +result);



     }
}
