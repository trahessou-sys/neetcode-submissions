class Pair(object):
    def __init__(self, t, s):
        self.timestamp = t
        self.value = s


class TimeMap(object):

    def __init__(self):
        self.stock = {}

    def set(self, key, value, timestamp):
        """
        :type key: str
        :type value: str
        :type timestamp: int
        :rtype: None
        """
        temp = Pair(timestamp, value)
        if key in self.stock:
            actu = self.stock[key]
            actu.append(temp)
        else:
            actu = []
            actu.append(temp)
            self.stock[key] = actu

    def get(self, key, timestamp):
        """
        :type key: str
        :type timestamp: int
        :rtype: str
        """
        if key not in self.stock:
            return ""
        actu = self.stock[key]
        return self._search(actu, timestamp)

    def _search(self, actu, t):
        low = 0
        high = len(actu) - 1
        res = ""

        while low <= high:
            mid = low + (high - low) // 2
            par = actu[mid]

            if par.timestamp <= t:
                res = par.value
                low = mid + 1
            else:
                high = mid - 1
        return res