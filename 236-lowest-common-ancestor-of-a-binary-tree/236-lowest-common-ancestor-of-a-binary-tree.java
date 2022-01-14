/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    class Result {
        
        TreeNode lca;
        boolean foundP, foundQ;
        
        Result () {}
        
        Result (TreeNode lca, boolean foundP, boolean foundQ) {
            this.lca = lca;
            this.foundP = foundP;
            this.foundQ = foundQ;
        }
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return dfs(root, p, q).lca;
        
    }
    
    private Result dfs(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null) return new Result();
        
        Result leftResult = dfs(root.left, p, q);
        Result rightResult = dfs(root.right, p, q);
        
        if (leftResult.lca != null)
            return leftResult;
        
        if (rightResult.lca != null)
            return rightResult;
        
        if (leftResult.foundP && rightResult.foundQ || leftResult.foundQ && rightResult.foundP)
            return new Result(root, true, true);
        
        if (root == p) {
            
            if (leftResult.foundQ) return new Result (root, true, true);
            if (rightResult.foundQ) return new Result (root, true, true);
            
            return new Result(null, true, false);
        }
        
        if (root == q) {
            
            if (leftResult.foundP) return new Result (root, true, true);
            if (rightResult.foundP) return new Result (root, true, true);
            
            return new Result(null, false, true);
        }
        
        return new Result (
            null,
            leftResult.foundP || rightResult.foundP,
            leftResult.foundQ || rightResult.foundQ
        );
        
    }
}