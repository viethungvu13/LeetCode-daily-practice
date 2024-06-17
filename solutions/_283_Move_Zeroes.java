public class _283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[curIndex++] = nums[i];
            }
        }
        for (int i = curIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
