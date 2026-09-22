class Solution {
    public int maxProfit(int[] prices) {
        int minCost = prices[0];

        int maxP = Integer.MIN_VALUE;

        for(int i = 0 ; i < prices.length ; i++)
        {
            if(prices[i] < minCost)
            {
                minCost = prices[i];
            
            }

            else
            {
                maxP = Math.max(maxP , prices[i] - minCost);
            }
        }
        return maxP;
    }
}
