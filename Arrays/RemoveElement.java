🧠 Remove Element – LeetCode Problem #27

🧾 Problem Statement
    Given an integer array nums and an integer val, remove all occurrences of val in-place and return the new length of the array.
    You must do this by modifying the input array in-place with O(1) extra memory. The order of elements can be changed. It doesn't matter what values are left beyond the returned length.

🔍 Example
    Input: nums = [3,2,2,3], val = 3  
    Output: 2, nums = [2,2,_,_]

    Input: nums = [0,1,2,2,3,0,4,2], val = 2  
    Output: 5, nums = [0,1,3,0,4,_,_,_]

💡 Approach
    We iterate through the array, and each time we find an element not equal to val, we copy it to the front (maintained by an index k). At the end, k will be the length of the new array without val.
  
 🧑‍💻 Code (Java)
    class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

⏱ Time Complexity
    O(n) – We iterate through the array once.

💾 Space Complexity
    O(1) – No extra space is used; modification is done in-place.
