package greedy;

public class StockPrice2 {

    public int maxProfit(int[] prices) {
        int result = 0;
        int currentMin = prices[0];
        int maxProfitSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                currentMin = prices[i];
                result += maxProfitSoFar;
                maxProfitSoFar = 0;
            } else {
                int currentProfit = prices[i] - currentMin;
                if (currentProfit > maxProfitSoFar) {
                    maxProfitSoFar = currentProfit;
                }
            }
            if (i == prices.length - 1) {
                result += maxProfitSoFar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StockPrice2 price2 = new StockPrice2();
        int[] stock1 = {7, 1, 5, 3, 6, 4};
        int[] stock2 = {1, 2, 3, 4, 5};
        int[] stock3 = {7, 6, 4, 3, 1};
        System.out.println(price2.maxProfit(stock1));
        System.out.println(price2.maxProfit(stock2));
        System.out.println(price2.maxProfit(stock3));
    }
}
