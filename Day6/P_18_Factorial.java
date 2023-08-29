public class P_18_Factorial {

    static int fact(int n){
        if(n == 0 || n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        for (int i = 1; i <=5; i++) {
            ans = ans*i;
        }
        System.out.println(ans);

        System.out.println(fact(n));
    }
}
