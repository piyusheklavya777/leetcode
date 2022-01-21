class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        
        int[] extra = new int[n];
        
        for (int i = 0; i < n; i++)
            extra[i] = gas[i] - cost[i];
        
        // System.out.println(Arrays.toString(extra));
        
        int s = 0, e = 0; long sum = 0;
        
        while (e < n) {
            
            if (sum < 0) {
                sum = extra[e];
                s = e;
            } else {
                sum += extra[e];
            }
            
            e++;
      
        }
        
        e = 0;
        
        while (sum >= 0 && e < s) sum += extra[e++];
        
        if (sum >= 0 && (s == 0 || e == s)) return s;
        
        return -1;
    }
}