public class climbingStairs {

    public static int climbStairs(int n) {
        int count =0;int ans=0;
        while(count<=n){
            if (count==n) {
                ans++;
            }
            for (int i = 0; i <=n-i; i++) {
                
            }
            }
        return n;
    }

    // public static void rotatematrix(int[][] mat){
    //     int [][] newmat = new int[3][3];
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat.length; j++) {
    //             newmat[i][j] = mat[mat.length-j-1][i];
    //         }
    //     }
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat.length; j++) {
    //             mat[i][j] = newmat[i][j];
    //         }
    //     }
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat.length; j++) {
    //             System.out.print(mat[i][j]+ " ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        // System.out.println(climbStairs(5));
        
        // int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat.length; j++) {
        //         System.out.print(mat[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        // rotatematrix(mat);
    }
}
