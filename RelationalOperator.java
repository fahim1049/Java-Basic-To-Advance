import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num;
        num = input.nextInt();
        if(num>0){
            System.out.println("Number Is Positive");
        }
        if(num<0){
            System.out.println("Number Is Negative");
        }

        
    }
}
