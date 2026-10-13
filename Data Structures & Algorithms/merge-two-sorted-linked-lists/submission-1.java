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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode retour =new ListNode();
        if(list1==null && list2==null){return null;}
        if(list1==null){
            retour.val=list2.val;
            merge(retour,list1,list2.next);
        }
        else if(list2==null){
            retour.val=list1.val;
            merge(retour,list1.next,list2);
        }else{
             if(list1.val<=list2.val){
                retour.val=list1.val;
                merge(retour,list1.next,list2);
            }else{
                retour.val=list2.val;
                merge(retour,list1,list2.next);
            }
        }
        return retour;
    }

    void merge(ListNode r, ListNode list1, ListNode list2){
        if(list1==null && list2==null){
            return;
        }
        if(list1==null){
            r.next=new ListNode(list2.val);
            merge(r.next,list1,list2.next);
        }
        else if(list2==null){
            r.next=new ListNode(list1.val);
            merge(r.next,list1.next,list2);
        }
        else{
            if(list1.val<=list2.val){
                r.next=new ListNode(list1.val);
                merge(r.next,list1.next,list2);
            }else{
                r.next=new ListNode(list2.val);
                merge(r.next,list1,list2.next);
            }
        }
    }
}