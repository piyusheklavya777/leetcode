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
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        
        if (root == null) return null;
        
        Deque<TreeNode> level = new ArrayDeque<>();
        
        level.offerLast(root);
        
        boolean returnNext = false;
        
        while (!level.isEmpty()) {
            
            int size = level.size();
            
            returnNext = false;
            
            while (size-- > 0) {
                
                TreeNode now = level.pollFirst();
                
                if (returnNext) return now; // was set to true when last node was visited and it matched
                
                if (now == u) returnNext = true;
                
                if (now.left != null) level.offerLast(now.left);
                if (now.right != null) level.offerLast(now.right);
                
            }
            
        }
        
        return null;
        
    }
}