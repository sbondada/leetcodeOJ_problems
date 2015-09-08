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
        if(head!=null && head.next!=null)
        {
            ListNode slow_ptr = head;
            ListNode fast_ptr = head;
            while( fast_ptr.next != null && fast_ptr.next.next != null)
            {
                slow_ptr=slow_ptr.next;
                fast_ptr=fast_ptr.next.next;
            }
            ListNode first_half = head;
            ListNode second_half = slow_ptr.next;
            slow_ptr.next =  null;
            second_half = reverseList(second_half); 
            while(second_half!=null) 
            {
                if(second_half.val!=first_half.val) 
                {
                    return false;
                }
                first_half=first_half.next;
                second_half = second_half.next;
            }
        }
        return true;
    }
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head ;
        ListNode next = curr.next;
        while(next!=null)
        {
            curr.next=prev;            
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;
        return curr;
    }    }
}
