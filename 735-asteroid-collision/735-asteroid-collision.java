class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Deque<Integer> atPeace = new ArrayDeque<>();
        
        int totalAsteroids = asteroids.length;
        
        for (int i = 0; i < totalAsteroids; i++) {
            
            Integer now = asteroids[i];
            
            while (now != null && (atPeace.size() != 0 && atPeace.peekFirst() > 0 && now < 0)) {
                
                int collidesWith = atPeace.pollFirst();
                
                if (Math.abs(now) == Math.abs(collidesWith)) now = null;
                
                else now = Math.abs(now) > Math.abs(collidesWith) ? now : collidesWith;
                
            }
            
            if (now == null) continue;
            
            atPeace.offerFirst(now);
            
            // System.out.println(atPeace.toString());
            
        }
        
        int[] ans = new int[atPeace.size()]; int ansp = 0;
        
        while (atPeace.size() != 0) {
            
            ans[ansp++] = atPeace.pollLast();
            
        }
        
        return ans;
        
    }
}