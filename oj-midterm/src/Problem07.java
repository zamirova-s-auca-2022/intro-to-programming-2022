import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstR = input.nextDouble();
        double s = input.nextDouble();

        double secondR = 2 * s - firstR;

        System.out.println(secondR);
    }
}
