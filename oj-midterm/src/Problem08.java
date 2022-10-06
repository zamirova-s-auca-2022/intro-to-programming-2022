import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eye = input.nextInt();
        int nose = input.nextInt();
        int mouth = input.nextInt();

        int uniqueDesigns = eye * nose * mouth;
        System.out.println(uniqueDesigns);
    }
}
