class Solution {
    public int numPairsDivisibleBy60(int[] a) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int ans = 0;
        
        for (int i = 0; i < a.length; i++)
            map.put(a[i] % 60 , map.getOrDefault(a[i] % 60, 0) + 1);
        
        for (Integer k : map.keySet())
            if (k <= 30)
                if (k == 30 || k == 0)
                    ans += (map.get(k) * (map.get((60 - k) % 60) - 1)) / 2;
                else
                    ans += map.get(k) * map.getOrDefault(60 - k, 0);
        
        
        return ans;
    }
}