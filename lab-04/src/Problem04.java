import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("complexity level? ");
        int level = input.nextInt();

        switch (level){
            case 5:
            case 4:
                System.out.println("You are a pro gamer.");
                break;
            case 3:
            case 2:
                System.out.println("You are a experienced gamer.");
                break;
            case 1:
                System.out.println("You are a beginner.");
                break;
            case 0:
                System.out.println("You are a total newbie.");
                break;
        }
    }
}
