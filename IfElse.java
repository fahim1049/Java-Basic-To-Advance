import java.util.Scanner;

public class IfElse {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Letter : ");
        char ch;
        ch = input.next().charAt(0);
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            System.out.println("Given character is an vowel");
        }else{
            System.out.println("Given character is a consonant");
        }
    }
}
