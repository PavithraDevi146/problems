class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        rev=0
        org = x
        if x<0:
            return False
        
        while x!=0:
            d=x%10
            rev=rev*10+d
            x//=10
        
        return rev==org

