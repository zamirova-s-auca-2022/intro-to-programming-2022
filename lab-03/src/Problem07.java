import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        String dayNameToday = "";
        String dayNameInFuture = "";

        switch (today) {
            case 0:
                dayNameToday = "Sunday";
                break;
            case 1:
                dayNameToday = "Monday";
                break;
            case 2:
                dayNameToday = "Tuesday";
                break;
            case 3:
                dayNameToday = "Wednesday";
                break;
            case 4:
                dayNameToday = "Thursday";
                break;
            case 5:
                dayNameToday = "Friday";
                break;
            case 6:
                dayNameToday = "Saturday";
                break;
        }
        System.out.print("Enter the number of days elapsed since today: ");

        int daysElapsed = input.nextInt();
        int futureDay = (today + daysElapsed) % 7;

        switch (futureDay) {
            case 0:
                dayNameInFuture = "Sunday";
                break;
            case 1:
                dayNameInFuture = "Monday";
                break;
            case 2:
                dayNameInFuture = "Tuesday";
                break;
            case 3:
                dayNameInFuture = "Wednesday";
                break;
            case 4:
                dayNameInFuture = "Thursday";
                break;
            case 5:
                dayNameInFuture = "Friday";
                break;
            case 6:
                dayNameInFuture = "Saturday";
                break;
        }
        System.out.printf("Today is %s and the future day is %s%n", dayNameToday, dayNameInFuture);
    }
}
