class Solution {
    public int maxProduct(int[] nums) {
       int max = nums[0];
       int min = nums[0];
       int a = nums[0];
       for(int i = 1; i<nums.length;i++){
        int x = nums[i];
        int y = max * nums[i];
        int z = min * nums[i];
        max = Math.max(x,Math.max(y,z));
        min = Math.min(x,Math.min(y,z));
        a = Math.max(a,Math.max(max,min));
       }
       return a; 
    }
}