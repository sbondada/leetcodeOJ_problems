public class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> row = new ArrayList<Integer>();  
        rowIndex++;
        if(rowIndex>0)
        {
            row.add(1);
        }
        if(rowIndex>1)
        {
            row.add(1);
        }
        while(rowIndex>2)
        {
            int i=1;
            int prev = row.get(i-1);
            while(i<row.size())
            {
                int temp=row.get(i);
                row.set(i,prev+row.get(i));
                prev=temp;
                i++;
            }
            row.add(1);
            rowIndex--;
        }
        return row;
    }
}
