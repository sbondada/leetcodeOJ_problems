public class Solution {
    public int addDigits(int num) 
    {
        while(num >9)      
        {
            int tempnum=num;
            num=0;
            while(tempnum>0)
            {
                int rem = tempnum%10;
                tempnum = tempnum/10;
                num+=rem;
            }
        }
        return num;
    }
}
