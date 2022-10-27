import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stoneLeft = input.nextInt();

        if (stoneLeft % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
