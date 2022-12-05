import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int n = input.nextInt();
        int p = input.nextInt();
        int impact = 0;
        int day = -1;

        while (impact <= r) {
            impact += n;
            n *= p;
            day++;
        }
        System.out.println(day);
    }
}
