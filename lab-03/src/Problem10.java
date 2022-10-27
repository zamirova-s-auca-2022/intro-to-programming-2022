import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double xPoint = input.nextDouble();
        double yPoint = input.nextDouble();

        double x = Math.pow(xPoint - 0,2 );
        double y = Math.pow(yPoint - 0,2 );
        double distance = Math.pow(x + y,0.5 );

        if (distance <= 10){
            System.out.printf("Point (%.1f, %.1f) is in the circle", xPoint, yPoint);
        }else{
            System.out.printf("Point (%.1f, %.1f) is not in the circle", xPoint, yPoint);
        }
    }
}
