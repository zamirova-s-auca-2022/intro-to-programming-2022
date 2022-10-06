import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int regular = input.nextInt();
        int small = input.nextInt();
        int students = 28;

        int regularC = 8 * regular;
        int smallC = 3 * small;
        int total = regularC + smallC;

        int rem = total - students;
        System.out.println(rem);
    }
}
