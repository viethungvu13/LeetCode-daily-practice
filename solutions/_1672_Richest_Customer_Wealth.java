public class _1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += account[j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
