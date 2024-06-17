public class _326_Power_of_Three {
    public boolean isPowerOfThree(int n) {
        for (int i = 0; i <= 9999; i++) {
            if (Math.pow(3, i) == n) {
                return true;
            }

            if (Math.pow(3, i) > n) {
                return false;
            }
        }
        return false;
    }
}
