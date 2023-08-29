import java.util.Scanner;

public class Prime{
    static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)==true)
        {
            System.out.println("Given number is prime number");
        }
        else{
            System.out.println("Given number is not prime number");
        }

    }
}