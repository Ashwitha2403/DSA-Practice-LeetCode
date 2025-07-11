🧠 Combination Sum II – LeetCode Problem #40

📝 Problem Statement
      Given a collection of candidate numbers candidates (without duplicates) and a target number target, find all unique combinations in candidates where the candidate numbers sum to target.
      Each number in candidates may only be used once in the combination.
      The solution set must not contain duplicate combinations.

🔢 Example
      Input: candidates = [10,1,2,7,6,1,5], target = 8
      Output:
        [
        [1,1,6],
        [1,2,5],
        [1,7],
        [2,6]
        ]

💡 Approach
      We first sort the input array to handle duplicates efficiently. Then we use backtracking to explore all possible combinations.
      We skip duplicates by checking if the current candidate is the same as the previous one (only if we're not at the start of the loop). We also skip further recursion if the current candidate exceeds the target.

✅ Code (Java)

    class Solution {
      public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, 
                           List<Integer> tempList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            
            if (candidates[i] > target) break;  // No valid combination ahead

            tempList.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, tempList, result);
            tempList.remove(tempList.size() - 1);
        }
    }
}

⏱️ Time & Space Complexity
      Time Complexity: O(2ⁿ)
      In the worst case, we explore all subsets.
      Space Complexity: O(k)
      Where k is the average length of combinations stored in the recursion stack.


