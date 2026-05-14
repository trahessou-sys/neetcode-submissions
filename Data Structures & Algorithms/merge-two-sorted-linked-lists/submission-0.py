# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1, list2):
        
        def merge(l1,l2):
            if l1==None and l2==None:
                return None
            elif l1==None and l2!=None:
                return ListNode(l2.val,merge(l1,l2.next))
            elif l1!=None and l2==None:
                return ListNode(l1.val,merge(l1.next,l2))
            if l1.val<l2.val:
                return ListNode(l1.val,merge(l1.next,l2))
            else:
                return ListNode(l2.val,merge(l1,l2.next))
        
        return merge(list1,list2)

        
        