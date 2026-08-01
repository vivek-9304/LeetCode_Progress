class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        res = []
        for i in range(0, len(nums)):
            for j in range(0, i):
                if nums[i]+nums[j]==target:
                    res.append(i)
                    res.append(j)
                    return res
        res = [-1, -1]
        return res

        