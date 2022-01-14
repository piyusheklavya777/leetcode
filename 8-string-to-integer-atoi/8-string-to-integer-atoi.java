class Solution {
    public int myAtoi(String s) {
        
        char[] input = s.toCharArray();
        
        int iter = 0, length = s.length();
        
        double ans = 0d;
        
        boolean isNegative = false;
        
        while (iter < length && input[iter] == ' ') iter++;
        
        if (iter == length) return 0; // no number
        
        if (input[iter] == '+' || input[iter] == '-') {
            
            if (input[iter] == '-') isNegative = true;
            
            iter++;
            
        }
        
        while (iter < length && input[iter] >= '0' && input[iter] <= '9') {
            
            ans = 10 * ans + input[iter] - '0';
            
            iter++;
            
        }
        
        if (isNegative && -ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        if (!isNegative && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            return (int)ans * (isNegative ? -1 : 1);
        
        
        
    }
}