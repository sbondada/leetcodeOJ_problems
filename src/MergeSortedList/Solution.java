/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode curr1 = l1;
        ListNode curr2 = l2; 

        ListNode curr = null; 
        ListNode head = null;

        while(curr1!=null && curr2!=null)
        {
            ListNode temp; 
            if(curr1.val<curr2.val)    
            {
                temp=curr1;
                if(curr==null)
                {
                    head = temp; 
                    curr=temp;
                }
                else
                {
                    curr.next = temp; 
                    curr=curr.next;
                }
                curr1=curr1.next;  
                temp.next=null;
            }
            else
            {
                temp=curr2;
                if(curr==null)
                {
                    head = temp; 
                    curr=temp;
                }
                else
                {
                    curr.next = temp; 
                    curr=curr.next;
                }
                curr2=curr2.next;  
                temp.next=null;
            }
        }
        if (curr1==null && curr2==null)
        {
            return head;
        }
        else if(curr1==null)
        {
            if(curr==null)
            {
                curr=curr2;
                head=curr2;
            }
            else
            {
                curr.next=curr2;
            }
        }
        else
        {
            if(curr==null)
            {
                curr=curr1;
                head=curr1;
            }
            else
            {
                curr.next=curr1;
            }
        }
        return head;
    }
}
