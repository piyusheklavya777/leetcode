class Solution {
    
    List<List<Integer>> ans;
    
    public List<List<Integer>> subsets(int[] nums) {
        
        Arrays.sort(nums);
        
        ans = new ArrayList<>();
        
        dfs(nums, 0, new ArrayList<>());
        
        return ans;
        
    }
    
    public void dfs(int[] nums, int nowat, List<Integer> tillNow) {
        
        if (nowat == nums.length) {

            ans.add(new ArrayList(tillNow));
            return;
            
        }
          
        if (nowat > 0 && nums[nowat] == nums[nowat-1]) {
            dfs(nums, nowat+1, tillNow);
            return;
        }

        tillNow.add(nums[nowat]);
        dfs(nums, nowat+1, tillNow);
        tillNow.remove(tillNow.size()-1);

        dfs(nums, nowat+1, tillNow);
        
    }
}