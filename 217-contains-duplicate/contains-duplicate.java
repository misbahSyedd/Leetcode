import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Creating a HashSet
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));

        // If the length of the array is equal to the size of the HashSet, there are no duplicates
        return nums.length != hashSet.size();
    }
}
