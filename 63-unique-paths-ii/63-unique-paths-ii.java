class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        
        if (a[0][0] == 1) return 0;
        
        int m = a.length, n = a[0].length;
        
        int[][] ways = new int[m][n];
        
        ways[0][0] = 1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (a[i][j] == 1 || i == 0 && j == 0) continue;
                
                ways[i][j] =  (i == 0 ? 0 : ways[i-1][j])
                            + (j == 0 ? 0 : ways[i][j-1]);
                
            }
        }
        
        return ways[m-1][n-1];
        
    }
}