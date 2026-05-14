# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next





class Solution:
    def reverseList(self, head):
        rat=[]
        
        
        def nexo(hj):
            if hj==None:
                return
            elif hj.next==None:
                rat.append(hj.val)
                return hj.val
            b=nexo(hj.next)
            
            rat.append(hj.val)
            
        nexo(head)

        if len(rat)==0: return None
        for i in range(len(rat)-1,-1,-1):
            if i==len(rat)-1:
                cat=ListNode(rat[i],None)
            else:
                cat=ListNode(rat[i],cat)
        return cat
        
        

        
        
        
        