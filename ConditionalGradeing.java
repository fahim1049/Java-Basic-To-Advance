
import java.util.Scanner;

public class ConditionalGradeing {
    public static void main(String[]args){
        System.out.println("Enter Student Mark:");
        Scanner input = new Scanner(System.in);
        double mark;
        mark = input.nextDouble();

        if(mark>100 || mark<0)
        {
            System.out.println("Invalid");
        }
        else if(mark >=80 && mark<=100)
        {
            System.out.println("A+");
        }
        else if(mark>=70 && mark<=79)
        {
            System.out.println("A");
        }
        else if(mark>=60 && mark<=69)
        {
            System.out.println("A-");

        }
        else if(mark>=50 && mark<=59)
        {
            System.out.println("B");

        }
        else if(mark>=40 && mark<=49)
        {
            System.out.println("C");
        }
        else if(mark>=33 && mark<=39)
        {
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }

    }
}
