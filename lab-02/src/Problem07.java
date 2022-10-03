import java.util.*;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.print("The area is " );
        System.out.printf("%.4f%n" , area);
        System.out.print("The volume is " );
        System.out.printf("%.1f%n", volume);
    }
}
