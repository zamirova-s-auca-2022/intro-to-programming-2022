import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hey = input.next();
        int heyE = hey.length()-2;

        System.out.print("h");
        for(int i = 0; i < heyE *2; i++) {
            System.out.print("e");
        }
        System.out.println("y");
    }
}
