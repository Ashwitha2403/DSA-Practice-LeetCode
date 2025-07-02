# DSA-Practice-LeetCode
A collection of my solutions to LeetCode problems, focusing on Data Structures and Algorithms. Each solution is accompanied by explanations and insights.

**#TwoSum Problem**
The Two Sum problem is efficiently solved using a hash map to track indices of numbers as they are processed. The algorithm initializes an empty hash map and iterates through the array, calculating the complement for each number (i.e., target - nums[i]). It checks if the complement exists in the hash map; if found, it returns the indices of both numbers. If not, the current number and its index are stored in the hash map. The time complexity of this solution is O(n), as it traverses the array once, while the space complexity is also O(n) in the worst case

**#Remove Element**
The problem is remove all instances of a given value val from the array nums,Modify the array in-place & return the new length of the array after removal.
Approach (Two-pointer method):Initialize a variable index = 0 to track the position of the next valid (non-val) element.
Loop through each element of the array:
If the current element is not equal to val:
    Assign it to nums[index].
Increment index by 1 & After the loop ends, index holds:
The count of valid elements (i.e., elements ≠ val) then new length of the modified array.
Example:
For nums = [3, 2, 2, 3] and val = 3:
Modified array becomes [2, 2, _, _]
Return value: 2 (new length)
The time complexity - o(n) & space complexity - o(1)..
