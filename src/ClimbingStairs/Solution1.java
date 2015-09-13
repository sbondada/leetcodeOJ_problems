public class Solution {
    public int climbStairs(int n) {
        int[] possible_ways = new int[n+1];     
        possible_ways[0]=1;
        if(n>0)
        {
        possible_ways[1]=1;
        }
        int i=2;
        while(i<possible_ways.length)
        {
            possible_ways[i] = possible_ways[i-1]+possible_ways[i-2];    
            i++;
        }
        return possible_ways[n];
    }
}
