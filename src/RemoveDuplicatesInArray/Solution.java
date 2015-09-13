public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length)
        {   
            nums[i]=nums[j];
            i++;
            j++;
            while(j<nums.length && nums[j]==nums[j-1])
            {
                j++;
            }
        }
        return i;
    }
}
