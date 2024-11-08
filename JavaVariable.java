public class JavaVariable {
    public static void main(String[]args){
        System.out.println("Java Variable : ");
        int a;
        float f;
        double d;
        char c;
        boolean b;

        a = 221351049;
        f = 1049.35f;
        d = 1049.35;
        c = 'f';
        b = true;
        System.out.println("integer = " +a);
        System.out.println("Float = " +f);
        System.out.print("double = " +d);
        System.out.println("Charecter = " +c);
        System.out.println("Boolean = " +b);

        //Dynamic Initializer Example
        /*
        Dynamic Initializer means Value adder with variable
        such as int a = 1049 it is dynamic initializer lets see below :
         */

        int integer = 1049;

        System.out.println("Dynamic Initializer Example : ");
        System.out.println("Interger = " +integer);

    }
}
