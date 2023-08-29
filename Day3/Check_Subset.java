import java.util.Arrays;

public class Check_Subset {

    static boolean isSearch(int num , int arr2[],int n){
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(mid == num){
                return true;
            }
            else if(arr2[mid]>num){
                high = mid - 1;

            }
            else{
                low = mid+1;
            }

        }
        return false;
    }
    static boolean isSubset(int arr1[],int m,int arr2[],int n){
        if(m>n) return false;
        Arrays.sort(arr2);
        for (int i = 0; i < m; i++) {
            boolean present  = isSearch(arr1[i],arr2,n);
            if (present == false) {
                return false;
            }
        }
        return true;
        
      
    }
    public static void main(String[] args) {
                 
        int arr1[]={1,3,4,5,2};
	    int arr2[]={2,4,3,1,7,5,15};

        int m = arr1.length;
        int n = arr2.length;

        isSubset(arr1,m,arr2,n);

        if(isSubset(arr1, m, arr2, n) == true){
            System.out.println("arr1 is subset of arr2");
        }
        else{
            System.out.println("arr1 is not subset of arr2");
        }
    }
}
