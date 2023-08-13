public class binarysearch {

    public static int search(int[]arr,int target){
        int left = 0;
        int right= arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if (arr[mid]==target) {
                return mid;
            }
            if (arr[left]<=arr[mid]) {
                if (arr[left]<=target && target<arr[mid] ) {
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if (arr[mid] < target && target<=arr[right]) {
                    left = mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static int[] findfirstlast(int[]arr,int target){
        int arr1[]={-1,-1};boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i]==target && count!=0) {
                count++;
            }
            if (arr[i]==target && count==0 && flag) {
                arr1[0]=i;
                flag=false;
                count++;
            }
            if (arr[i]==target && count==0) {
                count++;
            }
            if(count>=1){
                arr1[1] = i+count-1;
            }
        }
        System.out.println(arr1[0]+" "+arr1[1]);
        return arr1;
    }
    public static void main(String[] args) {
        int []arr = { 1,4};
        // System.out.println(search(arr,0));
        System.out.println(findfirstlast(arr,1));
    }
}
