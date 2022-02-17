class Solution {
    
    List<List<Integer>> ans;
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        ans = new ArrayList<>();
        
        dfs(0, n, k, new ArrayList<>());
        
        return ans;
        
    }
    
    
    public void dfs(int now, int t, int k, List<Integer> tillNow) {
        
        if (t == 0 && k == 0) {
            
            ans.add(new ArrayList<>(tillNow));
            return;
            
        }
        
        if (k == 0) return;
        
        for (int i = now+1; i < 10; i++) {
            
            tillNow.add(i);
            dfs(i, t-i, k-1, tillNow);
            tillNow.remove(tillNow.size()-1);
            
        }
        
        return;
        
    }
}