🧠 Merge Sorted Array – LeetCode Problem #88
  
📝 Problem Statement
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    Merge nums2 into nums1 as one sorted array.
    we must do this in-place with O(1) extra memory.

🔢 Example
    Input:
      nums1 = [1,2,3,0,0,0], m = 3
      nums2 = [2,5,6], n = 3

    Output:
      [1,2,2,3,5,6]

    Explanation:
      The arrays we are merging are [1,2,3] and [2,5,6].
      The result of the merge is [1,2,2,3,5,6], stored in nums1.

💡 Approach
    We merge from the end of the arrays, starting from the last index of nums1.
    We compare the elements from nums1 and nums2 and place the largest one at the end of nums1, moving backwards.

✅ Code (Java)
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1; // last element in nums1 (valid part)
            int j = n - 1; // last element in nums2
            int k = m + n - 1; // last index of nums1 (total)

            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
          }
        // If nums2 is not fully copied
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
  }

⏱️ Time & Space Complexity
    Time Complexity: O(m + n)
    We iterate through both arrays once.

    Space Complexity: O(1)
    We use constant extra space and modify nums1 in-place.
