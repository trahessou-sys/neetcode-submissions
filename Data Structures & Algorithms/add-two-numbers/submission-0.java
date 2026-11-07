/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,0);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2,int retenue){
        if(l1==null && l2==null && retenue==0){return null;}
        if(l1==null && l2==null && retenue==1){return new ListNode(1);}
        int a =(l1==null)? 0 : l1.val;
        int b=(l2==null)? 0 : l2.val;
        int c=a+b+retenue;
        ListNode l=(l1==null)? null : l1.next;
        ListNode m=(l2==null)? null : l2.next;
        if(c<10){
            ListNode retour = new ListNode(c);
            
            retour.next=addTwoNumbers(l,m,0);
            return retour;
        }else{
            ListNode retour = new ListNode(c%10);
            retour.next=addTwoNumbers(l,m,1);
            return retour;
        }
    }
}
