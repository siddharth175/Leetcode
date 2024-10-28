import java.util.*;

public class Solution {
    public static boolean isAss(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isdes(int[] nums) {
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] < nums[j + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int trap(int[] nums) {  // Renamed method to trap
        int result = 0;
        if (nums.length < 3 || isAss(nums) || isdes(nums)) {
            System.out.println("Enter the size of an array greater than 3");
            return 0; // Return 0 if the input is invalid
        } else {
            int leftMaxval[] = new int[nums.length];
            int rightMaxval[] = new int[nums.length];
            int maxleft = 0;
            int maxright = 0;

            // Fill leftMaxval
            for (int i = 0; i < leftMaxval.length; i++) {
                leftMaxval[i] = maxleft;
                maxleft = Math.max(maxleft, nums[i]);
            }

            // Fill rightMaxval
            for (int j = rightMaxval.length - 1; j >= 0; j--) {
                rightMaxval[j] = maxright;
                maxright = Math.max(maxright, nums[j]);
            }

            // Calculate trapped water
            for (int k = 0; k < nums.length; k++) {
                result += Math.max(0, Math.min(leftMaxval[k], rightMaxval[k]) - nums[k]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = trap(nums); // Call the renamed method
        System.out.println("Trapped rainwater is: " + result);
    }
}
