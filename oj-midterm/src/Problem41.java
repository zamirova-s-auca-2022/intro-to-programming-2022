import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        if (a * 3 + b * 2 + c > d * 3 + e * 2 + f) {
            System.out.println("A");
        } else if (a * 3 + b * 2 + c < d * 3 + e * 2 + f) {
            System.out.println("B");
        } else if (a * 3 + b * 2 + c == d * 3 + e * 2 + f) {
            System.out.println("T");
        }
    }
}
