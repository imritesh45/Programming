public class Palindrome2 {

    static boolean ispalindrome(int i,String s){
        if(i>=s.length()/2){
            return true;
        }

        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }

        return ispalindrome(i+1, s);

    }
    public static void main(String[] args) {
        String str = "madam";

        if(ispalindrome(0,str)==true){
            System.out.println("It is palindrome");
        }

        else{
            System.out.println("It is not a palindrome");
        }

    }
}
