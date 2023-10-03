public class MaxProfit {
    public int maxProfit(int[] prices) {
        // Initialize minPrice to Integer.MAX_VALUE to ensure that any price in the array will be smaller than the initial minimum price.
        int minPrice = Integer.MAX_VALUE;
        //Initialize maxProfit to 0 because there's no profit yet.
        int maxProfit = 0;

        //Iterate through the prices array using a for loop.
        for (int i = 0; i < prices.length; i++) {
            //For each price, update minPrice to the minimum of its current value and the current price. This keeps track of the lowest price seen so far.
            minPrice = Math.min(minPrice, prices[i]);

            //Calculate the potential profit if you were to sell at the current price (prices[i] - minPrice).
            int potentialProfit = prices[i] - minPrice;

            // Update the maximum profit if the potential profit is greater.
            maxProfit = Math.max(maxProfit, potentialProfit);

        }
        return maxProfit;


    }

    public static void main(String[] args) {
        int[] prices={3,4,66,445,666,3221345,654635,324243243,424};
        MaxProfit maxProfit=new MaxProfit();
        int profit = maxProfit.maxProfit(prices);
        System.out.println("MaxProfit: "+profit);
    }
}


