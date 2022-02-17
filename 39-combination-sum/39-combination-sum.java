class Solution {
    
    List<List<Integer>> ans;
    
    public List<List<Integer>> combinationSum(int[] a, int t) {
        
        ans = new ArrayList<>();
        
        Arrays.sort(a);
        
        if (t < a[0]) return ans;
        
        bt(0, t, new ArrayList<>(), a);
        
        return ans;
        
    }
    
    public void bt(int nowat, int t, List<Integer> tillNow, int[] a) {
        
        if (t == 0) {
            
            ans.add(new ArrayList<>(tillNow));
            return;
            
        }
        
        if (a[nowat] > t) return;
        
        for (int i = nowat; i < a.length; i++) {
            
            tillNow.add(a[i]);
            bt(i, t-a[i], tillNow, a);
            tillNow.remove(tillNow.size()-1);
            
        }

        
    }
}