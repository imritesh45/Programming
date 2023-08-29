import java.util.Scanner;

public class ReverseAnArray{
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0,j=arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println("Reverse Element "+arr[j2]);
        }
        sc.close();
    }
}
