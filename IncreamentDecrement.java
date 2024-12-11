public class IncreamentDecrement {
    public static void main(String[] args) {
        //post increment

        int x = 25;
        int y;

        y = x++;
        System.out.println("y = " +y);
        y = x;
        System.out.println("y = " +y);

        //pre increment

        int n = 25;
        int a ;

        a = ++n;
        System.out.println("n = " +a);

        a = n;

        System.out.println("n = " +a);

        //post decrement

        int q = 25;
        int w;
        w = q--;
        System.out.println("w = " +w);

        w = q;
        System.out.println("w = " +w);
         //pre decrement

        int e = 25;
        int r;

        r = --e;
        System.out.println("r = " +r);

        r = e;
        System.out.println("r = " +r);



    }
}
