import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int number = input.nextInt();

        int sumOfDigit = 0;

        sumOfDigit += number % 10;
        number /= 10;
        sumOfDigit += number % 10;
        number /= 10;
        sumOfDigit += number % 10;
        number /= 10;
        sumOfDigit += number % 10;
        number /= 10;

        System.out.println("The sum of all digits is "+ sumOfDigit);
    }
}
