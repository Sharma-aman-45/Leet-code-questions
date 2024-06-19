class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        double median ;
        
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        
        
        while (i < m) {
            result[k++] = nums1[i++];
        }
        
        
        while (j < n) {
            result[k++] = nums2[j++];
        }
                 int r = result.length;

     if((r%2)==0){
            
             int middle1 = result[r / 2 - 1];
            int middle2 = result[ r / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
         }
         else{
             return (double) result[r / 2];
         }
        
}

        
      
    }
