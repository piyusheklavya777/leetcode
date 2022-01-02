class Solution {
    
    Set<List<Integer>> ans;
    
    public List<List<Integer>> combinationSum(int[] a, int t) {
        
        ans = new HashSet<>();
        
        Arrays.sort(a);
        
        List<Integer> local = new ArrayList<>();
        
        dfs(0, a, local, t);
        
        return new ArrayList<>(ans);
        
    }
    
    public void dfs(int now, int[] a, List<Integer> local, int t) {
    
        if (t == 0) {
            
            ans.add(new ArrayList<>(local));
            return;
            
        }
        
        if (t < 0 || now == a.length) return;
        
        dfs(now + 1, a, local, t);
        
        for (int i = now; i < a.length; i++) {
            
            local.add(a[i]);
            dfs(i, a, local, t - a[i]);
            local.remove(local.size() - 1);
            
        }
        
        return;
        
    }
}