import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Enter Your Latter:");
        Scanner input = new Scanner(System.in);
        char ch;
        ch = input.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Small Latter");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Capital Latter");
        }
    }
}
