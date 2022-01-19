class Solution {
    
    List<List<Integer>> ans;
    
    public List<List<Integer>> permute(int[] a) {
        
    ans = new ArrayList<>();
        
    dfs(a, new boolean[a.length], new ArrayList<Integer>());
    
    return ans;
    
    }
    
    private void dfs(int[] values, boolean[] vis, ArrayList<Integer> tillNow) {
        
        int n = values.length;
        
        if (tillNow.size() == n) {
            
            ans.add(new ArrayList<>(tillNow));
            return;
            
        }
        
        for (int i = 0; i < n; i++) {
            
            if (vis[i]) continue;
            
            vis[i] = true;
            tillNow.add(values[i]);
            
            dfs(values, vis, tillNow);
            
            tillNow.remove(tillNow.size() - 1);
            vis[i] = false;
            
        }
        
    }
}