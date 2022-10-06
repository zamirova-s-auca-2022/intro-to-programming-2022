import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int velocity = input.nextInt();
        double gravitation = -9.8;
        double first = gravitation / 2;
        double negative = velocity * (-1);
        double time = negative / first;
        System.out.printf("%.6f", time);
    }
}
