import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Solution {
    private int m, n, total;
    private Map<Integer, Integer> flipped;
    private Random random;

    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        this.total = m * n;
        this.flipped = new HashMap<>();
        this.random = new Random();
    }

    public int[] flip() {
        int randIndex = random.nextInt(total);
        
        
        int actualIndex = flipped.getOrDefault(randIndex, randIndex);
        
        
        flipped.put(randIndex, flipped.getOrDefault(total - 1, total - 1));
        
        
        total--;
        
        
        return new int[]{actualIndex / n, actualIndex % n};
    }

    public void reset() {
        
        flipped.clear();
        total = m * n;
    }
}
