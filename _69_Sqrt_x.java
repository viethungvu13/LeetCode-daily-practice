public class _69_Sqrt_x {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        long y = (long)x / 2;
        for (int i = 1; i <= y + 1; i++) {
            long temp = (long)i * i;
            if (temp == x) {
                return i;
            } else if (temp > x) {
                return i - 1;
            }
        }
        return 0;
    }
}
