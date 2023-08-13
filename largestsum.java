public class largestsum {
    public static int maxSubArray(int[] nums) { //pending
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (sum<sum+nums[j]) { 
                    sum = sum+nums[j];
                    System.out.println(sum);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}
