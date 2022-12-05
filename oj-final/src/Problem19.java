import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number1 = scan.nextLong();
        long number2 = scan.nextLong();
        int i = 0;

        while (i < 1000) {
            i++;
            if ((number1 * i - 1) % number2 == 0) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("No such integer exists.");
    }
}
