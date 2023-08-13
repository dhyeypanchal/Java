public class kradsubarravg {
    public static int[] getAverages(int[] nums, int k) {
        int ans[]= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i<k) {
                ans[i]=-1;
                continue;
            }
            for (int j = 0; j < nums.length; j++) {
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums = {7,4,3,9,1,8,5,2,6};
        getAverages(nums, 3);
    }
}
