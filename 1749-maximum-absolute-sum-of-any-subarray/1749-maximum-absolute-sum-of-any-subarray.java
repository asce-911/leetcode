class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res = Math.abs(nums[0]);
        for(int i = 1; i<nums.length;i++){
            max = Math.max(nums[i],max+nums[i]);
            min = Math.min(nums[i],min+nums[i]);
            res = Math.max(Math.abs(res),Math.max(Math.abs(max),Math.abs(min)));
        }
        return res;
    }
}