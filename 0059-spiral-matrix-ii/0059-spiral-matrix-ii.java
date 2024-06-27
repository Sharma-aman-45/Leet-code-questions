class Solution {
    public int[][] generateMatrix(int p) {
        int n = p;
        int m = p;   //row
            //col //n*m
            int[][] matrix = new int[n][n];
            int nums = 1;
        int top = 0; int bootom = n-1;
        int left =0; int right = n-1; 
        while(top<=bootom && left<=right){
            for(int i=left; i<=right;i++){
                matrix[top][i] = nums++;
            }
            top++;
            for(int k = top; k<=bootom; k++){
             matrix[k][right] = nums++;
            }
            right--;
            if(top<=bootom){
            for(int l = right; l>=left; l--){
               matrix[bootom][l] = nums++;
              
            }
             bootom--;
             
            }
            if(left<=right){
             for(int h = bootom; h>=top; h--){
               matrix[h][left] = nums++;
             }
             left++;
            }
        }
        return matrix;
    }
}