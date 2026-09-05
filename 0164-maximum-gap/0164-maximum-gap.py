class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        nums = sorted(nums)
        max = 0
        for i in range(len(nums)-1):
            output = nums[i+1] - nums[i]
            if output > max:
                max = output
        return max
        