public class Fib{
    public static void main(String[] args) {
        int fib[] = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        
        
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1]+fib[i-2];
           
        }

        for (int i = 0; i < fib.length; i++) {
            System.out.println(fib[i]+" ");
        }
        System.out.println("In reverse order");

        for (int i = fib.length-1; i >=0; i--) {
            System.out.println(fib[i]);
        }
    }
}