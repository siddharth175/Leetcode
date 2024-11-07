import java.util.*;

public class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        
        Map<List<Integer>, Integer> memo = new HashMap<>();
        return dfs(price, special, needs, memo);
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<List<Integer>, Integer> memo) {
        
        if (memo.containsKey(needs)) {
            return memo.get(needs);
        }

        
        int minCost = 0;
        for (int i = 0; i < needs.size(); i++) {
            minCost += needs.get(i) * price.get(i);
        }

        
        for (List<Integer> offer : special) {
            List<Integer> newNeeds = new ArrayList<>();
            boolean validOffer = true;

            
            for (int i = 0; i < needs.size(); i++) {
                if (needs.get(i) < offer.get(i)) {
                    validOffer = false;
                    break;
                }
                newNeeds.add(needs.get(i) - offer.get(i));
            }

            
            if (validOffer) {
                minCost = Math.min(minCost, offer.get(needs.size()) + dfs(price, special, newNeeds, memo));
            }
        }

        
        memo.put(needs, minCost);
        return minCost;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        List<Integer> price = Arrays.asList(2, 5);
        List<List<Integer>> special = Arrays.asList(
            Arrays.asList(3, 0, 5),
            Arrays.asList(1, 2, 10)
        );
        List<Integer> needs = Arrays.asList(3, 2);
        
        System.out.println(solution.shoppingOffers(price, special, needs)); 
    }
}
