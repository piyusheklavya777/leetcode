class Solution {
    public boolean carPooling(int[][] a, int k) {
        
        int[] prefix = new int[1001];
        
        for (int[] x : a) {
            prefix[x[1]] += x[0];
            prefix[x[2]] -= x[0];
        }
        
        if (prefix[0] > k) return false;
        
        for (int i = 1; i < 1001; i++) {
            prefix[i] += prefix[i-1];
            if (prefix[i] > k) return false;
        }
        
        return true;
        
        
        
    }
}