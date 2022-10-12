import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("some real number? ");
        double realNumber = input.nextDouble();
        double save = realNumber;
        if (realNumber < 0) {
            realNumber = -realNumber;
        }
        System.out.printf("|%.4f| = %.4f%n", save, realNumber);
    }
}