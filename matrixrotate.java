public interface matrixrotate {
    public static void rotate(int[][] matrix) {
        int[][] matrix1 = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                matrix1[i][matrix.length - 1 - j] = matrix[j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix1[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[i][matrix.length - 1 - j] + " ");
            }
            System.out.println();
        }
        System.out.println("After rotating");
        rotate(matrix);
    }
}
