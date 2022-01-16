class Solution {
    public int maxDistToClosest(int[] a) {
        
        int n = a.length, maxDist = 0;
        
        int[] leftClosest = new int[n];
        
        int lastLeft = -50000;
        
        for (int i = 0; i < n; i++) {
            
            if (a[i] == 1) lastLeft = i;
            
            leftClosest[i] = i - lastLeft;
                
        }
        
        int lastRight = 100000;
        
        for (int i = n-1; i >= 0; i--) {
            
            if (a[i] == 1) lastRight = i;
            
            int rightClosest = lastRight - i;
            
            if (Math.min(leftClosest[i], rightClosest) > maxDist)
                maxDist = Math.min(leftClosest[i], rightClosest);
                
        }
        
        return maxDist;
        
    }
}