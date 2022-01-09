class Solution {
    public int minSwaps(int[] a) {
        
        int ones = 0, count = 0, min = Integer.MAX_VALUE;
        
        for (int x : a)
            if (x == 1)
                ones++;
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < ones; i++) {
            q.offer(a[i]);
            if (a[i] == 0) count++;
        }
        
        min = Math.min(min, count);
        
        for (int i = ones; i < a.length; i++) {
            
            if (a[i] == 0)
                count++;
            
            q.offer(a[i]);
            
            if (q.poll() == 0)
                count--;
            
            min = Math.min(min, count);
            
        }
        
        return min;
        
    }
}