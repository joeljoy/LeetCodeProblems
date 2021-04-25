package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if (numRows == 1) return result;
        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> prevRow = result.get(i - 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    currentRow.add(sum);
                }
            }
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle triangle = new PascalsTriangle();
        List<List<Integer>> result = triangle.generate(5);
        for (List<Integer> row : result) {
            for (Integer elements : row) {
                System.out.print(elements + ",");
            }
            System.out.println();
        }
    }
}
