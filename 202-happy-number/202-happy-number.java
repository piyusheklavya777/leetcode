class Solution {
    public boolean isHappy(int x) {
        
        long n = x;
        
        Set<Long> seen = new HashSet<>();
        
        while (true) {
            
            long newnum = 0;
            
            while (n > 0) {
                newnum += Math.pow(n%10, 2);
                n /= 10;
            }
            
            if (newnum == 1) return true;
            if (seen.contains(newnum)) return false;
            seen.add(newnum);
            n = newnum;
        }
        
    }
}