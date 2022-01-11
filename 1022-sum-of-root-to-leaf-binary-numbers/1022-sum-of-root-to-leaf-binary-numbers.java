/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int sumRootToLeaf(TreeNode root) {
        
        if (root == null) return 0;
        
        return dfs(root, 0);
        
    }
    
    private int dfs(TreeNode r, int tillNow) {
        
        if (r.left == null && r.right == null)
            return tillNow << 1 | r.val;
        
        int left = 0, right = 0;
        
        if (r.left != null)
            left = dfs(r.left, tillNow << 1 | r.val);
        
        if (r.right != null)
            right = dfs(r.right, tillNow << 1 | r.val);
        
        return left + right;
    }
}