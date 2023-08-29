import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortAnArrayByitsFrequency{
    public static void main(String[] args) {
        
        int n = 8;
        int[] arr = {1,2,3,2,4,3,1,2};


        HashMap<Integer,Integer>map = new HashMap<>();
        int dummy[] = new int[arr.length];
        

        Arrays.sort(arr);
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==null){
                map.put(arr[i],temp);
                temp++;
            }
        }
        System.out.println();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            dummy[i]=map.get(arr[i]);
           
        }

        Arrays.sort(dummy);
        for (int i = 0; i < dummy.length; i++) {
            System.out.println(dummy[i]);
        }

        HashMap<Integer,Integer>mp = new HashMap<>();

        for (int i = 0; i < dummy.length; i++) {
            if(map.containsKey(dummy[i])){
                mp.put(dummy[i],mp.get(dummy[i])+1);
            }
            else{
                mp.put(dummy[i], 1);
            }
        }
        
        
    }
}