import java.util.Scanner;


public class PerfectNum {
    static boolean isPerfect(int n){
        int sum  = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum+=i;
            }

           
            
        }
        return (sum == n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPerfect(num)){
            System.out.println("It is perfect Number");
        }
        else{
            System.out.println("It is not perfect number");
        }
    }
}
