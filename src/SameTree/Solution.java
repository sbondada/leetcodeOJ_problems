/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p!=null && q!=null)      
        {
            if(p.val==q.val)
            {
                boolean left = isSameTree(p.left,q.left);
                boolean right = isSameTree(p.right,q.right);
                return left&&right;
            }
            else
            {
                return false;
            }
        }
        else if(p==null && q==null)
        {
            return true;    
        }
        else
        {
            return false;
        }
    }
}
