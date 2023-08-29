import java.util.HashSet;

public class RemoveDuplicates{
    public static void main(String[] args) {
        int arr[] = {2,3,1,9,3,1,3,9};

        HashSet<Integer>set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = 0 ;
        for (Integer x : set) {
            arr[k++]  = x;
        }

        
        for (int i = 0; i < set.size(); i++) {
            System.out.println(arr[i]);
        }


    // two pinter soln

    //    int i = 0;
    //     for (int j = 1; j < arr.length; j++) {
            
    //         if(arr[i]!=arr[j]){
    //             i++;
    //             arr[i] = arr[j];

    //         }


    //     }
    //     for (int j = 0; j < i-1; j++) {
    //         System.out.println(arr[j]);
    //     }

        

       
    }
}