class Solution {
    public int[] twoSum(int[] nums, int target) {
          int n = nums.length;

          
     for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // i < j, so smaller index comes first
                }
            }
        }

        // If no solution (not possible as per problem statement)
        return new int[] {};
    }
}
