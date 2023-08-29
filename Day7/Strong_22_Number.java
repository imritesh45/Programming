public class Strong_22_Number {

    static int fact(int n ){
        if(n == 0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int N = 145;
        int originalNo = N;
        int sum = 0;
        while(N!=0){
            int digit = N%10;
            sum+=fact(digit);
            N = N/10;

        }
        if (originalNo==sum) {
            System.out.println("It is strong Number");
        } else {
            System.out.println("It is not a strong Number");
        }
    }
}
