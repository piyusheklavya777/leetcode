class Solution {
    public boolean isValidSudoku(char[][] a) {
        
        ArrayList<Set<Integer>> rowsets = new ArrayList<>();
        ArrayList<Set<Integer>> colsets = new ArrayList<>();
        ArrayList<Set<Integer>> submatrixsets = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) {
            rowsets.add(new HashSet<>());
            colsets.add(new HashSet<>());
            submatrixsets.add(new HashSet<>());
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
                int now = a[i][j] - '0';
                
                if (now < 0 || now > 9) continue;
                
                if (rowsets.get(i).contains(now))
                    return false;
                else
                    rowsets.get(i).add(now);
                
                if (colsets.get(j).contains(now))
                    return false;
                else
                colsets.get(j).add(now);
                
                int submatrixindex = getsubmatrixindex(i,j);
                
                if (submatrixsets.get(submatrixindex).contains(now))
                    return false;
                else
                submatrixsets.get(submatrixindex).add(now);
            }
        }
        
        return true;
        
    }
    
    private int getsubmatrixindex (int i, int j) {
        
        int row = i / 3;
        int col = j / 3;
        
        return row * 3 + col;
        
    }
}