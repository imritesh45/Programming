public class MaxMindigit {
    static void getDigit(int n){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(n!=0){
            int digit = n%10;
            min = Math.min(min,digit);
            max = Math.max(max, digit);

            n/=10;

        }

        System.out.println("Minimum digit " +min);
        System.out.println("Maximum digit "+max);
    }
    public static void main(String[] args) {
        int n = 23004;
        getDigit(n);

    }
}
