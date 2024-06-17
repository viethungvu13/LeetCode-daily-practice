public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int x = Integer.MAX_VALUE;
        int z = 0;

        for (int price : prices) {
            if (price < x) {
                x = price;
            }
            int y = price - x;
            if (y > z) {
                z = y;
            }
        }

        return z;
    }
}
