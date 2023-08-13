public class setmatrixzeros {
    public static void main(String[] args) {
        int [][]matrix = {{0},{ 1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.print(matrix[i][j]+" ");
            }
            // System.out.println();
        }
        int row = 0;
        int column = 0;
        int[][]matrix1 = new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0) {
                    row = i;
                    column = j;
                    for (int j2 = 0; j2 < matrix.length+1; j2++) {
                        matrix1[j2][j] = 1;
                    }
                    for (int j2 = 0; j2 < matrix[i].length+1; j2++) {
                        matrix1[i][j2] = 1;
                    }
                }
            }
            // System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix1[i][j]==0) {
                    matrix1[i][j]=matrix[i][j];
                }
                else{
                    matrix1[i][j]=0;
                }
                // System.out.print(matrix[i][j] + " ");
            }
            // System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.print(matrix1[i][j] + " ");
                matrix[i][j]=matrix1[i][j];
            }
            // System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                // matrix[i][j]=matrix1[i][j];
            }
            System.out.println();
        }
    }
}
