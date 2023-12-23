class Solution {
   // BRUTE FORCE
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i=0; i<nums.length-1; i++) {
    //             for(int j=i+1; j<nums.length; j++) {
    //                 if(nums[i]+nums[j]== target){
    //                     return new int[]{i,j};
    //                 }
    //             }
    //     }
    //     return new int[]{};
    // }
public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }

}