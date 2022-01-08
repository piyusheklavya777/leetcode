class Solution {
    public int minFlipsMonoIncr(String s) {
        
        char[] c = s.toCharArray();
        
        int n = c.length;
        
        int[] zero = new int[n];
        int[] ones = new int[n];
        
        if (c[0] == '1') 
            zero[0] = 1;
        
        if (c[n-1] == '0') 
            ones[n-1] = 1;
        
        for (int i = 1; i < n; i++) {
            
            zero[i] += zero[i-1] + (c[i] == '1' ? 1 : 0);
            
            ones[n-1-i] += ones[n-1-(i-1)] + (c[n-1-i] == '0' ? 1 : 0);
            
        }
        
        // System.out.println(Arrays.toString(zero));
        // System.out.println(Arrays.toString(ones));
        
        int cost = Integer.MAX_VALUE;
        
        for (int i = 0; i < n-1; i++)
            cost = Math.min(cost, zero[i] + ones[i+1]);
        
        cost = Math.min(cost, zero[n-1]);
        cost = Math.min(cost, ones[0]);
        
        return cost;
        
    }
}