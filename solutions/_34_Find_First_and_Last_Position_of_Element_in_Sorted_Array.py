class Solution:
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        if target not in nums or len(nums) == 0:
            return [-1, -1]
        
        left = 0
        right = len(nums) - 1
        start = self.binarySearchFirst(nums, target, left, right)
        end = self.binarySearchEnd(nums, target, left, right)
        return [start, end]
    
    def binarySearchFirst(self, nums: list[int], target, left, right):
        if left > right:
            return
        
        res = 0
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] >= target:
                res = mid
                right = mid - 1
            else:
                left = mid + 1
        return res

    def binarySearchEnd(self, nums: list[int], target, left, right):
        if left > right:
            return
        
        res = 0
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] <= target:
                res = mid
                left = mid + 1
            else:
                right = mid - 1
        return res