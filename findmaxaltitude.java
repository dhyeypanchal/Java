public class findmaxaltitude {
    public static int largestAltitude(int[] gain) {
        int []ans = new int[gain.length+1];
        ans[0]= 0;
        int sum=0;int max=0;
        for (int i = 0; i < gain.length; i++) {
            ans[i+1]= gain[i]+sum;
            sum=ans[i+1];
            if (ans[i+1]>max) {
                max=ans[i+1];
            }
        }
        return max;
        // int ans=0;
        // int i=0;int max=0;
        // while (i < gain.length) {
        //     ans= gain[i]+ans;
        //     if (ans>max) {
        //         max=ans;
        //     }
        //     i++;
        // }
        // return max;
    } 
    public static void main(String[] args) {
        // int [] gain = {-5,1,5,0,-7};
        int [] gain = {-4,-3,-2,-1,4,3,2};
        // int [] gain = {};
        System.out.println(largestAltitude(gain));
    }
}
