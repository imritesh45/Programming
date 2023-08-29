import java.util.Arrays;

public class NonRepeating {
    public static void main(String[] args) {
       int arr[] = {1,2,-1,1,3,1};
       //-1 1 1 1 2 3
       Arrays.sort(arr);
        int nums[] = new int[arr.length];
        int k = 0;
        if(arr[0] != arr[1]) System.out.print(arr[0]+" ");

        for (int i = 1; i < arr.length-1; i++) {
           
                if(arr[i]!=arr[i+1]&&(arr[i]!=arr[i-1])){
                    nums[k++] = arr[i];
                }
           
            
        }

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}
