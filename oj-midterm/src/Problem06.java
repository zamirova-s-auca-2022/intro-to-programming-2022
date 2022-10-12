import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int length = input.nextInt();
        int sideLength = input.nextInt();

        int area = (width / sideLength) * (length / sideLength);

        System.out.println(area);
    }
}
