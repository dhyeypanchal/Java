import java.util.Arrays;
import java.util.Stack;

public class mergesortedarray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < m; i++) {
            st.push(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            st.push(nums2[i]);
        }
        int ans[]=new int[m+n];
        for (int i = 0; i < m+n; i++) {
            ans[i]=st.pop();
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static void main(String[] args) {
        int nums1[]= { 0};
        int nums2[]= {1};
        merge(nums1, 0, nums2, 1);
    }
}
