class Solution {
    public int findLUSlength(String x, String y) {
        if(x.equals(y)){
			return -1;
		}
         char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        int m = a.length;
        int n = b.length;
        int[][] t = new int[m+1][n+1];
        if(m==1){
            return n;
        }
        if(n==1){
            return m;
        }


        for(int i = 0; i < m+1; i++) {
            for(int j = 0; j < n+1; j++) {
                if(i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                else if(i==m){
                    t[i][j] = 1+ t[i][j-1];
                }
                else if(j==n){
                    t[i][j] = 1+ t[i-1][j];
                }
               
                else if(a[i-1] != b[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                } else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        

        return t[m][n];
    }
}