def verif(az,bz):
    vus=[]
    dico3={}
    for iu in az:
        if not iu in vus:
            vus.append(iu)
            dico3[iu]=1
        else:
            dico3[iu]+=1
    
    for k in bz.keys():
        if not k in vus:
            return False
        elif bz[k]>dico3[k]:
            return False

    return True


class Solution:
    def minWindow(self, s, t):

        dico={}
        vu=[]
        for i in t:
            if not i in vu :
                dico[i]=1
                vu.append(i)
            else:
                dico[i]+=1
            
        Substring=""
        b=len(s)
        for i in range(b):
            mapo=s[i]
            j=i+1
            while j<b and not verif(mapo,dico):
                mapo+=s[j]
                j+=1
            
            if verif(mapo,dico):
                if Substring=="":
                    Substring=mapo
                elif len(mapo)<len(Substring):
                    Substring=mapo
        return Substring


        