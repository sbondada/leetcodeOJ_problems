public class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        ArrayList<String> result = new ArrayList<String>();
        if (nums.length>0)
        {
            int start=nums[0];
            int end;
            int ind=1;
            while(ind<nums.length) 
            {
                if (nums[ind-1]+1!=nums[ind])  
                {
                    end=nums[ind-1];
                    if (start!=end)
                    {
                        result.add(Integer.toString(start)+"->"+Integer.toString(end));
                    }
                    else
                    {
                        result.add(Integer.toString(start));
                    }
                    start=nums[ind];
                }
                ind+=1; 
            }
            end = nums[ind-1];
            if (start!=end)
            {
                result.add(Integer.toString(start)+"->"+Integer.toString(end));
            }
            else
            {
                result.add(Integer.toString(start));
            }
        }
        return result;    
    }
}
