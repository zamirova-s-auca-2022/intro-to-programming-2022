import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Numbers = input.nextInt();

        String correctNumber;
        if (Numbers >= 555000){
            correctNumber = "1";
        } else {
            correctNumber = "0";
        }
        if (Numbers <= 5559999){
            correctNumber = "1";
        } else {
            correctNumber = "0";
        }
        System.out.println(correctNumber);
    }
}
