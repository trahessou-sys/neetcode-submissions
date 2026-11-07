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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){return;}
        ListNode cot =separer(head);
        cot=reverse(cot);
        head=fusion(head,cot);
    }

    private ListNode separer(ListNode head){
        if(head==null || head.next==null){return head;}
        ListNode slow =head;
        ListNode fast=head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast.next!=null){
                fast=fast.next;
            }
        }
        ListNode temp=slow.next;
        slow.next=null;
        return temp;
    }

    private ListNode reverse(ListNode head){
        if(head==null || head.next==null){return head;}
        ListNode temp=head;
        ListNode depla=head.next;
        ListNode d=head.next;
        temp.next=null;
        while(d.next!=null){
            d=d.next;
            depla.next=temp;
            temp=depla;
            depla=d;
        }
        depla.next=temp;
        temp=depla;
        depla=d;
        return depla;
    }

    private ListNode fusion(ListNode l, ListNode t){
        ListNode d1=l;
        ListNode d2=t;
        ListNode r =l;

        while(d1!=null && d2!=null){
            d1=d1.next;
            r.next=d2;
            d2=d2.next;
            r=r.next;

            r.next=d1;
            r=r.next;
        }
        return l;
    }
}
