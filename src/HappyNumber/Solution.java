public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited_set = new HashSet<Integer>();     
        int temp_sum = 0;
        while(true)
        {
            temp_sum = 0;
            visited_set.add(n);
            while(n!=0)
            {
                temp_sum+=Math.pow(n%10,2);
                n=n/10;
            }
            n=temp_sum;
            if(temp_sum==1)
            {
                return true;
            }
            else if(visited_set.contains(temp_sum))
            {
                return false;
            }
        }
    }
}
