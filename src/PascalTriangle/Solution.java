public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt = new ArrayList<List<Integer>>();      
        List<Integer> temp;
        if(numRows>0)
        {
            temp= new ArrayList<Integer>();
            temp.add(1);
            pt.add(temp);
        }
        if(numRows>1)
        {
            temp = new ArrayList<Integer>();
            temp.add(1);
            temp.add(1);
            pt.add(temp);
        }
        int count=2;
        while(count<numRows)
        {
            List<Integer> prev_list = pt.get(count-1) ;
            temp = new ArrayList<Integer>();
            temp.add(1);
            int i=1;
            while(i<prev_list.size())
            {
                temp.add(prev_list.get(i)+prev_list.get(i-1));
                i++;
            }
            temp.add(1);
            pt.add(temp);
            count++;
        }
        return pt;
    }
}
