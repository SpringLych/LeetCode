package easy;

/**
 * @author LiYingChun
 * @date 2018/11/4
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one
 * share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class P121_BestTimeToBuyAndSellStock {
    /*
    遍历到第i个元素，记录当前元素以前的最小值和最大利润，最后返回最大利润
    时间复杂度O(n)
    空间复杂度O（1）
     */
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int buy = Integer.MAX_VALUE, pro = 0;
        for (int price : prices) {
            if (price < buy) buy = price;
            else {
                pro = Math.max(pro, price - buy);
            }
        }
        return pro;
    }
}
