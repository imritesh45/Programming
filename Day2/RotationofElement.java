public class RotationofElement {
    public static void main(String[] args) {
    int n = 7;
    int[] arr = {1,2,3,4,5,6,7};
    int k = 2;

    int temp[] = new int[n];
    int j = 0;
    for (int i = n-k; i < arr.length; i++) {
        temp[j++] = arr[i]; 
    }

    for (int i = 0; i < n-k; i++) {
        temp[j++] = arr[i];
    }
    for (int i : temp) {
        System.out.println(i);
    }

    
    }
}
