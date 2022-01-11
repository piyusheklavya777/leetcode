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
    int sum;
    public int sumRootToLeaf(TreeNode root) {
        
        if (root == null) return 0;
        
        sum = 0;
        
        dfs(root, 0);
        
        return sum;
        
    }
    
    private void dfs(TreeNode r, int tillNow) {
        
        if (r.left == null && r.right == null)
            sum += tillNow << 1 | r.val;
        
        if (r.left != null)
            dfs(r.left, tillNow << 1 | r.val);
        
        if (r.right != null)
            dfs(r.right, tillNow << 1 | r.val);
    }
}