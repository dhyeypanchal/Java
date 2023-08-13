public class checkstraightline {
    public static boolean checkStraightLine(int[][] coordinates) {
        boolean posx=false;
        boolean posy=false;
        if (coordinates.length<=1) {
            return false;
        }
        if (coordinates[1][0]-coordinates[0][0]==0) {
            posx = true;
        }
        else if (coordinates[1][1]-coordinates[0][1]==0) {
            posy=true;
        }
        double ans=0;
        if (posx==false) {
            ans=((double)coordinates[1][1]-(double)coordinates[0][1])/((double)coordinates[1][0]-(double)coordinates[0][0]);
        }
        if (posx && posy) {
            return false;
        }

        for (int i = 0; i < coordinates.length-1; i++) {
            for (int j = 0; j < coordinates[i].length-1; j++) {
                if (posx) {
                    if((double)coordinates[i+1][j]-(double)coordinates[i][j]==0){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else if (posy) {
                    if((double)coordinates[i+1][j+1]-(double)coordinates[i][j+1]==0){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else if ((double)coordinates[i+1][j]-(double)coordinates[i][j]==0) {
                    return false;
                }
                else if (((double)coordinates[i+1][j+1]-(double)coordinates[i][j+1])/((double)coordinates[i+1][j]-(double)coordinates[i][j])!=ans) {
                    return false;
                }
            }
        }
        return true;
    }
    // System.out.println(((double)coordinates[i+1][j+1]-(double)coordinates[i][j+1])/((double)coordinates[i+1][j]-(double)coordinates[i][j]));
    public static void main(String[] args) {
        int [][] coordinates = {{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
        // int [][] coordinates = {{1,1},{2,2},{2,0}};
        // int [][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(coordinates));
    }
}