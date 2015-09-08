/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
 public boolean isPalindrome(ListNode head) 
    {
        ArrayList res = checkPalindrome(head,head);
        return (boolean)res.get(1);
    }
      public ArrayList checkPalindrome(ListNode head,ListNode start) 
    {
        if(head!=null)     
        {
            ArrayList res = checkPalindrome(head.next,start);
            if (((ListNode)res.get(0)).val == head.val)
            {
                res.set(0,start.next);
                res.set(1,((boolean)res.get(1))||true);
                return res; 
            } 
            else
            {
                res.set(0,start.next);
                res.set(1,((boolean)res.get(1))||false);
                return res; 

            }
        }
        else
        {
            ArrayList resultList = new ArrayList();
            resultList.add(start);
            resultList.add(true);
            return resultList;
        }
    }
}
