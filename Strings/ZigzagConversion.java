🧠 Zigzag Conversion – LeetCode Problem #6

📝 Problem Statement
    Given a string s and an integer numRows, arrange the string in a zigzag pattern on a given number of rows.
    Then, read the pattern row by row to create the final string.
    The pattern works like this:

🔢 Example
    Input:
      s = "PAYPALISHIRING", numRows = 4
      Zigzag pattern:

      P     I    N
      A   L S  I G
      Y A   H R
      P     I
    Output:
      "PINALSIGYAHRPI"
        
💡 Approach
      If numRows is 1 or the string is very short, return s as is.
      Create an array of StringBuilder for each row.
      Traverse the string while simulating the zigzag:
      Move downward until the last row, then upward until the first row.  
      Append each character to the corresponding row.
      Combine all rows to form the final string.

✅ Code (Java)

    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1 || s.length() <= numRows) return s;

            StringBuilder[] rows = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

            int currentRow = 0;
            boolean goingDown = false;

            for (char c : s.toCharArray()) {
                rows[currentRow].append(c);
                if (currentRow == 0 || currentRow == numRows - 1) goingDown = !goingDown;
                currentRow += goingDown ? 1 : -1;
            }

            StringBuilder result = new StringBuilder();
            for (StringBuilder row : rows) result.append(row);
            return result.toString();
        }
    }
⏱️ Time & Space Complexity

    Time Complexity: O(n) – We traverse the string once.
    Space Complexity: O(n) – We store characters in StringBuilder arrays.

