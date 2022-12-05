import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int n = input.nextInt();
        int p = input.nextInt();
        int infect = 0;
        int day = -1;

        while (infect <= r) {
            infect += n;
            n *= p;
            day++;
        }
        System.out.println(day);
    }
}
