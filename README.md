# DSA-Practice-LeetCode
A collection of my solutions to LeetCode problems, focusing on Data Structures and Algorithms. Each solution is accompanied by explanations and insights.

**#TwoSum Problem**
The Two Sum problem is efficiently solved using a hash map to track indices of numbers as they are processed. The algorithm initializes an empty hash map and iterates through the array, calculating the complement for each number (i.e., target - nums[i]). It checks if the complement exists in the hash map; if found, it returns the indices of both numbers. If not, the current number and its index are stored in the hash map. The time complexity of this solution is O(n), as it traverses the array once, while the space complexity is also O(n) in the worst case
