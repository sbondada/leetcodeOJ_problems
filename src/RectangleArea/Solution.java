public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
       int length = findIntersection(A,C,E,G);      
       int bredth = findIntersection(B,D,F,H);
       return  Math.abs((C-A)*(D-B))+Math.abs((G-E)*(H-F))-(Math.abs(length)*Math.abs(bredth));
    }
    public int findIntersection(int a,int b,int c,int d)
    {
        if ((c>=a && c<=b || d>=a && d<=b)||(a>=c && a<=d || b>=c && b<=d))
        {
            return Math.max(0,Math.min(b,d)-Math.max(a,c));
        }
        else
        {
            return 0;
        }
    }
}
