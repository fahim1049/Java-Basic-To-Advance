
import java.util.ArrayList;
public class Array2 {
    public static void main(String[] args) {
        ArrayList<Integer> number  =  new ArrayList<>();
        System.out.println("size = "+number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        System.out.println(number);
    }
}
