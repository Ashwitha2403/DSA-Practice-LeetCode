🧠 Longest Substring Without Repeating Characters – LeetCode Problem #3
  
📝 Problem Statement
    Given a string s, find the length of the longest substring without repeating characters.

🔢 Example
    Input:
      s = "abcabcbb"
    Output:
      3
    Explanation:
      The answer is "abc", with the length of 3.

💡 Approach
    We use the sliding window technique with a HashSet to track characters in the current window.
    Start with two pointers (left and right) both at 0.
    Move the right pointer to scan characters.
    If a character is already in the set, remove characters from the left pointer until it's gone.
    Keep updating the max length as we expand the window.

✅ Code (Java)

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();
            int left = 0, right = 0, maxLength = 0;

            while (right < s.length()) {
                char ch = s.charAt(right);
                if (!set.contains(ch)) {
                    set.add(ch);
                    maxLength = Math.max(maxLength, right - left + 1);
                    right++;
                } else {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
          return maxLength;
        }
    }

⏱️ Time & Space Complexity
    Time Complexity: O(n)
    Each character is visited at most twice (once by right, once by left).

    Space Complexity: O(min(n, m))
    Where n is the length of the string and m is the size of the character set (typically 26 or 128/256).
