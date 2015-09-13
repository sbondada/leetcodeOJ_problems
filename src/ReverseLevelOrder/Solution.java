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
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        HashMap<Integer,List<Integer>> mt = new HashMap<Integer,List<Integer>>(); 
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        traverseTree(root,0,mt);
        int i = mt.size()-1;  
        while(i>=0)
        {
            lst.add(mt.get(i));
            i--;
        }
        return lst;
    }
    public void traverseTree(TreeNode root,int height,HashMap<Integer,List<Integer>> mt)
    {
        if(root!=null) 
        {
            traverseTree(root.left,height+1,mt);
            if(mt.containsKey(height))
            {
                mt.get(height).add(root.val);
            }
            else
            {
                List<Integer> lst = new ArrayList<Integer>();
                lst.add(root.val);
                mt.put(height,lst);
            }
            traverseTree(root.right,height+1,mt);
        }
    }
     
}
