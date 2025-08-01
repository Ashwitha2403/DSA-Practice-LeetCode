🧠 Valid Parentheses – LeetCode Problem #20

📝 Problem Statement
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    A string is valid if:
      Open brackets must be closed by the same type of brackets.
      Open brackets must be closed in the correct order.
      Every close bracket has a corresponding open bracket of the same type.

🔢 Example 1
    Input: s = "()[]{}"
    Output: true
  
🔢 Example 2
    Input: s = "(]"
    Output: false
  
🔢 Example 3
    Input: s = "({[]})"
    Output: true
  
💡 Approach
    Use a stack to keep track of opening brackets.
    Traverse each character in the string:
    Push opening brackets onto the stack.
    When a closing bracket is encountered, check the top of the stack:
    If the stack is empty or the top does not match the corresponding opening bracket → return false.
    After processing all characters, the stack should be empty for the string to be valid.
  
✅ Code (Java)

    import java.util.Stack;
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
      
            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) return false;
                  
                    char top = stack.pop();
                    if ( (ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }
        
            return stack.isEmpty();
        }
    }

⏱️ Time & Space Complexity
Time Complexity: O(n) – We traverse the string once.
Space Complexity: O(n) – Stack can store at most n/2 opening brackets.

