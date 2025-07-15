🧠 Plus One – LeetCode Problem #66
  
📝 Problem Statement
    You are given a large integer represented as an integer array digits, where each digits[i] is the i-th digit of the integer.
    The digits are ordered from most significant to least significant (left to right).
    Increment the large integer by one and return the resulting array of digits.

🔢 Example
    Input: digits = [1, 2, 3]
    Output: [1, 2, 4]
    Explanation: 123 + 1 = 124

    Input: digits = [9, 9, 9]
    Output: [1, 0, 0, 0]
    Explanation: 999 + 1 = 1000

💡 Approach
    Start from the last digit and add 1.
    If the digit becomes 10, set it to 0 and carry the 1 to the next digit.
    Continue this process until there’s no carry, or we’ve processed all digits.
    If there’s still a carry after the most significant digit (e.g., all were 9s), add 1 to the front.

✅ Code (Java)
    class Solution {
      public int[] plusOne(int[] digits) {
          int n = digits.length;
          for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1; 
        return result;
      }
  }

⏱️ Time & Space Complexity
    Time Complexity: O(n)
    We may have to traverse all digits in the worst case (like [9,9,9]).

    Space Complexity: O(n)
    In the worst case, we create a new array with an extra digit.
