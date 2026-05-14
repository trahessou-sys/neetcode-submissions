# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head):
        vu=[]
        
        def Verif(liste):
            if liste==None:
                return False
            
            if liste in vu:
                return True

            vu.append(liste)
            
            
            return Verif(liste.next)
        
        return Verif(head)
            
            
        