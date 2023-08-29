public class ReversearrayUsingRecursion {

    static int reverse(int arr[],int start,int end){

        if (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverse(arr, start+1, end-1);
        }
        return 0;}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;
        reverse(arr, 0, n-1);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    
}
