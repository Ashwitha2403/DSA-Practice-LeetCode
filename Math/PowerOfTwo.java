🧠 Power of Two – LeetCode Problem #231

📝 Problem Statement
      Given an integer n, return true if it is a power of two.
      An integer n is a power of two if there exists an integer x such that:  
        n == 2^x

🔢 Example
      Input:
        n = 16
      Output:
        true
      Explanation:
        2^4 = 16

      Input:
        n = 3
      Output:
        false

💡 Approach
      A number is a power of two if only one bit is set in its binary representation.
      Steps:
        A number n is a power of two if:
          n > 0
          n & (n - 1) == 0 (this clears the lowest set bit)
          Return true if both conditions are satisfied.

✅ Code (Java)

      class Solution {
          public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
              while (n % 2 == 0) {
              n /= 2;
        }
            return n == 1;
        }
    }



⏱️ Time & Space Complexity
      Time Complexity: O(1)
        Only a single bitwise operation is performed.
      Space Complexity: O(1)
        No extra memory is used.
