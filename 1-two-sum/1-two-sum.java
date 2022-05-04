class Solution {
    public int[] twoSum(int[] a, int t) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < a.length; i++) {
            
            map.put(a[i], i);
            
            int compliment = t - a[i];
            
            int complimentIndex = map.getOrDefault(compliment, -1);
            
            if (complimentIndex == -1 || complimentIndex == i) continue;
            
            return new int[]{complimentIndex, i};
            
        }
        
        for (int i = 0; i < a.length; i++) {
            
            int compliment = t - a[i];
            
            int complimentIndex = map.getOrDefault(t - a[i], -1);
            
            if (complimentIndex == -1 || complimentIndex == i)
                continue;
            
            return new int[]{i, complimentIndex};
            
        }
        
        throw new IllegalArgumentException();
        
    }
}