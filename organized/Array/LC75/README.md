# 75. Sort Colors

**Difficulty:** Medium  
**Topics:** Array, Two Pointers, Sorting  
**Link:** https://leetcode.com/problems/sort-colors/

---

## Approach
This solution utilizes a counting technique to sort the colors in the array. It first counts the occurrences of each color (0, 1, and 2) in the array, then iterates over the array again to place the colors in their correct positions based on the counts. This approach is efficient because it only requires two passes over the array.

## Complexity
- Time: O(n) because the solution involves two separate passes over the array of length n.
- Space: O(1) because the space used does not grow with the size of the input array, only a constant amount of space is used to store the counts.

---
_Approach notes generated automatically by LeetWeave Scribe._