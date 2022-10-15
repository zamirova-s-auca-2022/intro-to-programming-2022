import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int centimetersHigh = input.nextInt();
        int degreesGround = input.nextInt();

        double ladderLength = Math.sin(degreesGround) * centimetersHigh;
        System.out.println(ladderLength);
    }
}