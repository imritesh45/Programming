public class Sum_of_gp {

    static double SumofGP(double a,double r,int n){
        double sum = 0;

        for (int i = 0; i < n; i++) {
            // sum += a;
            // a*=r;

            sum = a*(Math.pow(r, n) -1)/(r-1);
        }
        return sum;
    }
    public static void main(String[] args) {
    double a = 2.0; // First term of G.P.
    double r = 1.5; // common ratio of G.P.
    int n = 4; // Number of terms of G.P.
    System.out.println("Sum of GP Series is "+SumofGP(a, r, n));
    }
}
