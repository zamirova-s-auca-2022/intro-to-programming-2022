import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double firstRoot = ((-1) * b + Math.pow(discriminant, 0.5)) / 2 * a;
        double secondRoot = ((-1) * b - Math.pow(discriminant, 0.5)) / 2 * a;

        if (discriminant == 0){
            System.out.println("The equation has one " + firstRoot);
        }
        if (discriminant > 0){
            System.out.printf("The equation has two roots %.6f and %.5f%n", firstRoot, secondRoot);
        }
        if (discriminant < 0){
            System.out.println("The equation has no real roots");
        }
    }
}