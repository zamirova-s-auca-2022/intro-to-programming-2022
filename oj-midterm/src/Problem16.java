import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        String isMultiple;
        if (firstNumber % secondNumber == 0){
            isMultiple = "yes";
        } else{
            isMultiple = "no";
        }
        System.out.print(isMultiple);
    }
}
