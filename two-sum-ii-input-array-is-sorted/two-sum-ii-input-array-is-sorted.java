class Solution {
    public int[] twoSum(int[] a, int t) {
        int j = 0;
        for (int i = 0; i < a.length - 1 && a[i] <= t / 2; i++)
            if ((j = bs(a, t - a[i], i+1)) != -1)
                return new int[]{i+1, j+1};
        
        return new int[]{-1,-1};
        
    }
    
    public int bs(int[] a, int t, int lo) {
        
        int hi = a.length - 1, m = 0;
        
        while (lo <= hi) {
            
            m = lo + (hi - lo) / 2;
            
            if (a[m] == t) return m;
            
            if (a[m] > t) hi = m - 1;
            
            else lo = m + 1;
        }
        
        return -1;
    }
}