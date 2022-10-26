import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();
        if (hour == 0) {
            hour = 23;
            minute = minute + 15;
            System.out.println(hour + " " + minute);
        }
        if (minute < 45) {
            hour = hour - 1;
            minute = minute + 15;
            System.out.println(hour + " " + minute);
        }else
        if (minute > 45){
            minute = minute - 45;
            System.out.println(hour + " " + minute);
        }
    }
}
