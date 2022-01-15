class Solution {
    public void setZeroes(int[][] a) {
        
        int m = a.length, n = a[0].length;
        
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (a[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
                
            }
        }
        
        for (Integer r : rows) {
            for (int c = 0; c < n; c++)
                a[r][c] = 0;
        }
        
        for (Integer c : cols) {
            for (int r = 0; r < m; r++)
                a[r][c] = 0;
        }
        
    }
}