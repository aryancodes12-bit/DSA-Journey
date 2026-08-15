# 121. Best Time to Buy and Sell Stock

**Difficulty:** Easy  
**Topics:** Array, Dynamic Programming  
**Link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

---

## Approach
This solution uses a dynamic approach to track the minimum price encountered so far and the maximum profit that can be achieved. It iterates through the array of prices, updating the minimum price whenever a lower price is found, and calculates the potential profit at each step. The maximum profit is updated whenever a higher profit is found. This approach allows for a single pass through the data, making it efficient.

## Complexity
- Time: O(n) because the solution involves a single loop that iterates over the array of prices.
- Space: O(1) because the solution only uses a constant amount of space to store the minimum price and the maximum profit.

---
_Approach notes generated automatically by LeetWeave Scribe._