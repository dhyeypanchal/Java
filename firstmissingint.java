import java.util.HashSet;

public class firstmissingint {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            map.add(nums[j]);
        }
        for (int i = 1; i <= map.size(); i++) {
            if(!map.contains(i)){
                return i;
            }
        }
        return map.size()+1;
    }
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(firstMissingPositive(nums));
    } 
}
