class Solution {
    public static int searchInsert(int[] nums, int target) {
        int result=0;
        int insert =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }

        }
        return nums.length ;

        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int target = sc.nextInt();
        int result = searchInsert(nums,target);
        System.out.println(result);
    }
}