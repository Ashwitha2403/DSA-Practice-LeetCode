🧠 Two Sum – LeetCode Problem #1
  
📝 Problem Statement
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  We may assume that each input would have exactly one solution, and you may not use the same element twice.
  Return the answer in any order.

🔢 Example
  Input: nums = [2, 7, 11, 15], target = 9  
  Output: [0, 1]  
  Explanation: nums[0] + nums[1] == 9, so we return [0, 1].

💡 Approach
  We use a HashMap to store the value and its index while iterating through the array. For each element, we calculate its complement by subtracting it from the target. If the complement already exists in the HashMap, we return the index of the current element and its complement.

✅ Code (Java)
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[] {}; // In case there's no solution
    }
}

⏱️ Time & Space Complexity
    Time Complexity: O(n)
      We traverse the array only once.

    Space Complexity: O(n)
      We store at most n elements in the HashMap.
