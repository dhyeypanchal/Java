public class equalrowcolumnpairs {
    public static int equalPairs(int[][] grid) {
        int count=0;int ans=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                for (int j2 = 0; j2 < grid.length; j2++) {   
                    if (grid[i][j2]==grid[j2][j]) {
                        count++;
                    }
                }
                if (count==grid.length) {
                    ans+=1;
                }
                count=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }
}
