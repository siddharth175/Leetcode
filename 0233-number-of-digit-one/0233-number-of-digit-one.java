public class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long factor = 1;  
        
        while (factor <= n) {
            long higher = n / (factor * 10);   
            long current = (n / factor) % 10;  
            long lower = n % factor;           
            
            if (current == 0) {
                count += higher * factor;  
            } else if (current == 1) {
                count += higher * factor + lower + 1;  
            } else {
                count += (higher + 1) * factor; 
            }
            
            factor *= 10;  
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(solution.countDigitOne(13));  
        System.out.println(solution.countDigitOne(0));   
        System.out.println(solution.countDigitOne(100)); 
    }
}
