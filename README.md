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

**#Merge Sorted Array**
There are given two sorted integer arrays nums1 and nums2, and two integers m and n, representing the number of elements in nums1 and nums2, respectively.Merge nums2 into nums1 as one sorted array in non-decreasing order.
The final sorted array should be stored inside nums1.To accommodate this, nums1 has a length of m + n, with the last n elements set to 0 and should be ignored initially.
Input:
nums1 = [1,2,3,0,0,0], m = 3  
nums2 = [2,5,6], n = 3
Output:
[1,2,2,3,5,6]
Time and Space Complexity:
Time: O(m + n) – Every element is visited once.
Space: O(1) – In-place merging, no extra space used.

**#Combinational Sum**
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.You may return the combinations in any order. The same number from candidates may be chosen unlimited number of times. Two combinations are considered unique if they contain a different set of elements or the same elements in different quantities.
This problem approach is typically solved using backtracking:
*Start with an empty combination.
*Explore each candidate recursively while subtracting it from the target.
*If the target becomes 0, you've found a valid combination.
*If the target becomes negative, backtrack.
Input: candidates = [2,3,6,7], target = 7  
Output: [[2,2,3],[7]]
Explanation: 2 + 2 + 3 = 7, 7 = 7
Time Complexity:O(n^2)
Space Complexity:O(n)

