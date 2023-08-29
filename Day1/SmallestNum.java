import java.util.Scanner;

public class SmallestNum{
    public static void main(String[] args) {
       int arr[] = new int[5];

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the elements in array");
       for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
       }
       int min = arr[0];     
       int max = arr[0];
       for (int i = 0; i < arr.length; i++) {
            
            if(min>arr[i]){
                min = arr[i];
            }
            else if(max<arr[i]){
                max = arr[i];
            }
       }
       System.out.println("Maximum element "+max);
       System.out.println("Minimum element "+min);

       int secondsmallest = arr[0];
            
       int secondLargest = arr[0];
       for (int i = 0; i < arr.length; i++) {
            if(secondsmallest>arr[i]&&arr[i]!=min){
                secondsmallest = arr[i];
            }
            else if(secondLargest<arr[i]&&arr[i]!=max){
                secondLargest = arr[i];
            }
       }
       System.out.println("Second smallest: "+secondsmallest);
       System.out.println("Second largest: "+secondLargest);
       
    sc.close();
    }
}