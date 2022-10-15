import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallTreats = input.nextInt();
        int mediumTreats = input.nextInt();
        int largeTreats = input.nextInt();
        String happiness;

        if (smallTreats + 2 * mediumTreats + 3 * largeTreats >= 10) {
            happiness = "happy";
            } else{
                happiness = "sad";
            }

        System.out.println(happiness);
    }
}