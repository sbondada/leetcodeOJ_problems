public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> char_map = new HashMap<Character,Character>(); 
        if(s.length()!=t.length()) 
        {
            return false;
        }
        else
        {
            int i=0;
            while(i<s.length())
            {
                char s_char = s.charAt(i);
                char t_char = t.charAt(i);
                if(char_map.containsKey(s_char))
                {
                    if(char_map.get(s_char)!=t_char)
                    {
                        return false;
                    }
                }
                else if (char_map.containsValue(t_char))
                {
                    return false;
                }
                else 
                {
                    char_map.put(s_char,t_char);
                }
                i++;
            }
            return true;
        }

    }
}
