import java.util.Scanner;


public class CountingFreq {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      
        for (int i = 0; i < arr.length; i++) {
              boolean visited[] = new boolean[arr.length];
            if(visited[i] = true){
                continue;
            }

            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }


            System.out.println(arr[i]+" "+count);
        }

        sc.close();
    }
}
