class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if(len(nums)==0):
            return 0
        elif len(nums)==1:
            return nums[0]
        slow = 1
        for i in range(1,len(nums)):
            if nums[i] != nums[i-1]:
                nums[slow] = nums[i]
                slow += 1
        return slow