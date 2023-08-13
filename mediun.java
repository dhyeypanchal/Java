import java.util.Arrays;

public class mediun {

    public static double findMediun(int nums1[], int[] nums2){
        int []arr3= new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr3[i]=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr3[nums1.length + i]=nums2[i];
        }
        Arrays.sort(arr3);double sum = 0;
        if (arr3.length%2==0) {
            sum = ((double)arr3[arr3.length/2-1] + (double)arr3[(arr3.length/2)])/2;
        }
        else{
            sum=arr3[(arr3.length+1)/2-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums1[]= {1,3};
        int nums2[]= {2,4};
        System.out.println(findMediun(nums1, nums2));
    }
}
