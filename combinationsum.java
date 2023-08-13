import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinationsum {
    public static int sum =0;
    public static List<List<Integer>> list= new ArrayList<>();
    public static List<Integer> list2= new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        System.out.println(sum);
        Arrays.sort(candidates);
        // if (sum==target) {
        //     list.add(list2);
        //     return list;
        // }
        // for (int i = 0; i < candidates.length; i++) {
        //     if (sum<=target) {
        //         sum+=candidates[i];
        //         list2.add(candidates[i]);
        //         combinationSum(candidates, target);
        //     }
        //     else{
        //         sum-=i;
        //         // sum-=candidates[i]; // it goes on infinite loop.
        //         i++;
        //     }
        // }
        for (int i = 0; i < candidates.length; i++) {
            if (sum<=target) {
                sum+=candidates[i];
                list2.add(candidates[i]);
                combinationSum(candidates, target);
            }
            else{
                sum-=i;
                // sum-=candidates[i]; // it goes on infinite loop.
                i++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int [] candidates = { 2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }   
}
