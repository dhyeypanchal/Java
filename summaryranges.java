import java.util.ArrayList;
import java.util.List;

public class summaryranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();int start = 0;int end=0;boolean flag=false;
        for (int i = 0; i < nums.length-1; i++) {
            start = nums[i];
            while (i<nums.length-1) {
                if (nums[i+1]==nums[i]+1 || nums[i+1]==nums[i]) {   
                    end=nums[i+1];
                    i++;
                    flag=true;
                }
                else{
                    break;
                }
            }
            if (flag && start!=end) {
                list.add(Integer.toString(start)+"->"+Integer.toString(end));
                flag=false;
            }
            else{
                list.add(Integer.toString(start));
            }
        }
        if (nums.length>=2) {    
            if (nums[nums.length-1]!=nums[nums.length-2]+1 && nums[nums.length-1]!=nums[nums.length-2]) {
                list.add(Integer.toString(nums[nums.length-1]));
            }
        }
        if (nums.length==1) {
            list.add(Integer.toString(nums[0]));
        }
        return list;
    }
    public static void main(String[] args) {
        int []nums = {2,4};
        System.out.println(summaryRanges(nums));
    }
}
