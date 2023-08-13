public class removeelement {
    public static int removeElement(int[] nums, int val) {
        int count=0;int []newarr = new int[nums.length];
        for (int i = 0,x=0; i < nums.length; i++) {
            if (nums[i]!=val) {
                count++;
                newarr[x]=nums[i];
                x++;
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            nums[i]=newarr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int []nums = { 3,2,2,3};
        System.out.println(removeElement(nums, 2));
    }
}
