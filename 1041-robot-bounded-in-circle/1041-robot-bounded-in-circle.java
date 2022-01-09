class Solution {
    public boolean isRobotBounded(String a) {
        
        int[][] dirs = new int[][]{{0,1},{-1,0},{0,-1},{1,0}};
        
        int dir = 0, x = 0, y = 0, loops = 4;
        
        while (loops-- > 0) {
            
            for (Character c : a.toCharArray())
                if (c == 'L') {
                    dir++; if (dir == 4) dir = 0;
                }
                else if (c == 'R') {
                    dir--; if (dir == -1) dir = 3;
                }
                else {
                    x += dirs[dir][0];
                    y += dirs[dir][1];
                }
            
            if (x == 0 && y == 0 && dir == 0) return true;

        }

        
        return x == 0 && y == 0 && dir == 0;
        
    }
}