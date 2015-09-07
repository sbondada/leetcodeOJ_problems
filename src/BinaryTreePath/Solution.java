/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) 
    {
        ArrayList<String> path_list =  new ArrayList<String>();
        if (root!=null)
        {
            constructPaths(path_list,root,"");
        }
        return path_list;
    }
    public void constructPaths(ArrayList<String> path_list,TreeNode root, String str)
    {
       if(root!=null) 
       {
           String tempstr;
           if (!str.equals(""))
           {
                tempstr = str+"->"+Integer.toString(root.val);
           }
           else
           {
                tempstr = str+Integer.toString(root.val);
           }
           if (root.left==null && root.right==null)
           {
               path_list.add(tempstr);
           }
           else
           {
            constructPaths(path_list,root.left,tempstr); 
            constructPaths(path_list,root.right,tempstr); 
           }
       }
    }
}
