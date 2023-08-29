import java.util.HashMap;


public class MaximumRepeatingChar{
    public static void main(String[] args) {
        String str = "takeuforward";

        


        HashMap<Character,Integer>map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
                
            }
            else{
                map.put(ch,map.get(ch)+1);
            }

            
        }
        

           
            Character firstKey = map.keySet().stream().findFirst().get();

            
            
        System.out.println(firstKey);
        

        

    }
}