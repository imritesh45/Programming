import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        String str = "ABCDCBA";
      
        StringBuffer sb = new StringBuffer(str);

        sb.reverse(); 
        String data = sb.toString();
        if(str.equals(data)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}