public class Solution {
    public int rob(int[] nums) {
        int[] memo_array = new int[nums.length+2];     
        memo_array[0]=0;
        memo_array[1]=0;
        int i=2;
        while(i<memo_array.length)
        {
            memo_array[i]=Math.max(memo_array[i-1],memo_array[i-2]+nums[i-2]);
            i++;
        }
        return memo_array[memo_array.length-1];
    }
}
