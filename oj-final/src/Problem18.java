import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 0;

        while (i < (int) (Math.sqrt(num))) {
            i++;
        }
        System.out.println("The largest square has side length " + i + ".");
    }
}
