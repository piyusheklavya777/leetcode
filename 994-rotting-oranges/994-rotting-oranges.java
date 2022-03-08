class Solution {
    public int orangesRotting(int[][] a) {
        
        int[][] dirs = new int[][]{
            {0,1},
            {0,-1},
            {-1,0},
            {1,0}
        };
        
        int m = a.length, n = a[0].length;
        
        boolean[][] vis = new boolean[a.length][a[0].length];
        
        Queue<int[]> q = new LinkedList<>();
        
        int goodOranges = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1)
                    goodOranges++;
                else if (a[i][j] == 2) 
                    q.offer(new int[]{i,j});
            }
        }
        
        int time = 0;
        
        if (goodOranges == 0) return 0;
        
        while (!q.isEmpty()) {
            
            int size = q.size();
            time++;
            
            while (size-- > 0) {
                
                int[] now = q.poll();

                int x = now[0], y = now[1];

                if (!vis[x][y]) {
                    vis[x][y] = true;
                }

                for (int[] dir : dirs) {

                    int newx = x + dir[0], newy = y + dir[1];

                    if (newx < 0 || newx >= m || newy < 0 || newy >= n || vis[newx][newy] || a[newx][newy] != 1)
                        continue;

                    goodOranges--;
                    q.offer(new int[]{newx, newy});
                    vis[newx][newy] = true;
                    if (goodOranges == 0) return time;
                }
            }
            
        }
        
        return -1;
        
    }
}