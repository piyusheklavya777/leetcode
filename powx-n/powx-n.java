class Solution {
    
    Map<Long,Double> map = new HashMap<>(); 
    
    public double myPow(double a, int pow) {
        
        long k = pow;
        
//         if (k == Integer.MIN_VALUE) {
//             if (a == 0d) return 0d;
//             if (Math.abs(a) == 1) return 1d;
//             if (Math.abs(a) > 1) return 0d;
//             if (Math.abs(a) < 1) {
                
//                 double ans = recur(a, -1 * (k / 2));
                
//                 return 1d / (ans * ans);
                
//             }
//         }
        
        boolean isneg = false;
        
        if (k == 0) return 1d;
        
        if (k < 0) {
            isneg = true;
            k = -k;
        }
        
        map.clear();
        
        double ans = recur(a,k);
        
        return isneg ? (1d / ans) : ans;
        
    }
    
    public double recur(double a, long k) {
        
        if (k == 1) return a;
        
        // System.out.println(k);
        
        if (map.containsKey(k))
            return map.get(k);
        
        double ans = recur(a, k / 2) * recur (a, k / 2);
        
        if ( k % 2 == 1) ans *= a;
        
        map.put(k, ans);
        
        return ans;
        
    }
}