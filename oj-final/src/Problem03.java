import java.util.Scanner;

public class Problem03 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int bat = input.nextInt();
        double diviser = bat;
        double sum = 0;

        for (int i = 1; i <= bat; i++){
            int score = input.nextInt();

            if (score == -1){
                diviser -= 1;
            }else{
                sum += score;
            }
        }
        System.out.println(sum / diviser);
    }
}

