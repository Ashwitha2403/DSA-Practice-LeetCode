🧠 Integer to Roman – LeetCode Problem #12
  
📝 Problem Statement
    Given an integer, convert it to a Roman numeral.
    Roman numerals are represented by seven different symbols:
    | Symbol | Value |
    | ------ | ----- |
    | I      | 1     |
    | V      | 5     |
    | X      | 10    |
    | L      | 50    |
    | C      | 100   |
    | D      | 500   |
    | M      | 1000  |  
    Roman numerals are usually written largest to smallest from left to right, except for these cases:
    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

🔢 Example
    Input:
      num = 1994
    Output:
      "MCMXCIV"
    Explanation:
    1000 → M 
    900 → CM
    90 → XC
    4 → IV

💡 Approach
  
    We use greedy conversion by:
    Defining Roman numeral values and their corresponding integers in descending order.
    Iterating through the values:
    Append the symbol while the number is greater than or equal to its value.
    Subtract the value from the number.
    Continue until the number becomes 0.

✅ Code (Java)

    class Solution {
        public String intToRoman(int num) {
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
            StringBuilder sb = new StringBuilder();
        
            for (int i = 0; i < values.length && num > 0; i++) {
                while (num >= values[i]) {
                    num -= values[i];
                    sb.append(symbols[i]);
                }
            }
        
          return sb.toString();
      }
  }    
⏱️ Time & Space Complexity
  
    Time Complexity: O(1)
    The loop runs at most 13× for each symbol.

    Space Complexity: O(1)
    Output string length is bounded by a small constant.
