public class _485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 1;
        if (n <= 1 && nums[0] == 0) return 0;
        if (n <= 1 && nums[0] == 1) return 1;
        for (int i = 0; i < (n - 1); i++) {
            if (nums[i] == nums[i + 1] && nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            }
            if (nums[i] != nums[i + 1]) {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }
}
