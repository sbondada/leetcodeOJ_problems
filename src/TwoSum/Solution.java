package TwoSum;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
    	int targetArray[] = new int[2];
    	LinkedHashSet<Integer> numSet = new LinkedHashSet<Integer>();
    	ArrayList<Integer> arraySet = new ArrayList<Integer>(); 
        for( int num : numbers)
        {
        	numSet.add(num);
        	arraySet.add(num);
        }
        for( int num : numbers)
    	{
        	if (numSet.contains(target-num))
        	{
        		if (arraySet.indexOf(num) != arraySet.indexOf(target-num))
        		{
                        targetArray[0] = arraySet.indexOf(num)+1;
                        targetArray[1] = arraySet.indexOf(target-num)+1;
                        return targetArray;
        		}
        		else
        		{
                        targetArray[0] = arraySet.indexOf(num)+1;
                        targetArray[1] = arraySet.lastIndexOf(target-num)+1;
                 
        		}
        	}
    	}
        return targetArray;
    }

    public static void main(String args[])
    {
    	Solution s = new Solution();
    	int numbers[] = {0,1,4,0};
    	int target = 0;
    	int outArray[] = s.twoSum(numbers, target);
        System.out.print("index1="+outArray[0]+", ");
        System.out.print("index2="+outArray[1]);
    }
}
