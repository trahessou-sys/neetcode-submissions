class Solution:
    def maxProfit(self, prices):
        maxP=0
        b=len(prices)
        for i in range(b):
            for j in range(i+1,b):
                prof=prices[j]-prices[i]
                if prof>maxP: maxP=prof
        return maxP
        