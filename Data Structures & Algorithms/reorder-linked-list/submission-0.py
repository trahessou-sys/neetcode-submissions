# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head):
        rat=[]
        cal=head
        while cal!=None :
            rat.append(cal)
            cal=cal.next
        b=len(rat)
        n=b//2
        if b%2!=0:
            for k in range(1,b-n):
                if n+k<b: rat[n+k].next=rat[n-k+1]
                if n-k>-1: rat[n-k].next=rat[n+k]
            rat[n].next=None
        else:
            for k in range(1,b-n+1):
                if n-k>-1: rat[n-k].next=rat[n+k-1]
                if n+k<b: rat[n+k].next=rat[n-k]
            rat[n].next=None
        
            

        
        
        
