
public class BuyAndSellStock {

    public static int BuyAndSellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) // Profit;
            {
                int Profit = price[i] - buyPrice; // Formula to calculate profit;
                maxProfit = Math.max(Profit, maxProfit);// Find max profit overall days
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int array[] = {7,9,12,6,5,8};
        System.out.println("Max Profit is:" + BuyAndSellStock(array));
    }
}
