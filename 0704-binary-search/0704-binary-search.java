class Solution {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums [] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }

        int target = sc.nextInt();

        int result = search(nums,target);
        System.out.println(result);
    }

}