🧠 Jump Game II – LeetCode Problem #45

📝 Problem Statement
    You are given a 0-indexed array of integers nums of length n.
    Each element nums[i] represents the maximum jump length from that position.
    Return the minimum number of jumps required to reach the last index.
    You can assume that you can always reach the last index.

🔢 Example
    Input: nums = [2,3,1,1,4]
    Output: 2
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

    Input: nums = [2,3,0,1,4]
    Output: 2
  
💡 Approach
    We can use a greedy BFS-like approach:
    Use variables to track:
    jumps → Number of jumps made.
    currentEnd → The farthest we can reach with the current jump.
    farthest → The farthest index we can reach overall.
    Traverse the array, updating farthest as max(farthest, i + nums[i]).    
    If we reach the end of the current jump (i == currentEnd),
    increment jumps and set currentEnd = farthest.
    Continue until reaching the last index.

✅ Code (Java)

class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
⏱️ Time & Space Complexity

    Time Complexity: O(n)
    We traverse the array once.

    Space Complexity: O(1)
    No extra space used; only variables for tracking jumps.
