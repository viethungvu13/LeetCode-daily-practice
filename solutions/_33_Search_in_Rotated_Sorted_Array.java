public class _33_Search_in_Rotated_Sorted_Array {
    private int check_nums(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int i_check = (left + right) / 2;
            if (i_check > 0) {
                if (nums[i_check] < nums[i_check-1]) return i_check;
            }
            if (i_check < nums.length) {
                if (nums[i_check] > nums[i_check+1]) return i_check+1;
            }
            if (nums[i_check] > nums[0]) {
                left = i_check+1;
            } else {
                right = i_check;
            }
        }
        return left;
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return binarySearch(nums, target, left, mid - 1);
        return binarySearch(nums, target, mid + 1, right);
    }

    public int search(int[] nums, int target) {
        int check = check_nums(nums);
        int findLeft = -1;
        if (check > 0) {
            findLeft = binarySearch(nums, target, 0, check-1);
        }
        int findRight = binarySearch(nums, target, check, nums.length-1);
        if (findLeft == -1 && findRight == -1) return -1;
        else if (findLeft == -1) return findRight;
        return findLeft;
    }
}
