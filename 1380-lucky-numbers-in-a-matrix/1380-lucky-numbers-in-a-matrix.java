import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> luckyNumbers = new ArrayList<>();
        
        
        int[] rowMins = new int[rows];
        int[] minColIndex = new int[rows];
        
        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }
            rowMins[i] = min;
            minColIndex[i] = colIndex;
        }
        
        
        for (int i = 0; i < rows; i++) {
            int minValue = rowMins[i];
            int col = minColIndex[i];
            boolean isLucky = true;
            
            for (int j = 0; j < rows; j++) {
                if (matrix[j][col] > minValue) {
                    isLucky = false;
                    break;
                }
            }
            
            if (isLucky) {
                luckyNumbers.add(minValue);
            }
        }
        
        return luckyNumbers;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[][] matrix1 = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(obj.luckyNumbers(matrix1));  

        int[][] matrix2 = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        System.out.println(obj.luckyNumbers(matrix2));  

        int[][] matrix3 = {{7, 8}, {1, 2}};
        System.out.println(obj.luckyNumbers(matrix3));  
    }
}
