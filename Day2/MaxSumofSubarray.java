public class MaxSumofSubarray {
    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int prod = 1;

                for (int k = i; k <=j; k++) {
                    prod*=nums[k];
                    result = Math.max(result, prod);
                }
            }
        }
        System.out.println(result);
    }
}
