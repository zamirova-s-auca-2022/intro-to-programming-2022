import java.util.Scanner;

public class Problem02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            String echo = input.next();
            if (i % 2 != 0){
                System.out.println(echo);
            }
        }
    }
}

