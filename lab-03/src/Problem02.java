import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of points? ");
        int point = input.nextInt();

        if (point < 40){
            System.out.println("You failed “Intro to Programming”!!!");
            System.out.println("You can take it again in the fall semester next year.");
        }else{
            System.out.println("You passed “Intro to Programming”!!!");
            System.out.println("You should take “Object-Oriented Programming” in the next semester");
        }
    }
}

