public class Solution {
     public int climbStairs(int n) 
    {
       return recur_climb_stairs(n,0); 
    }
    public int recur_climb_stairs(int n,int count)
    {
        if(n>0)
        {
            count = recur_climb_stairs(n-1,count);
            return  recur_climb_stairs(n-2,count);
        }
        else if (n==0)
        {
            count+=1;
            return count;
        }
        else
        {
            return count;
        }
    }
}

