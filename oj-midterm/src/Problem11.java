import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int articlesPublish = input.nextInt();
        int require = input.nextInt();

        int minimalScientists = articlesPublish * require - (articlesPublish - 1);
        System.out.println(minimalScientists);
    }
}
