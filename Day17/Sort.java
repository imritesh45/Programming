import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String str = "zxcbg";

        char ch [] = str.toCharArray();

        Arrays.sort(ch);

        String s = new String(ch);
        System.out.println(s);
     }
}
