import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        
        int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
        
        
        if (sum < desiredTotal) return false;
        
        
        if (desiredTotal <= 0) return true;
        
        
        Map<Integer, Boolean> memo = new HashMap<>();
        
        return canIWinHelper(maxChoosableInteger, desiredTotal, 0, memo);
    }
    
    
    private boolean canIWinHelper(int maxChoosableInteger, int desiredTotal, int usedNumbers, Map<Integer, Boolean> memo) {
        
        if (memo.containsKey(usedNumbers)) {
            return memo.get(usedNumbers);
        }
        
        
        for (int i = 1; i <= maxChoosableInteger; i++) {
            
            int currentBit = 1 << (i - 1);
            
            
            if ((usedNumbers & currentBit) != 0) continue;
            
            
            if (i >= desiredTotal || !canIWinHelper(maxChoosableInteger, desiredTotal - i, usedNumbers | currentBit, memo)) {
                memo.put(usedNumbers, true);
                return true;
            }
        }
        
        
        memo.put(usedNumbers, false);
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.canIWin(10, 11)); 
        System.out.println(solution.canIWin(10, 40)); 
    }
}
