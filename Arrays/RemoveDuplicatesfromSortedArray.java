🧠 Remove Duplicates from Sorted Array – LeetCode Problem #26

📝 Problem Statement
      Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
      The relative order of the elements should be kept the same.Return the number of unique elements in nums.

      Note: The first k elements of nums should contain the final result. You don’t need to consider the rest of the array.

🔢 Example
      Input: nums = [1, 1, 2]
      Output: 2
      Explanation: The array is modified to [1, 2, _]. Return value 2 indicates the count of unique elements.

      Input: nums = [0,0,1,1,1,2,2,3,3,4]
      Output: 5
      Explanation: The array is modified to [0,1,2,3,4,_..._].

💡 Approach
      We use two pointers:
        i keeps track of the position of the last unique element.
        j traverses the array.
      When nums[j] is different from nums[i], we increment i and copy nums[j] to nums[i].
      This effectively overwrites duplicates and keeps only unique elements in the beginning of the array.

✅ Code (Java)

      class Solution {
        public int removeDuplicates(int[] nums) {
          if (nums.length == 0) return 0;

            int index = 1;
            for (int i = 1; i < nums.length; i++) {
              if (nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
      }
  }

⏱️ Time & Space Complexity

      Time Complexity: O(n)
      We traverse the array only once.

      Space Complexity: O(1)
      No extra space is used; modification is done in-place.
