public class _268_Missing_Number {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int size = nums.length;
        for (int num : nums) {
            sum1 += num;
        }
        for (int i = 0; i <= size; i++) {
            sum2 += i;
        }
        return sum2 - sum1;
    }
}
