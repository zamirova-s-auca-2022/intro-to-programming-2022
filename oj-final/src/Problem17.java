import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int total = 0;

        while (number > (int) (Math.pow(2, total))) {
            total++;
        }
        System.out.println(total);
    }
}