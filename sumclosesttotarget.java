import java.util.Arrays;

public class sumclosesttotarget {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = nums[0] + nums[1] + nums[2]; // initialize closest sum
        for (int i = 0; i < nums.length-2; i++) {
            int left =i+1,right=nums.length-1;
            while (left<right) {
                int count = nums[i] + nums[i + 1] + nums[i + 2];
                count = nums[i] + nums[left] + nums[right];
                if (count == target) { // sum equals target, return immediately
                    return count;
                }
                else if(count<target){
                    left++;
                }
                else {
                    right--;
                }
                if (Math.abs(count - target) <= Math.abs(closest_sum-target)) { // we have to not check only consicutive no.'s but all permutative 3 no.'s. 
                closest_sum = count;
            }
        }
        }
        return closest_sum;
    }
    public static void main(String[] args) {
        int nums[] ={ 0, 0, 0};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
