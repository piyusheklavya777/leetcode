class Solution {
    public int findMinArrowShots(int[][] a) {
        
        int start = 0, end = 1;
        
        Arrays.sort(a, (balloonA, balloonB) -> {
            
            if (balloonA[start] == balloonB[start]) return 0;
            return balloonA[start] < balloonB[start] ? -1 : 1;
                
        });
        
        int arrows = 0, balloon = 0, totalBalloons = a.length, maxArrowRightShift;
        
        while (balloon < totalBalloons) {
            
            arrows++;
            maxArrowRightShift = a[balloon][end];
            
            while (balloon < totalBalloons - 1 && a[balloon + 1][start] <= maxArrowRightShift) {
                
                balloon++;
                maxArrowRightShift = Math.min(maxArrowRightShift, a[balloon][end]);
                
            }
            
            balloon++;
            
        }
        
        return arrows;
        
    }
}