public class maxmoves2684 {
    public static int maxMoves(int[][] grid) {
        int x=0;int y=0;int count=0;
        for (int i = 0; i < grid.length; i++) {
            // for (int j = 0; j < grid[i].length; j++) {
            //     System.out.print(grid[i][j]+" ");
            // }
            // System.out.println();
            if (x!=0 && y<grid[i].length) {   
                if (grid[x][y]<grid[x-1][y+1]) {
                    count++;
                    x--;
                    y++;
                }
            }
            else if(y<grid[i].length){
                if (grid[x][y] < grid[x][y + 1]) {
                    count++;
                    y++;
                    System.out.println(grid[i].length);
                }
            }
            else if (x < grid.length) {  
                if (grid[x][y] < grid[x+1][y + 1]) {
                    count++;
                    x++;
                    y++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        int [][]grid= {{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}};
        maxMoves(grid);
    }
}
