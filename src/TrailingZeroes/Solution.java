public class Solution {
    public int trailingZeroes(int n) 
    {
        int twos = n/2;
        int u_twos = twos-tows/5;
        int fives = n/5;
        int u_fives = fives-fives/2;
        int tens = n/10;

        int trailing_zeros= tens;
        if (u_twos>u_fives)
        {
            trailing_zeros+=u_fives;
        }
        else
        {
            trailing_zeros+=u_twos;
        }
        return trailing_zeros
    }
}
