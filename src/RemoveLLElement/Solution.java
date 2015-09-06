/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        if(head!=null)
        {
           next = head.next;
        }
        
        while(next != null)
        {
            if (curr.val == val)
            {
                if (prev!=null)
                {
                    prev.next = next;
                }
                else
                {
                    head = curr.next;
                }
                curr.next = null;
                curr = next;
                next = next.next;
            }
            else
            {
                prev=curr;
                curr=next;
                next=next.next;
            }
        }

        if (curr != null && curr.val==val)
        {
            curr.next=null;
            if (prev==null)
            {
                head=null;
            }
            else
            {
                prev.next=next;
            }
        }
        return head;
    }
}
