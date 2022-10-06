import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int dif = b - a;
        int c = b + dif;
        System.out.println(c);
    }
}
