public class Solution {
    public int lengthOfLastWord(String s) 
    {
        int ind=0;
        while(ind<s.length() && s.charAt(ind)==' ') 
        {
            ind+=1;
        }
        int lastword_len=0;   
        int cur_word_len=0;
        while(ind<s.length()) 
        {
            if(s.charAt(ind)!=' ')
            {
                ind+=1;
                cur_word_len+=1;
            }
            else
            {
                lastword_len=cur_word_len; 
                cur_word_len=0;
                while(ind < s.length() && s.charAt(ind)==' ')
                {
                    ind+=1;
                }
            }
        }
        if(s.length()>0 && s.charAt(s.length()-1)!=' ')
        {
            lastword_len=cur_word_len;
        }
        return lastword_len;
    }
}
