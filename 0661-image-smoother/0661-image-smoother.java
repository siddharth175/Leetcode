public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];

        
        int[] directions = {-1, 0, 1};

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;

                
                for (int dx : directions) {
                    for (int dy : directions) {
                        int ni = i + dx;
                        int nj = j + dy;

                        
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            sum += img[ni][nj];
                            count++;
                        }
                    }
                }

                
                result[i][j] = sum / count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] img1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        Solution solution = new Solution();
        int[][] smoothed1 = solution.imageSmoother(img1);

        System.out.println("Smoothed image:");
        for (int[] row : smoothed1) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[][] img2 = {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}};
        int[][] smoothed2 = solution.imageSmoother(img2);

        System.out.println("\nSmoothed image:");
        for (int[] row : smoothed2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
