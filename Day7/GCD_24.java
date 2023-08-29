public class GCD_24 {

    // recursive approach
    static int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int ans = 1;
        System.out.println(gcd(a,b));
        for (int i = 1; i <= Math.min(a, b); i++) {
            if(a%i==0 && b%i==0){
                ans = i;
            }

        }
       System.out.println(ans);
    }
}
