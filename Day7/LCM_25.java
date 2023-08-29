public class LCM_25 {
    static int gcd(int a ,int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int num1 = 6,num2 = 32;
        int gc = gcd(num1,num2);
        int lcm = (num1*num2)/gc;

        System.out.println(lcm);

        // if(num2%num1==0){
        //     System.out.println(num2);
        // }
        // else{

        //     for (int i = 2; i <num1 ; i++) {
        //         int ans = num2*i;
        //         if((ans)%num1==0){
        //             System.out.println(ans);
        //             break;
        //         }
        //     }
        // }
    }
}
