class Solution {
    public int maxSubArray(int[] nums) {
       int b = nums[0];
       int a = nums[0];
       for(int i =1;i<nums.length;i++){
        int x = b + nums[i];
        int y = nums[i];
        b = Math.max(x,y);
        a = Math.max(a,b);
       }
       return a; 
    }
}