public class Solution {
    public String convert(String s, int numRows) 
    {
       HashMap<Integer,String> zagrow =  new HashMap<Integer,String>();
        for(int i=0;i<numRows;i++)
        {
            zagrow.put(i,"");
        }
        int ind=0;
        int flag = 0;
        int cur_row=0;
        int max_row=numRows-1;
        if(max_row!=0)
        {
            while(ind<s.length())
            {
                if (flag==0 && cur_row <= max_row)
                {
                    zagrow.put(cur_row,zagrow.get(cur_row)+s.charAt(ind));
                    ind+=1;
                    if(cur_row==max_row)
                    {
                        cur_row-=1;
                        flag=1;
                    }
                    else
                    {
                        cur_row+=1;
                    }
                }
                else if (flag==1 && cur_row >= 0)
                {
                    zagrow.put(cur_row,zagrow.get(cur_row)+s.charAt(ind));
                    ind+=1;
                    if(cur_row==0)
                    {
                        cur_row+=1;
                        flag=0;
                    }
                    else
                    {
                        cur_row-=1;
                    }
                }
            } 
            String result="";
            for(int i=0;i<numRows;i++)
            {
                result+=zagrow.get(i);
            }
            return result;
        }
        else
        {
            return s;
        }
    }
}
