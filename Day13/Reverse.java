import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String str = "HELLO";

        char [] rvstring = new char[str.length()];

        Stack<Character> sk = new Stack<>();

        for (int i = 0; i < rvstring.length; i++) {
            sk.push(str.charAt(i));
        }
        int i= 0; 
        while(!sk.empty()){
            rvstring[i++] = sk.pop();
        }

       str = new String(rvstring);
        

        System.out.println(str);

        


    }
}
