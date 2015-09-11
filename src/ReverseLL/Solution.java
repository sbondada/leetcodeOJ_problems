/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        if (head!=null && head.next!=null)
        {
            next = curr.next;
        }
        else
        {
            return curr;
        }

        while(next!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;
        return curr;
    }
}
