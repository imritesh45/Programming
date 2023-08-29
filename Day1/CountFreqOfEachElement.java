import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreqOfEachElement {
    public static void main(String[] args) {

        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        sc.close();

        
    }
}
