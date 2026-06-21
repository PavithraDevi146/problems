class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=sorted(nums)
        n=len(nums)
        return s[n/2]

        