import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "blockchain technology";

        HashMap<Character,Integer> map = new HashMap<>( );

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);

            }

        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            Integer val = entry.getValue();
            if(val==1){
            System.out.println(entry.getKey());
            }
        }
    }
}
