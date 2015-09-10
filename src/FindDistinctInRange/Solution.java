public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        k=k+1;
        HashSet<Integer> k_set = new HashSet<Integer>();
        for(int i=0;i<nums.length && i<k;i++)
        {
            if (k_set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                k_set.add(nums[i]);
            }
        }
        int end = k;
        int start=0;
        while(end<nums.length)
        {
            k_set.remove(nums[start]);
            start+=1;
            if(k_set.contains(nums[end]))
            {
                return true;
            }
            else
            {
                k_set.add(nums[end]);
            }
            end+=1;
        }
        return false;
    }
}
