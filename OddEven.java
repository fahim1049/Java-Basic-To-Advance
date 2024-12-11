import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter Your Number: ");
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if(num % 2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
