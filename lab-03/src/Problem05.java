import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of points? ");

        int point = input.nextInt();

        if (90 <= point && point <= 100){
            System.out.println("Grade: A");
        }
        if (80 <= point && point < 90){
            System.out.println("Grade: B");
        }
        if (70 <= point && point < 80){
            System.out.println("Grade: C");
        }
        if (60 <= point && point < 70){
            System.out.println("Grade: D");
        }
        if (point < 60){
            System.out.println("Grade: F");
        }
    }
}