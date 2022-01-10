class Solution {
    public String addBinary(String a, String b) {
        
        int carry = 0;
        
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Math.max(c1.length, c2.length); i++) {
            
            int v1 = c1.length-1 - i < 0 ? 0 : c1[c1.length-1 - i]-'0';
            int v2 = c2.length-1 - i < 0 ? 0 : c2[c2.length-1 - i]-'0';
            
            int sum = v1 + v2 + carry;
            
            if (sum == 3) {
                sum = 1;
                carry = 1;
            } else if (sum == 2) {
                sum = 0;
                carry = 1;
            } else if (sum == 1) {
                sum = 1;
                carry = 0;
            }
            
            sb.append(sum);
            
        }
        
        if (carry == 1)
            sb.append(1);
        
        sb.reverse();
        
        return sb.toString();
        
    }
}