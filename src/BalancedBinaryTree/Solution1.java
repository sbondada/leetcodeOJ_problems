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
    public boolean isBalanced(TreeNode root) 
    {
        if(diff_length(root)!=null) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public Integer diff_length(TreeNode root)
    {
        if(root!=null)
        {
            Integer left = diff_length(root.left);
            Integer right = diff_length(root.right);
            if(left!=null && right!=null)
            {
                int min=Math.min(left,right);
                int max=Math.max(left,right);
                if(max-min > 1)
                {
                    return null; 
                }
                else
                {
                    return max+1;
                }
            }
            else
            {
                return (left==null?left:right);
            }
        }
        else
        {
            return 0;
        }
    }
}
