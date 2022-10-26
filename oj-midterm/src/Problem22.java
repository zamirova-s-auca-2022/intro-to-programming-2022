import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberStones = input.nextInt();

        if (numberStones % 2 == 0) {
            System.out.println("Bod");
        } else {
            System.out.println("Alice");
        }
    }
}
