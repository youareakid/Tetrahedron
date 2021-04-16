public class TetrahedronSolution {

    public static void main(String[] args) {

        double pA = 1.0;
        double pB = 0.0;

        for(int i = 0; i < 10; i++){
            pA = cal(pA);
            pB = cal(pA);
        }

        System.out.println("pA: " + pA);
        System.out.println("pB: " + pB);
        System.out.println("pC: " + pB);
        System.out.println("pD: " + pB);
    }

    public static double cal(double pA) {
        double p = (1 - pA)/3;
        return p;
    }

}
