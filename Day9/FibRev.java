
public class FibRev {
    static int fib(int N){
        if(N<=1){
            return N;
        }

        int last = fib(N-1);
        int slast = fib(N-2);
        
        return slast + last;
    }
    public static void main(String[] args) {
        int n  = 10;

        System.out.println(fib(n));
    }
     
}