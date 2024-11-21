public class Solution {
    public static int knightDialer(int n) {
        int MOD = 1_000_000_007;

        
        int[][] moves = {
            {4, 6}, {6, 8}, {7, 9}, {4, 8}, {0, 3, 9},
            {}, {0, 1, 7}, {2, 6}, {1, 3}, {2, 4}
        };

        
        long[] prev = new long[10];
        long[] curr = new long[10];

        
        Arrays.fill(prev, 1);

        
        for (int length = 2; length <= n; length++) {
            Arrays.fill(curr, 0); 
            for (int digit = 0; digit <= 9; digit++) {
                for (int prevDigit : moves[digit]) {
                    curr[digit] = (curr[digit] + prev[prevDigit]) % MOD;
                }
            }
           
            long[] temp = prev;
            prev = curr;
            curr = temp;
        }

        
        long result = 0;
        for (long count : prev) {
            result = (result + count) % MOD;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(knightDialer(1)); 
        System.out.println(knightDialer(2)); 
        System.out.println(knightDialer(3)); 
    }
}
