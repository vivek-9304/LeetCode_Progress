class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        result = nums1+nums2
        result = sorted(result)
        n = len(result)
        if n%2==0:
            x = result[int(n/2)-1]+result[int(n/2)]
            return x/2
        else:
            return result[int(n/2)]
        return 0.0
        