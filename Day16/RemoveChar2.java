import java.util.HashMap;

public class RemoveChar2 {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";

        HashMap<Character,Integer>map = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str2.length(); i++) {
            map.put(str2.charAt(i), 1);
        }

        for (int i = 0; i < str1.length(); i++) {
            if(map.get(str1.charAt(i))==null){
                sb.append(str1.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
