public class Problem10 {
    public static void main(String[] args) {
        double currentPopulation = 312032486;
        double yearBrith = 365 * 24 * 60 * 60.0 / 7;
        double yearDeath = 365 * 24 * 60 * 60.0 / 13;
        double yearImmigrant = 365 * 24 * 60 * 60.0 / 45;

        double firstYearPopulation = currentPopulation + yearBrith - yearDeath + yearImmigrant;
        double secondYearPopulation = firstYearPopulation + yearBrith - yearDeath + yearImmigrant;
        double thirdYearPopulation = secondYearPopulation + yearBrith - yearDeath + yearImmigrant;
        double fourthYearPopulation = thirdYearPopulation + yearBrith - yearDeath + yearImmigrant;
        double fifthYearPopulation = fourthYearPopulation + yearBrith - yearDeath + yearImmigrant;

        System.out.printf("%.0f%n", firstYearPopulation);
        System.out.printf("%.0f%n", secondYearPopulation);
        System.out.printf("%.0f%n", thirdYearPopulation);
        System.out.printf("%.0f%n", fourthYearPopulation);
        System.out.printf("%.0f%n", fifthYearPopulation);
    }
}
