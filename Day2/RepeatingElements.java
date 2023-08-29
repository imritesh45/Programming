import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatingElements {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,2};
        // int nums[] = new int[arr.length];
        // int k = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j =i+1 ; j < arr.length; j++) {
        //         if(arr[i]==arr[j]){
        //             nums[k++] = arr[i];
        //         }
        //     }
        // }

        // for (int i = 0; i < k; i++) {
        //     System.out.println(nums[i]);
        // }


        //sorting technique

        // Arrays.sort(arr);
        // int k = 0;
        // for (int i = 0; i < arr.length-1; i++) {
        //     if(arr[i]==arr[i+1]){
        //         System.out.println(arr[i]+" ");
        //     }
        // }
      
        // hashmap technique

        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }
            else{
                map.put(arr[i], 1);
            }


        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
