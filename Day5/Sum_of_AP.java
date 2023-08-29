class Sum_of_AP{
    static double sumofAp(Double a ,Double d,int n){
        double sum = 0;
        for (int i = 0; i < n; i++) {
            // sum+=a;
            // a+=d;

            sum = (2.0/n)*(a+(n-1)*d);
        }
        return sum;
    }

    public static void main(String[] args) {
    double a = 1.5, d = 3;
    int n = 5;
    System.out.println("Sum of Given Ap Series: "+sumofAp(a, d, n));
    }


    
}