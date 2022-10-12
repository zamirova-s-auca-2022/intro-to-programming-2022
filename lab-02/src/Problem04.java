import java.util.Scanner;

public class Problem04 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double length = input.nextDouble();

        double lengthInInch = CM_PER_INCH * length;
        System.out.printf("%.2f in. = %.2f cm.%n", length, lengthInInch);
    }
}
