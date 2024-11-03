import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        
        if (nums.length == 0) {
            return ranges;  
        }

        int start = nums[0];  

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] != nums[i - 1] + 1) {
                
                if (start == nums[i - 1]) {
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(start + "->" + nums[i - 1]);
                }
                
                start = nums[i];
            }
        }

        
        if (start == nums[nums.length - 1]) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "->" + nums[nums.length - 1]);
        }

        return ranges;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums1));  

        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(nums2));  
        int[] nums3 = {};
        System.out.println(summaryRanges(nums3));  

        int[] nums4 = {-1};
        System.out.println(summaryRanges(nums4));  
    }
}
