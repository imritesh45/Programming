import java.util.HashMap;
import java.util.Map;

public class FrequencyOfchar {
    public static void main(String[] args) {
        String str = "takeuforward";

        HashMap<Character,Integer> mp = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }
            else if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
                
            
        }
        
        for (Map.Entry entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        System.out.println(str);
    }
}
