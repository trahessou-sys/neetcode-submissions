# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
def verif(lis):
    l=0
    while l<len(lis):
        if lis[l]!=None: return False
        l+=1
    return True

class Solution:    
    def mergeKLists(self, lists):
        def merge(liste):
            if verif(liste): return None
            k=len(liste)
            comp=0
            while liste[comp]==None:
                comp+=1
            mini=liste[comp].val
            mini_indx=comp
            for i in range(k):
                if liste[i]!=None:
                    if liste[i].val<mini:
                        mini=liste[i].val
                        mini_indx=i
            liste[mini_indx]=liste[mini_indx].next
            return ListNode(mini,merge(liste))
        return merge(lists)
        
        
        