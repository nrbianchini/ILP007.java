package loopStructure;

public class GrowthComparison {
    public static void main(String[] args) {
        double chico = 1.50;
        double juca = 1.10;
        int years = 0;

        while (juca <= chico){
            chico += 0.02;
            juca += 0.03;
            years++;
        }
        System.out.print("Serão necessários " + years + " anos");
    }
}
