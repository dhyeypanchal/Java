public class removeduplicate {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            count++;
        }
        // int nums[] = new int[count+1];
        for (int i = 0,j=0; i < nums.length-1 && j<count+1; i++) {
            if (nums[i]==nums[i+1]) {
                continue;
            }
            nums[j]=nums[i];
            j++;
        }
        if (nums[count]!=nums[nums.length-1]) {
            
            nums[count]=nums[nums.length-1];
        }
        for (int j = 0; j < count+1; j++) {
            System.out.println(nums[j]);
        }
        return count+1;
    }
    public static void main(String[] args) {
        int num[]= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(num));
    }
}
