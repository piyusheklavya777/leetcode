class Solution {
    public int rob(int[] a) {
        
        if (a.length == 1) return a[0];
        
        int[] dp = new int[a.length];
        
        dp[0] = a[0]; dp[1] = Math.max(dp[0], a[1]);
        
        for (int i = 2; i < a.length; i++)
            dp[i] = Math.max(dp[i-1], dp[i-2] + a[i]);
        
        return dp[a.length-1];
            
        
    }
}