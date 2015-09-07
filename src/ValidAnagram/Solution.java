public class Solution {
    public boolean isAnagram(String s, String t) 
    {
       HashMap<Character,Integer> char_map = new HashMap<Character,Integer>();
        if(s.length()==t.length())
        {
            for (char c:s.toCharArray())
            {
                if (char_map.containsKey(c))
                {
                    char_map.put(c,char_map.get(c)+1);
                }
                else
                {
                    char_map.put(c,1);
                }
            }
            int ind=0;
            while(ind<t.length())
            {
              char cur_char=t.charAt(ind);
              if (char_map.containsKey(cur_char)) 
              {
                  int val = char_map.get(cur_char)-1;
                  if (val != 0)
                  {
                      char_map.put(cur_char,val);
                  }
                  else
                  {
                      char_map.remove(cur_char);
                  }
              }
              else
              {
                  return false;
              }
              ind+=1;
            }
            return true;
        }
        else
        {
            return false;
        }    
    }
}
