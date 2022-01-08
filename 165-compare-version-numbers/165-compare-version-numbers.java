class Solution {
    public int compareVersion(String v1, String v2) {
        
        String[] v1split = v1.split("\\.",0);
        String[] v2split = v2.split("\\.",0);
        
        int n =  Math.max(v1split.length, v2split.length);
        
        int i = 0;
        
        while (i < n) {
            
            int v1n = i >= v1split.length ? 0 : Integer.parseInt(v1split[i]);
            int v2n = i >= v2split.length ? 0 :Integer.parseInt(v2split[i]);
            
            if (v1n > v2n) return 1;
            if (v1n < v2n) return -1;
            
            i++;
            
        }
        
        return 0;
        
    }
}