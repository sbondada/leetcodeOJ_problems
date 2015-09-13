/**
 * Definition for singly-linked list.
 * public class ListNode {
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        if (head!=null)
        {
            next = head.next;
        }
        if (prev==null && next==null)
        {
            return head;
        }
        else
        {
            prev=curr;
            curr=next;
            next=next.next;
        }
        while(next!=null)
        {
            if (prev.val == curr.val)    
            {
                prev.next=next;
                curr.next = null;
                curr=next;
                next=next.next;
            }
            else
            {
                prev=curr;
                curr=next;
                next=next.next;
            }
        }
        if(prev.val==curr.val)
        {
            prev.next=next;
            curr.next=null;
        }
        return head;
    }
}
