class Solution:
    def maxArea(self, heights):
        maxA=0
        b=len(heights)
        for i in range(b):

            for j in range(b):
                mi=min(i,j)
                ma=max(i,j)
                mah=min(heights[i],heights[j])
                Area=(ma-mi)*mah
                if Area>maxA: maxA=Area
        return maxA
        