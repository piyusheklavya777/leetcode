class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
        
        int n1 = a1.length, n2 = a2.length;
        
        if (n1 > n2) return findMedianSortedArrays(a2, a1);
        
        int lo = 0, hi = n1, l1 = 0, l2 = 0, r1 = 0, r2 = 0;
        
        while (lo <= hi) {
            
            int x = lo + (hi - lo) / 2;
            
            int y = (n1 + n2 + 1)/2 - x;
            
            l1 = x < 1 ? Integer.MIN_VALUE : a1[x-1];
            l2 = y < 1 ? Integer.MIN_VALUE : a2[y-1];
            
            r1 = x >= n1 ? Integer.MAX_VALUE : a1[x];
            r2 = y >= n2 ? Integer.MAX_VALUE : a2[y];
            
            if (l1 <= r2 && l2 <= r1) {
                
                if ((n1 + n2) % 2 == 0)
                    return ( Math.max(l1,l2) + Math.min(r1,r2)) / 2.0d;
                
                return Math.max(l1,l2);
                
            } else if (l1 > r2) hi = x - 1;
            
            else lo = x + 1;
            
        }
        
        throw new IllegalArgumentException();
        
    }
}