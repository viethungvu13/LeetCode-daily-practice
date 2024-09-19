import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3Sum {
    private static int check_duplicate_left(int[] nums, int x) {
        int x_new = x+1;
        if (x_new < nums.length) {
            while(x_new < nums.length-1 && nums[x_new] == nums[x]) {
                x_new++;
            }
        }
        return x_new;
    }

    private static int check_duplicate_right(int[] nums, int x) {
        int x_new = x-1;
        if (x_new > -1) {
            while(x_new > 0 && nums[x_new] == nums[x]) {
                x_new--;
            }
        }
        return x_new;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        Arrays.sort(nums);
        int nums_length = nums.length;
        int pointer_1 = 0;
        while(pointer_1 < nums_length-2) {
            if (pointer_1 > 0 && nums[pointer_1] == nums[pointer_1 - 1]) {
                pointer_1++;
                continue;
            }
            int left = pointer_1 + 1;
            int right = nums_length-1;
            int target = (-1)*nums[pointer_1];
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[pointer_1]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    myList.add(subList);
                    left = check_duplicate_left(nums, left);
                    right = check_duplicate_right(nums, right);
                } else if (nums[left] + nums[right] < target) {
                    left = check_duplicate_left(nums, left);
                } else {
                    right = check_duplicate_right(nums, right);
                }
            }
            pointer_1++;
        }
        return myList;
    }
}
