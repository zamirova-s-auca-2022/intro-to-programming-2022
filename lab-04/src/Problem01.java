public class Problem01 {
    public static void main(String[] args) {
        double x = 0.1;
        double s = 0;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;

        if (Math.abs(s -1) <= 1E-10){
            System.out.println("Ok");
        }else{
            System.out.println("What?");
            System.out.println(s);
        }
    }
}
