🧠 Combination Sum – LeetCode Problem #39

📝 Problem Statement
    Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
    You may return the combinations in any order.The same number may be chosen from candidates an unlimited number of times.
    Two combinations are unique if the frequency of at least one of the chosen numbers is different.

🔢 Example
    Input: candidates = [2, 3, 6, 7], target = 7
    Output: [[2, 2, 3], [7]]
    Explanation:
      2 + 2 + 3 = 7
      7 = 7
    Both are valid combinations.

💡 Approach
    We use backtracking to explore all possible combinations that sum up to the target. At each step, we can either include a candidate (and reduce the target) or skip it and move to the next.
    If the target becomes 0, we’ve found a valid combination.
    We use recursion and keep track of the current combination in a list.

✅ Code (Java)
    class Solution {
      public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] candidates, int target, int start, 
                           List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, current, result); // not i + 1 because we can reuse same element
                current.remove(current.size() - 1);
            }
        }
    }
}

⏱️ Time & Space Complexity
    Time Complexity: O(2^T)
    (Where T is the target value. In the worst case, we try almost all combinations.)

    Space Complexity: O(T)
    (Because of recursion stack and space for current list.)
