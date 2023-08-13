import java.util.Arrays;

class strictlyincreasing{
    public static int makeArrayIncreasing(int[] arr1, int[] arr2) {
        if (arr1.length==1 || arr1.length==0) {
            return 0;
        }
        if (arr2.length==0) {
            return -1;
        }
        Arrays.sort(arr2);
        int count=0;
        for (int i = 0; i < arr1.length-1; i++) {
            if (i!=0) {
                if (arr1[i]>=arr1[i+1]) {
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr2[j]>arr1[i-1]) {
                            arr1[i] = arr2[j];
                            count++;
                            break;
                        }
                        if (j==arr2.length-1) {
                            count=-1;
                        }
                    }
                }
            }
            else{
                if (arr1[i]>=arr1[i+1]) {
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr2[j]<arr1[i+1]) {
                            arr1[i] = arr2[j];
                            count++;
                            break;
                        }
                        if (j==arr2.length-1) {
                            count=-1;
                        }
                    }
                }
            }
        }
        if (arr1[arr1.length-1]<=arr1[arr1.length-2]) {
            for (int i = 0; i < arr2.length; i++) {
                // System.out.println(arr2[i]);
                // System.out.println(arr1[arr1.length-2]);
                if (arr2[i]>arr1[arr1.length-2]) {
                    arr1[arr1.length-1]=arr2[i];
                    count++;
                    break;
                }
            }
        }
        // for (int i = 0; i < arr1.length-1; i++) {
        //     if (i!=0) {
        //         if (arr1[i]<arr1[i-1]) {
        //             for (int j = 0; j < arr2.length; j++) {
        //                 if (arr2[j]>arr1[i-1]) {
        //                     arr1[i]=arr2[j];
        //                     count++;
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        //     else{
        //         if (arr1[i]>=arr1[i+1]) {
        //             for (int j = 0; j < arr2.length; j++) {
        //                 if (arr2[j]<arr1[i+1]) {
        //                     arr1[i]=arr2[j];
        //                     count++;
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        // }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        return count;
    }
    public static void main(String[] args){
        // int arr1[]={5,6,4};
        // int arr2[]={7};
        int arr1[]={0,11,6,1,4,3};
        int arr2[]={5,4,11,10,1,0};
        System.out.println(makeArrayIncreasing(arr1, arr2));
    }
}