# 2149. Rearrange Array Elements by Sign

**Difficulty:** Medium  
**Topics:** Array, Two Pointers, Simulation  
**Link:** https://leetcode.com/problems/rearrange-array-elements-by-sign/

---

## Approach
The solution utilizes two pointers, `posIndex` and `negIndex`, to track the positions where the next positive and negative numbers should be placed in the resulting array. It iterates through the input array, placing positive numbers at even indices and negative numbers at odd indices. This approach ensures that the resulting array alternates between positive and negative numbers.

## Complexity
- Time: O(n) because the solution processes each element in the input array exactly once.
- Space: O(n) because it creates a new array of the same size as the input array to store the rearranged elements.

---
_Approach notes generated automatically by LeetWeave Scribe._