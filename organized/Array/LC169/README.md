# 169. Majority Element

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Divide and Conquer, Sorting, Counting  
**Link:** https://leetcode.com/problems/majority-element/

---

## Approach
This solution utilizes a hash map to store the frequency of each element in the input array. It iterates over the array, incrementing the count for each element in the map. Then, it iterates over the map entries to find the element with a count greater than half the length of the input array. This approach ensures that the majority element is found, if it exists.

## Complexity
- Time: O(n) with a single pass over the input array and another pass over the map entries, where n is the number of elements in the input array.
- Space: O(n) because in the worst-case scenario, all elements in the input array are unique and stored in the hash map.

---
_Approach notes generated automatically by LeetWeave Scribe._