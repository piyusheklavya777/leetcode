class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] split = s.split(" ",0);
        
        char[] p = pattern.toCharArray();
        
        Map<String, Character> map = new HashMap<>();
        
        Set<Character> seen = new HashSet<>();
        
        if (p.length != split.length) return false;
        
        for (int i = 0; i < split.length; i++) {
            
            String word = split[i];
            
            Character c = p[i];
            
            if (map.containsKey(word)) {
                
                if (map.get(word) == c) continue;
                
                else return false;
                
            } else if (seen.contains(c)) 
                return false;
            
              else {
                  map.put(word, c); seen.add(c);
              }
                  
            
        }
        
        return true;
        
    }
}