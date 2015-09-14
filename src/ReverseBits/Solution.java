public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        String temp_right = Integer.toBinaryString(n);      
        String temp_left = ConstructBufferString(temp_right.length());
        String str_n= temp_left+temp_right;
        char[] str_array = str_n.toCharArray();
        int i=0;
        int j=str_array.length-1;
        while(i<j)
        {
            char temp = str_array[i];
            str_array[i]=str_array[j];
            str_array[j]=temp;
            i++;
            j--;
        }
        return Integer.parseInt(new String(str_array),2);
         
    }
    public String ConstructBufferString(int len)
    {
        int size = 32-len; 
        int i=0;
        String buffer_str= new String("");
        while(i<size)
        {
            buffer_str+="0";
            i++;
        }
        return buffer_str;
    }
}
