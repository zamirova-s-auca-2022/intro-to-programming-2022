import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        String correctNumber;
        if (numbers >= 5550000) {
            correctNumber = "1";
        } else {
            correctNumber = "0";
        }
        System.out.println(correctNumber);
    }
}