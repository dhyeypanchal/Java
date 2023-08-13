public class pricewithdiscount {
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {   
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i]+" ");
        }
        return prices;
    }
    public static void main(String[] args) {
        int [] prices = { 8, 7, 4, 2, 8, 1, 7, 7, 10, 1};
        System.out.println(finalPrices(prices));
    }
}
