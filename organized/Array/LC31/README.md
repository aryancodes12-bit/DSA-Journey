# 31. Next Permutation

**Difficulty:** Medium  
**Topics:** Array, Two Pointers  
**Link:** https://leetcode.com/problems/next-permutation/

---

## Approach
The solution uses a two-pointer technique to find the first decreasing element from the right in the array, which is the pivot point for generating the next permutation. If no such element is found, the array is already the last permutation, so it is reversed to get the first permutation. The code then swaps the pivot element with the smallest element greater than it from the right and reverses the elements to the right of the pivot. This approach ensures that the next permutation is generated in lexicographically increasing order.

## Complexity
- Time: O(n) because in the worst-case scenario, the code needs to traverse the entire array to find the pivot element and then reverse the elements to the right of the pivot.
- Space: O(1) because the solution only uses a constant amount of space to store the indices and temporary swap values, regardless of the input size.

---
_Approach notes generated automatically by LeetWeave Scribe._