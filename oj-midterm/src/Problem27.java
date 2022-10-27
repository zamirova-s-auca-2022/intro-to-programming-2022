import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int cheesiness = input.nextInt();
        String M;

        if (width == 3 && cheesiness >= 95) {
            M = "absolutely";
            System.out.println("C.C. is " + M + " satisfied with her pizza.");
        }
        if (width == 1 && cheesiness <= 50) {
            M = "fairly";
            System.out.println("C.C. is " + M + " satisfied with her pizza.");
        }
        if (width == 2 && cheesiness < 100) {
            M = "very";
            System.out.println("C.C. is " + M + " satisfied with her pizza.");
        }
        if (width == 1 && 50 < cheesiness && cheesiness < 100) {
            M = "very";
            System.out.println("C.C. is " + M + " satisfied with her pizza.");
        }
        if (width == 3 && cheesiness < 95) {
            M = "very";
            System.out.println("C.C. is " + M + " satisfied with her pizza.");
        }
    }
}
