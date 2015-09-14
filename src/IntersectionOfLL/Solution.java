/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int sizeA = size(headA);
        int sizeB = size(headB);
        int i;
        if(sizeA>sizeB)
        {
            i=0; 
            while(i<(sizeA-sizeB))
            {
               headA=headA.next; 
               i++;
            }
        }
        else
        {
            i=0; 
            while(i<(sizeB-sizeA))
            {
               headB=headB.next; 
               i++;
            }
        }
        while(headA!=null && headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    public int size(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            head=head.next;
            count++;
        }
        return count;
    }
}
