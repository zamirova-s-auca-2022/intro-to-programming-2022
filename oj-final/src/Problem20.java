import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = 0;
        int i = 0;

        while (i < 6) {
            i++;
            String letters = scanner.nextLine();
            if (letters.equals("W")) {
                w++;
            }
        }

        if (w == 5 || w == 6) {
            System.out.println("1");
        } else if (w == 3 || w == 4) {
            System.out.println("2");
        } else if (w == 1 || w == 2) {
            System.out.println("3");
        } else {
            System.out.println("-1");
        }
    }
}
