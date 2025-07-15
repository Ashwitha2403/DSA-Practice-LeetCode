🧠 Search Insert Position – LeetCode Problem #35

📝 Problem Statement
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.

🔢 Example
    Input: nums = [1,3,5,6], target = 5  
    Output: 2

    Input: nums = [1,3,5,6], target = 2  
    Output: 1

    Input: nums = [1,3,5,6], target = 7  
    Output: 4
  
💡 Approach
    This is a classic Binary Search problem due to the sorted array and the required O(log n) time complexity.
    We use binary search to:
      return the index if the target is found,
      or return the position where it should be inserted if not found.

✅ Code (Java)
  class Solution {
      public int searchInsert(int[] nums, int target) {
           for (int i = 0; i < nums.length; i++) {
              if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
      }
  }

⏱️ Time & Space Complexity
    Time Complexity: O(log n) – Binary search
    Space Complexity: O(1) – Constant space
