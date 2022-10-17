import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInteger = input.nextInt();
        int secondInteger = input.nextInt();
        String largerNumber;

        if (firstInteger > secondInteger){
            largerNumber = "1";
        }else{
            largerNumber = "0";
        }
        System.out.println(largerNumber);
    }
}
