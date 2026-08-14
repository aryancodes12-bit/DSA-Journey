# 53. Maximum Subarray

**Difficulty:** Medium  
**Topics:** Array, Divide and Conquer, Dynamic Programming  
**Link:** https://leetcode.com/problems/maximum-subarray/

---

## Approach
This solution uses Kadane's algorithm, a dynamic programming approach to find the maximum sum of a subarray within the given array. It iterates through the array, maintaining a running sum and updating the maximum sum whenever it finds a larger sum. If the running sum becomes negative, it resets the sum to 0, effectively starting a new subarray from the next element. This approach allows it to efficiently find the maximum subarray sum in a single pass.

## Complexity
- Time: O(n) with a single pass through the input array of length n.
- Space: O(1) as it only uses a constant amount of space to store the maximum sum and the running sum.

---
_Approach notes generated automatically by LeetWeave Scribe._