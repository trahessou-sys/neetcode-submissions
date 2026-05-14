class Solution:
    def countBits(self, n):

        def convert(k):
            nom=k
            resul=0
            while nom!=0:
                if int(nom%2)==1:
                    resul+=1
                nom=int(nom//2) 
            return resul


        liste=[]
        if n>=0: liste.append(0)
        if n>=1:liste.append(1)
        for j in range(2,n+1):
            liste.append(convert(j))

        return liste       