public class Solution {
    public int majorityElement(int[] nums) {
          int i =1;      
        int maj_ele = nums[0];
        int count=1;
        while(i<nums.length)
        {
           if(count==0) 
           {
               maj_ele=nums[i];
           }
           if(maj_ele==nums[i])
           {
               count+=1;
           }
           else
           {
               count-=1;
           }
           i+=1;
        }
        return maj_ele;
    }
}
