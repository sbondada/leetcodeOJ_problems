public class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
        int temp_num = x;
        int count=0;
        while(temp_num!=0)
        {
            temp_num=temp_num/10;
            count+=1;
        }
        int i=1;
        int j=count;
        while(i<j)
        {
            if(getDigit(x,i)!=getDigit(x,j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int getDigit(int num,int k)
    {
        int rem = num/(int)Math.pow(10,k-1);
        return rem%10;
    }
}
