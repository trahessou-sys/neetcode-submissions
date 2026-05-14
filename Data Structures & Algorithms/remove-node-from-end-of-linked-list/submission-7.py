# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head, n):
        rat=[]
        cal=head
        while cal!=None and cal not in rat :
            rat.append(cal)
            cal=cal.next

        if len(rat)==1 and n==1:
            return None
        elif len(rat)==2 and n==1:
            rat[0].next=None
            return head
        elif n==1:
            rat[len(rat)-2].next=None
            return head
        
        elif n==len(rat):
            return head.next

        rat[len(rat)-n-1].next=rat[len(rat)-n+1]
        return head
        
        
        
        