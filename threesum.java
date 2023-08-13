import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length==0) {
            return new ArrayList<>();
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                sum = nums[i]+nums[j]+nums[k];
                if (sum==0) {
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                if (sum<0) {
                    j++;
                }
                if(sum>0){
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
