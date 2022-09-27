public class Problem09 {
    public static void main(String[] args) {
        double sum = 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11;
        System.out.println(4*sum);
        double sum2 = sum + 1.0/13;
        System.out.println(4*sum2);
    }
}
