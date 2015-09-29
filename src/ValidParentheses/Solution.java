public class Solution 
{
    public boolean isValid(String s) 
    {
        ArrayList<Character> stack = new ArrayList<Character>();         
        HashMap<Character,Character> par_map = new HashMap<Character,Character>();
        par_map.put('}','{');
        par_map.put(')','(');
        par_map.put(']','[');
        int i=0;
        stack.add(s.charAt(i));
        i =1;
        while(i<s.length())
        {
            if(stack.size()>0 && (par_map.containsKey(s.charAt(i)) && (par_map.get(s.charAt(i))==stack.get(stack.size()-1))))
            {
                stack.remove(stack.size()-1);
            }
            else
            {
                stack.add(s.charAt(i));
            }
            i++;
        }
        if(stack.size()>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
