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
    public boolean isSymmetric(TreeNode root) 
    {
        return compareTrees(root,root); 
    }
    public boolean compareTrees(TreeNode r1,TreeNode r2)
    {
        if(r1!=null && r2!=null)
        {
            if(r1.val==r2.val)
            {
                boolean left = compareTrees(r1.left,r2.right);
                boolean right = compareTrees(r1.right,r2.left);
                return left&&right;
            }
            else
            {
                return false;
            }
        }
        else if(r1==null && r2==null)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
