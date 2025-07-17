🧠 Single Number – LeetCode Problem #136

📝 Problem Statement
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.

🔢 Example
    Input: nums = [4, 1, 2, 1, 2]
    Output: 4
    Explanation: Every element appears twice except for 4, which appears once.

💡 Approach
    We use the bitwise XOR operation:
    XOR of a number with itself is 0 (a ^ a = 0)
    XOR of a number with 0 is the number itself (a ^ 0 = a)
    XOR is commutative and associative, so order doesn't matter.
    By XOR-ing all numbers in the array, the duplicate numbers cancel each other out, and the result is the unique number.

✅ Code (Java)

    class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
        
            for (int num : nums) {
                result ^= num; // XOR operation
          }
        
          return result;
        }
    }

⏱️ Time & Space Complexity

    Time Complexity: O(n)
    We traverse the array once.

    Space Complexity: O(1)
    No additional space is used apart from a few variables.
