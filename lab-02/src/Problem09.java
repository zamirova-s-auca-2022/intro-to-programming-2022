import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the number of minutes: ");
        int m = input.nextInt();
        double year = m / 60 / 24 / 365;
        double  rem = m % (60 * 24 * 365);
        double  day = rem / (60 * 24);

        System.out.print(m + " minutes is approximately ");
        System.out.printf("%.0f", year);
        System.out.print(" years ");
        System.out.printf("%.0f", day);
        System.out.print(" days");
    }
}
