import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1st number: ");
        int a = input.nextInt();
        System.out.print("2nd number: ");
        int b = input.nextInt();
        System.out.print("3rd number: ");
        int c = input.nextInt();

        int maxNumber = a;
        if (maxNumber < b){
            maxNumber = b;
        }
        if (maxNumber < c){
            maxNumber = c;
        }
        System.out.printf("The value %d is the greatest one%n", maxNumber);
    }
}
