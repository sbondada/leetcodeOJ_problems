public class Solution {
    public int titleToNumber(String s) {
       s = s.toLowerCase();
       char[] char_arr = s.toCharArray();
       int i=char_arr.length-1;
       int count=0;
       int result = 0;
       while(i>=0)
       {
            int num = char_arr[i]-96;
            result+=(Math.pow(26,count)*num);
            count+=1;
            i-=1;
       }
       return result;
    }
}
