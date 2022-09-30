import java.util.*;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double degree = input.nextDouble();

        double fahrenheit = (9.0 / 5) * degree + 32;

        System.out.println(degree + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
