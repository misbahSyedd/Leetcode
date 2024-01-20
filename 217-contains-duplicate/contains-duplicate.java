import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for(int i=0; i<nums.length; i++){
          if(numbers.contains(nums[i]))
          return true;
          else
          numbers.add(nums[i]);
        }
        return false;
        // Creating a HashSet
        //Set<Integer> hashSet = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));

        // If the length of the array is equal to the size of the HashSet, there are no duplicates
       // return nums.length != hashSet.size();
    
}
}
