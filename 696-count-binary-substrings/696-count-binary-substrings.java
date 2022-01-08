class Solution {
    public int countBinarySubstrings(String s) {
        
        int it = 0, ans = 0, n = s.length(), prev = 0, curr = 0;
        
        char[] c = s.toCharArray();
        
        while (it < n) {
            
            int now = c[it] - '0';
            
            while (it < n && c[it]-'0' == now) {
                curr++; it++;
            }
            
            int min = Math.min(curr, prev);
            
            ans += min;
            
            prev = curr; curr = 0;
        }  
        
        return ans;
    }
}
