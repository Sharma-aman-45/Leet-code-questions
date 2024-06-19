class Solution {
    public int singleNonDuplicate(int[] nums) {
       int r=0;
      for(int i=0;i<nums.length;i++){
          r=r^nums[i];
      }  
      return r;
    }
}