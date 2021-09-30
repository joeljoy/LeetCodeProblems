package array;

public class MatrixReShape {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int currentRow = mat.length;
        int currentCol = mat[0].length;
        int newRow = 0;
        int newCol = 0;
        boolean isReshapePossible = (currentCol * currentRow) == (r * c);
        if (isReshapePossible) {
            return convertMatrix(mat, r, c, currentRow, currentCol, newRow, newCol);
        } else {
            //existing matrix
            return mat;
        }
    }

    private int[][] convertMatrix(int[][] mat, int r, int c, int currentRow, int currentCol, int newRow, int newCol) {
        int[][] result = new int[r][c];
        for (int i = 0; i < currentRow; i++) {
            for (int j = 0; j < currentCol; j++) {
                int element = mat[i][j];
                result[newRow][newCol] = element;
                newCol++;
                if (newCol >= c) {
                    newCol = 0;
                    newRow++;
                }
            }
        }
        return result;
    }
}
