class Solution {
    public int findJudge(int n, int[][] trust) {
        
        List<List<Integer>> trustedBy = new ArrayList<>();
        List<List<Integer>> trusts    = new ArrayList<>();
        
        for(int i = 0; i <= n; i++) {
            trustedBy.add(new ArrayList<>());
            trusts.add(new ArrayList<>());
        }
            
        for(int[] r : trust) {
            trustedBy.get(r[1]).add(r[0]);
            trusts.get(r[0]).add(r[1]);
        }
        
        for (int i = 1; i <= n; i++)
            if(trustedBy.get(i).size() == n-1 && trusts.get(i).size() == 0)
                return i;
        
        return -1;
    }
}