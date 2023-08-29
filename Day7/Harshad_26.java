public class Harshad_26 {
    static boolean isHarshad(int n){
        int original = n;
        int sum = 0;
        while (n!=0) {
            int digit = n%10;
            sum+=digit;

            n/=10;

        }
        if(original%sum!=0) return false;

        return true;
        
    }
    public static void main(String[] args) {
        int num = 378;

        if (isHarshad(num) == true) {
            System.out.println("it is harshad number");
        } else {
            System.out.println("It is not harshad number");
        }
    }
}
