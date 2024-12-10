import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius,area;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter Radius: ");
        radius = input.nextDouble();


        area = 3.1416*radius*radius;

        System.out.println("Area of Circle : " +area);

    }
}
