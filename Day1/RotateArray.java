public class RotateArray{


    public static void rev(int array[],int start,int end){
        int i = start;
        int j = end;
         while (i<j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
        
    }
    public static void main(String[] args) {
        int  array[] = {1,2,3,4,5};
        int N = 5;
        int  k = 2;

    //     // output : 3 4 5 1 2

    //    int i=0,j=k-1;
    //     while (i<j) {
    //         int temp = array[i];
    //         array[i] = array[j];
    //         array[j] = temp;

    //         i++;
    //         j--;
    //     }
    //     // 2 1 3 4 5
        
    //      int l=k,m=N-1;
    //     while (l<=m) {  
    //         int temp = array[l];
    //         array[l] = array[m];
    //         array[m] = temp;

    //         l++;
    //         m--;
    //     }
    //     // 2 1 5 4 3
        
    //     int p=0,q=N-1;
    //     while (p<q) {
    //         int temp = array[p];
    //         array[p] = array[q];
    //         array[q] = temp;

    //         p++;
    //         q--;
    //     }

        // 3 4 5 1 2

        rev(array,0,k-1);
        rev(array,k,N-1);
        rev(array, 0,N-1);
        System.out.println("Rotated array: ");
        for (int i : array) {
            System.out.println(i);
        } 
    
    }
}
