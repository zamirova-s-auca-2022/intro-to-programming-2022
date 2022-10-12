import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstDigit = input.nextInt();
        int secondDigit = input.nextInt();
        int firstSwap = firstDigit;
        firstDigit = secondDigit;
        secondDigit = firstSwap;
        System.out.print(firstDigit);
        System.out.print(secondDigit);

    }
}
