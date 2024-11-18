import java.util.Scanner;

class Solution {
    public int minDeletionSize(String[] strs) {
        int numRows = strs.length;      
        int numCols = strs[0].length();  
        int deleteCount = 0;             

        
        for (int col = 0; col < numCols; col++) {
            
            for (int row = 0; row < numRows - 1; row++) {
                if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    
                    deleteCount++;
                    break;
                }
            }
        }
        return deleteCount; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int n = sc.nextInt(); 
        sc.nextLine(); 

        String[] strs = new String[n];
        System.out.println("Enter the strings one by one:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine(); 
        }

        Solution solution = new Solution();
        System.out.println("Number of columns to delete: " + solution.minDeletionSize(strs));
    }
}
