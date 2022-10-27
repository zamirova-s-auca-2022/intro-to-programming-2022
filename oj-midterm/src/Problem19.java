import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);
        System.out.println(discriminant);

    }
}
