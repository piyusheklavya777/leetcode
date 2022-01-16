class Solution {
    public int coinChange(int[] coins, int n) {
        
        int MAX = 1_000_000;
        
        int clen = coins.length;
        
        int[] dp = new int[n + 1];
        
        for (int toMake = 1; toMake <= n; toMake++) {
            
            dp[toMake] = MAX;
            
            for (int ci = clen - 1; ci >= 0; ci--) {
                
                int coinValue = coins[ci];
                
                if (toMake < coinValue || dp[toMake - coinValue] == MAX) continue;
                
                dp[toMake] = Math.min(dp[toMake], 1 + dp[toMake - coinValue]);
        
            }
            
        }
        
        return dp[n] == MAX ? -1 : dp[n];
        
    }
}