class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
        int n = matrix.length;  //row
        int m = matrix[0].length;    //col //n*m
        int top = 0; int bootom = n-1;
        int left =0; int right = m-1; 
        while(top<=bootom && left<=right){
            for(int i=left; i<=right;i++){
                 ans.add(matrix[top][i]);
            }
            top++;
            for(int k = top; k<=bootom; k++){
                 ans.add(matrix[k][right]);
            }
            right--;
            if(top<=bootom){
            for(int l = right; l>=left; l--){
               ans.add(matrix[bootom][l]);
              
            }
             bootom--;
             
            }
            if(left<=right){
             for(int h = bootom; h>=top; h--){
               ans.add(matrix[h][left]);
             }
             left++;
            }
        }
        return ans;
    }
}