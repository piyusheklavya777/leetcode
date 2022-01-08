class Solution {
    public String reorganizeString(String s) {
        
        int limit = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        
        if (s.length() < 3) return s;
        
        int[] freq = new int[26];
        int total = 0;
        
        for(char x : s.toCharArray())
            freq[x-'a']++;
            
        
        PriorityQueue<Character> pq = new PriorityQueue<>((va,vb) -> freq[vb-'a'] - freq[va-'a']);
        
        for(int i = 0; i < 26; i++)
            if (freq[i] > limit)
                return "";
            else if (freq[i] > 0)
                pq.add((char)('a'+i));
        
        StringBuilder sb = new StringBuilder();
        
        while (pq.size() > 1) {

            char big = pq.poll();
            char small = pq.poll();
            
            sb.append(big); sb.append(small); 
            
            freq[big-'a']--; freq[small-'a']--;
            
            if (freq[big-'a'] > 0) pq.offer(big);
            if (freq[small-'a'] > 0) pq.offer(small);
            
            total-= 2;

        }
        
        if (pq.size() == 1) 
            sb.append(pq.poll());
        
       return sb.toString();
        
    }
}