 import java.sql.SQLOutput;
 import java.util.*;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pound: ");
        double pound = input.nextDouble();

        double kilogram = pound * 0.454;
        System.out.println(pound + " pounds is " + kilogram + " kilograms");
    }
}
