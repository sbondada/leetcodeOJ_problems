public class Solution {
    public boolean isPowerOfTwo(int n) 
    {
         if(n>0 && n!=0  && n!=1 )
         {
              n=n&(n-1);
              if (n == 0) 
              {
                  return true;
              }
              else
              {
                  return false;
              }
         }
         else if(n==1)
         {
             return true;
         }
         else
         {
             return false;
         }
    }
}
