class Solution {
    public int minCostClimbingStairs(int[] c) {
        
        int n = c.length;
        
        int[] dp = new int[n];
        
        dp[0] = 0;
        
        dp[1] = 0;
        
        for (int i = 2; i < n; i++)
            dp[i] = Math.min(dp[i-1]+c[i-1], dp[i-2]+c[i-2]);
        
        int finalCost = Math.min(dp[n-1]+c[n-1], dp[n-2]+c[n-2]);
        
        return finalCost;
        
    }
}