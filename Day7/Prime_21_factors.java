class Prime_21_factors{

    static void primeFactors(int n){
        for (int i = 2;  n>1; i++) {
            if(n%i==0){

                while (n%i==0) {

                    
                    System.out.println(i);

                    n = n / i;
                }


            }
        }
    }
    public static void main(String[] args) {
        int N = 12;

        primeFactors(N);

        
    }
}