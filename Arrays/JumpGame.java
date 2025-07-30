🧠 Jump Game – LeetCode Problem #55

📝 Problem Statement  
  You are given an integer array `nums` where each element represents your maximum jump length at that position.  
  Return **true** if you can reach the last index, or **false** otherwise.

🔢 Example  
  Input: nums = [2, 3, 1, 1, 4]  
  Output: true  
  Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.  

  Input: nums = [3, 2, 1, 0, 4]  
  Output: false  
  Explanation: You will always get stuck at index 3 because `nums[3] = 0`.  

💡 Approach  
  - Use a **greedy approach** to track the **farthest index** you can reach.  
  - Iterate through the array:  
    1. If the current index is beyond the farthest reachable index, return **false**.  
    2. Update the farthest reachable index as `max(farthest, i + nums[i])`.  
  - If we reach the last index, return **true**.

✅ Code (Java)
```java
class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) return false; // Can't reach this index
            
            farthest = Math.max(farthest, i + nums[i]);
        }
        
        return true;
    }
}
⏱️ Time & Space Complexity

    Time Complexity: O(n)
    We iterate through the array once.

    Space Complexity: O(1)
    We only use a few extra variables.
