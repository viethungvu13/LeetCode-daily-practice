import java.util.Arrays;

public class _16_3Sum_Closest {
    private int change_left(int[] nums, int left) {
        left++;
        if (left < nums.length) {
            while (nums[left] == nums[left-1] && left < nums.length-1) {
                left++;
            }
        }
        return left;
    }

    private int change_right(int[] nums, int right) {
        right--;
        if (right >= 0) {
            while (nums[right] == nums[right+1] && right > 0) {
                right--;
            }
        }
        return right;
    }

    private int sum(int[] nums) {
        int sum_nums = 0;
        for (int i = 0; i < nums.length; i++) {
            sum_nums += nums[i];
        }
        return sum_nums;
    }

    public int threeSumClosest(int[] nums, int target) {
        int nums_length = nums.length;
        if (nums_length == 3) {
            return sum(nums);
        }
        Arrays.sort(nums);
        int pointer_1 = 0;
        int tmp_size = Integer.MAX_VALUE;
        int res = 0;
        while (pointer_1 < (nums_length-2)) {
            if (pointer_1 != 0 && nums[pointer_1] == nums[pointer_1-1]) {
                pointer_1++;
                continue;
            }
            int left = pointer_1 + 1;
            int right = nums_length - 1;
            while (left < right) {
                int sum_3 = nums[pointer_1] + nums[left] + nums[right];
                int size = Math.abs(sum_3 - target);
                if (size == 0) {
                    return sum_3;
                } else if (size < tmp_size) {
                    tmp_size = size;
                    res = sum_3;
                }
                if (sum_3 < target) {
                    left = change_left(nums, left);
                } else {
                    right = change_right(nums, right);
                }
            }
            pointer_1++;
        }
        return res;
    }
}
