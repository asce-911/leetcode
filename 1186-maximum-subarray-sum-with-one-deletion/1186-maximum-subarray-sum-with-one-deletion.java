class Solution {
    public int maximumSum(int[] arr) {
      int nodel = arr[0];
      int onedel = Integer.MIN_VALUE;
      int res = arr[0];
      for(int i = 1 ; i<arr.length;i++){
        int prevnodel = nodel;
        int prevonedel = onedel;
        nodel = Math.max(arr[i],nodel+arr[i]);
        int v;
        if(prevonedel==Integer.MIN_VALUE){
            v=arr[i];
        } else{
            v = prevonedel + arr[i];
        }
        onedel = Math.max(v,prevnodel);
        res = Math.max(res,Math.max(nodel,onedel));
      }
      return res;  
    }
}