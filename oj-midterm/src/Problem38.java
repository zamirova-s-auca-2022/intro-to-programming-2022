import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        if (BMI > 25) {
            System.out.println("Overweight");
        } else if (BMI > 18.5 && BMI < 25.0) {
            System.out.println("Normal weight");
        } else if (BMI < 18.5) {
            System.out.println("Underweight");
        }
    }
}
