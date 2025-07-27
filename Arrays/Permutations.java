🧠 Permutations – LeetCode Problem #46
  
📝 Problem Statement
    Given an array nums of distinct integers, return all the possible permutations.
    You can return the answer in any order.

🔢 Example
    Input: nums = [1, 2, 3]
    Output:
      [
        [1,2,3],
        [1,3,2],
        [2,1,3],
        [2,3,1],
        [3,1,2],
        [3,2,1]
    ]
  
  💡 Approach
    We use backtracking to generate all permutations. At each recursive call:
    We fix one number at the current position,
    Swap it with every possible number that hasn’t been fixed yet,
    Then recurse to the next index.
    We backtrack (undo the swap) to explore other possibilities.

✅ Code (Java)
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(nums, 0, result);
            return result;
        }

        private void backtrack(int[] nums, int start, List<List<Integer>> result) {
            if (start == nums.length) {
                List<Integer> permutation = new ArrayList<>();
                for (int num : nums) {
                  permutation.add(num);
              }
              result.add(new ArrayList<>(permutation));
              return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, result);
            swap(nums, start, i); // backtrack
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
  }

⏱️ Time & Space Complexity
    Time Complexity: O(n × n!)
    There are n! permutations and each takes O(n) time to build.

    Space Complexity: O(n)
    Recursion stack uses space proportional to the depth (which is n).
    Output space is not counted in auxiliary space.
