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
        int[] a= new int[2];
        a[1]=Integer.MIN_VALUE;
        a[0]=Integer.MAX_VALUE;
        getMaxMinHeight(root,0,a);
        if(root!=null) 
        {
            if(a[1]-a[0]>1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return true;
        }
    }
    public void getMaxMinHeight(TreeNode root,int h,int[] a)
    {
        if(root!=null) 
        {
            getMaxMinHeight(root.left,h+1,a);
            getMaxMinHeight(root.right,h+1,a);
        }
        else
        {
            if (h-1<a[0])
            {
                a[0]=h-1;
            }
            if (h-1>a[1])
            {
                a[1]=h-1;
            }
        }
    }
}
