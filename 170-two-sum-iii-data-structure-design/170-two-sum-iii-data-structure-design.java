class TwoSum {
    
    public Map<Integer, Integer> freq;
    
    public TwoSum() {
        freq = new HashMap<>();
    }
    
    public void add(int number) {
        
        freq.put(number, freq.getOrDefault(number, 0)+1);
        
    }
    
    public boolean find(int value) {
        
        for (int x : freq.keySet()) {
            
            if (1.0f*x == (1.0f*value)/2) {
                if (freq.get(x) > 1)
                    return true;
                continue;
            }
            
            if (freq.containsKey(value - x))
                return true;
        }
        
        return false;
        
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */