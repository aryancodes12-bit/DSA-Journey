# 169. Majority Element

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Divide and Conquer, Sorting, Counting  
**Link:** https://leetcode.com/problems/majority-element/

---

## Approach
The solution utilizes the Boyer-Moore Voting Algorithm, which works by essentially maintaining a counter for the majority element. If the counter is zero, the algorithm sets the current element as the majority element and increments the counter. It then increments the counter when it encounters the same element again and decrements it when it encounters a different element. This approach ensures that the majority element is the one that is left at the end of the first pass.

## Complexity
- Time: O(n) with two linear passes through the input array to find and verify the majority element.
- Space: O(1) with a constant amount of space used to store the majority element and its count.

---
_Approach notes generated automatically by LeetWeave Scribe._