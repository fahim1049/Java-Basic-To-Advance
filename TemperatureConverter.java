import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cel,far;
        System.out.println("Celsius = ");
        cel = input.nextDouble();

        far = 1.8*cel*32;

        System.out.println("Fahrenheit = " +far);
    }
}
