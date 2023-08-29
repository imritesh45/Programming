class Automorphic_23{
    static boolean isAutomorphic(int n) {
        int sqr = n*n;


        while (n>0) {
            if(n%10!=sqr%10){
                return false;
            }
            n/=10;
            sqr/=10;
        }
        return true;

    }

    public static void main(String[] args) {
        int n =76;

        if (isAutomorphic(n)) {
            System.out.println("It is automorphic number");
        } else {
            System.out.println("It is not automorphic number");
        }

    }
}