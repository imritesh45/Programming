class P_17_Fibonacci{

    // static void fibonacci(int n){
    //     int arr[] = new int[n+1];
        
    //     arr[0] = 0;
    //     arr[1] = 1;

    //     for (int i = 2; i <= n; i++) {
    //         arr[i] = arr[i-1]+arr[i-2];

    //     }
    //     for (int i = 0; i <=n; i++) {
    //         System.out.println(arr[i]);
    //     }

    // }
    // static void fibonacci(int n){
    //     int last = 1;
    //     int secondlast = 0;
    //      System.out.println(secondlast);
    //     System.out.println(last);
       
        
    //     int curr;
    //     for (int i = 2; i <= n; i++) {
    //         curr = last+secondlast;
    //         System.out.println(curr);
    //         secondlast = last;
    //         last = curr;
            

    //     }
       
    // }

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        int last = fibonacci(n-1);
        int secondlast = fibonacci(n-2);
        return last+secondlast;
    }
    
    public static void main(String[] args) {
        int n = 6 ; 

        System.out.println(fibonacci(n));
    }
}