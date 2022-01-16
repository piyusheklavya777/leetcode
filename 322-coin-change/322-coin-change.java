class Solution {
    public int coinChange(int[] coins, int n) {
        
        int MAX = 1_000_000;
        
        Arrays.sort(coins);
        
        int clen = coins.length;
        
        int[] dp = new int[n + 1];
        
        Arrays.fill(dp, MAX);
        
        dp[0] = 0; // coins needed to make total 0.
        
        for (int toMake = 1; toMake <= n; toMake++) {
            
            for (int ci = clen - 1; ci >= 0; ci--) {
                
                int coinValue = coins[ci];
                
                if (toMake < coinValue || dp[toMake - coinValue] == MAX) continue; // need smaller coin
                
                dp[toMake] = Math.min(dp[toMake], 1 + dp[toMake - coinValue]);
        
            }
            
        }
        
        return dp[n] == MAX ? -1 : dp[n];
        
    }
}