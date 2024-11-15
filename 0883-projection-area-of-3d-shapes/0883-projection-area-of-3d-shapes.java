public class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        
        int xyProjection = 0; 
        int yzProjection = 0; 
        int zxProjection = 0; 
        for (int i = 0; i < n; i++) {
            int maxRow = 0; 
            int maxCol = 0; 

            for (int j = 0; j < n; j++) {
                
                if (grid[i][j] > 0) {
                    xyProjection++;
                }

                
                maxRow = Math.max(maxRow, grid[i][j]);

                
                maxCol = Math.max(maxCol, grid[j][i]);
            }

            
            zxProjection += maxRow;
            yzProjection += maxCol;
        }

        
        return xyProjection + yzProjection + zxProjection;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] grid1 = {{1, 2}, {3, 4}};
        System.out.println(solution.projectionArea(grid1)); 

        int[][] grid2 = {{2}};
        System.out.println(solution.projectionArea(grid2)); 
    }
}
