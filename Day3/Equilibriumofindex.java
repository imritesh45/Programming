public class Equilibriumofindex{
    public static void main(String[] args) {
     
        int nums[] = { 2, 3, -1, 8, 4};

        int leftsum;
        int rightsum;

        for (int i = 0; i < nums.length; i++) {
            leftsum = 0; 
            for (int j = 0; j < i; j++) {
                leftsum+=nums[j];
            }
            rightsum = 0;
            for (int j = i+1; j < nums.length; j++) {
                rightsum+=nums[j];
            }

            if(leftsum==rightsum){
                System.out.println(i);
            }
        }
        
    }
}