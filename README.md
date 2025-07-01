# DSA-Practice-LeetCode
A collection of my solutions to LeetCode problems, focusing on Data Structures and Algorithms. Each solution is accompanied by explanations and insights.

**#TwoSum Problem**
The Two Sum problem is efficiently solved using a hash map to track indices of numbers as they are processed. The algorithm initializes an empty hash map and iterates through the array, calculating the complement for each number (i.e., target - nums[i]). It checks if the complement exists in the hash map; if found, it returns the indices of both numbers. If not, the current number and its index are stored in the hash map. The time complexity of this solution is O(n), as it traverses the array once, while the space complexity is also O(n) in the worst case

**#Remove Element**
The problem requires removing all instances of a given value val from an array nums, modifying the array in-place and returning the new length of the array after removal. The provided Java code solves this using a two-pointer approach. It initializes an index variable to 0, which tracks the position where the next valid (non-val) element should be placed. As it iterates through the array, for each element not equal to val, it copies that element to the current index and increments index. This way, all valid elements are moved to the front of the array. After the loop, index holds the count of elements that are not equal to val, which is returned as the result.
The time complexity of the solution is O(n), where n is the length of the array, since it iterates over each element once. 
The space complexity is O(1), as no additional data structures are used. Overall, it's an efficient and clean solution for in-place element removal in arrays.
