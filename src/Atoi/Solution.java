public class Solution {
    public int myAtoi(String str) 
    {
        char[] char_arr = str.trim().toCharArray();
        if (char_arr.length==0)
        {
            return 0;
        }
        else
        {
            int sign=1;
            int start=0; 
            if(char_arr[0]=='-' || char_arr[0]=='+')
            {
               start=1;  
               if(char_arr[0]=='-')
               {
                   sign=-1;
               }
            }
            int i=start;
            int result_num=0;
            while(i<char_arr.length)
            {
                if (char_arr[i]>=48 && char_arr[i]<=57)
                {
                    int temp = result_num;
                    result_num=result_num*10+(char_arr[i]-48);
                    if (temp!=result_num/10)
                    {
                        if (sign==1)
                        {
                            return 2147483647;
                        }
                        else
                        {
                            return -2147483648;
                        }
                    }
                }
                else 
                {
                    return sign*result_num;
                }
                i+=1;
            }
            return sign*result_num;
        }

    }
}
