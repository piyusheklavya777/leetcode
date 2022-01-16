class Solution {
    public boolean isStrobogrammatic(String num) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0,0);
        map.put(1,1);
        map.put(8,8);
        map.put(6,9); map.put(9,6);
        
        int len = num.length();
        
        char[] c = num.toCharArray();
        
        for (int now = 0; now <= len / 2; now++) {
            
            int digit = c[now] - '0';
            
            int mirroredDigit = c[len - 1 - now] - '0';
            
            if (!map.containsKey(digit) || map.get(digit) != mirroredDigit)
                return false;
            
        }
        
        return true;
        
    }
}