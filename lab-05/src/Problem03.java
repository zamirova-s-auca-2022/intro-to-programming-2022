import java.util.*;

public class Problem03 {
    public static void main(String[] args) {

        Random rnd = new Random();
        double r = Math.random();

        Scanner input= new Scanner(System.in);
        int nTest = input.nextInt();

        int nCorrectAnswer = 0;
        for (int i = 0; i < nTest; ++i) {
            int op1 = -50 + rnd.nextInt(101);
            int op2 = -50 + rnd.nextInt(101);
            System.out.printf("%d + %d = ", op1, op2);
            int answer = input.nextInt();
            if (answer == op1 + op2) {
                ++nCorrectAnswer;
            }
        }
        System.out.println("Number of correct: " + nCorrectAnswer);
        System.out.println("Number of incorrect: " + (nTest - nCorrectAnswer));

    }
}