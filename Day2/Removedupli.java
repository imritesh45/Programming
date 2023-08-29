import java.util.HashMap;

public class Removedupli {
    public static void main(String[] args) {
        int arr[]={2,3,1,9,3,1,3,9};
        
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                System.out.println(arr[i]);
                map.put(arr[i],1);
            }
            
        }
    }
}
