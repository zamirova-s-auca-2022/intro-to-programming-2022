import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        double t = input.nextDouble();
        double destination = Math.sqrt(Math.pow(c-a, 2) + Math.pow(d-b, 2));
        double check = t - destination;

        if (check > 0 && check % 2 == 0) {
            System.out.println("y");
        }
        if (check < 0 && check * (-1) >0){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
}
