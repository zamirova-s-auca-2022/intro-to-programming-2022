import java.util.Scanner;

public class Problem02 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = readInt("year: ", "Incorrect year", 1, 1000000);
        int month = readInt("month: ", "Incorrect month", 1, 1000000);
        System.out.print("Number of days: " + getNumberOfDays(year, month));
    }

    static int getNumberOfDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return isLeap(year) ? 29 : 28;
        }
    }

    static int readInt(String prompt, String errorMessage, int minValue, int maxValue) {
        System.out.print(prompt);
        int res = input.nextInt();
        if (res < minValue || maxValue < res) {
            System.out.print(errorMessage);
            System.exit(1);
        }
        return res;
    }

    static boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}