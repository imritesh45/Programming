import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import javax.security.auth.AuthPermission;

public class ReplaceByRank{
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {20,15,26,2,98,6};

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer>set = new HashSet<>();

            for (int j = 0; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    set.add(arr[j]);
                }
            }
            System.out.println(set.size()+1+" ");
        }


        HashMap<Integer,Integer>map = new HashMap<>();
        int dummy[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dummy[i] = arr[i];
        }

        Arrays.sort(dummy);
        int temp = 1;
        for (int i = 0; i < dummy.length; i++) {
            if(map.get(dummy[i])==null){
                map.put(dummy[i],temp);
                temp++;
            }
        }
        System.out.println();
        
        for (int i = 0; i < dummy.length; i++) {
            System.out.println(map.get(arr[i])+" ");
        }
    }
}