public class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;              
        int carry=1;
        while(i>=0)
        {
            int temp=carry+digits[i];
            carry=temp/10;
            digits[i]=temp%10;
            i--;
        }
        if(carry!=1)
        {
            return digits;
        }
        else
        {
            int[] result = new int[digits.length+1];
            i=digits.length-1;
            while(i>0)
            {
                result[i+1] = digits[i];
                i--;
            }
            result[0]=carry;
            return result;
        }
    }
}
