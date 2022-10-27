import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int firstClip = b - a;
        int secondClip = d - c;

        if (firstClip < secondClip || firstClip > secondClip){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
