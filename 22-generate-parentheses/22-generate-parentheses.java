class Solution {
    
    List<String> ans;
    
    public List<String> generateParenthesis(int n) {
        
        ans = new ArrayList<>();
        
        bt(new StringBuilder(), 0, 0, n);
        
        return ans;
        
    }
    
    private void bt(StringBuilder sb, int open, int closed, int t) {
        
        if (closed == t) {
            
            ans.add(sb.toString());
            return;
            
        }
        
        if (closed < open) {
            
            sb.append(")");
            bt(sb, open, closed + 1, t);
            sb.deleteCharAt(sb.length()-1);
            
        }
        
        if (open < t) {
            
            sb.append("(");
            bt(sb, open + 1, closed, t);
            sb.deleteCharAt(sb.length()-1);
            
        }
        
        return;
        
    }
}