import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antennae = input.nextInt();
        int eyes = input.nextInt();
        if (antennae >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (antennae <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (antennae <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
