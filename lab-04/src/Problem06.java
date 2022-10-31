import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int speed = input.nextInt();

        if (limit >= speed){
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (speed - limit <= 20){
            System.out.println("You are speeding and your fine is $100");
        } else if (speed - limit <= 30 && speed - limit >= 21){
            System.out.println("You are speeding and your fine is $270");
        } else if (speed - limit >= 31){
            System.out.println("You are speeding and your fine is $500");
        }
    }
}
