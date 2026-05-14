class Solution:
    def countBits(self, n):

        def convert(k):
            nom=k
            resul=""
            while nom!=0:
                resul+=str(int(nom%2))
                nom=int(nom//2) 
            return resul

        def compter(lis):
            comp=0
            for i in lis:
                if i=="1":
                    comp+=1
            return comp

        liste=[]
        if n>=0: liste.append(0)
        if n>=1:liste.append(1)
        for j in range(2,n+1):
            liste.append(compter(convert(j)))

        return liste       