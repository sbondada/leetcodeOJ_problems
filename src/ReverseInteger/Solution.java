public class Solution {
    public int reverse(int x) 
    {
      char[]  x_array = Integer.toString(x).toCharArray();
        int i;
        if(x_array[0]=='-') 
        {
            i= 1;
        }
        else
        {
            i= 0;
        }
        int j= x_array.length-1;
        while(i<j)
        {
            char temp = x_array[i];
            x_array[i] = x_array[j];
            x_array[j] = temp;
            i++;
            j--;
        }
        try
        {
        return Integer.parseInt(String.valueOf(x_array));
        }
        catch(NumberFormatException e)
        {
            return 0;
        }    
    }
}
