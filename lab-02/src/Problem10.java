import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of year: ");
        double year = input.nextDouble();

        double currentPopulation = 312032486;
        double yearBrith = 365 * 24 * 60 * 60.0 / 7;
        double yearDeath = 365 * 24 * 60 * 60.0 / 13;
        double yearImmigrant = 365 * 24 * 60 * 60.0 / 45;

        double yearIncreasing = yearBrith - yearDeath + yearImmigrant;
        double Increasing = yearIncreasing * year;
        double population = currentPopulation + Increasing;

        System.out.print("The population in " + year + " is ");
        System.out.printf("%.0f%n" , population);
    }
}
