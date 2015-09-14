public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i=m-1;
        int j=nums1.length-1;
        while(i>=0)
        {
            nums1[j]=nums1[i];
            i--;
            j--;
        }
        i=0;
        j++;
        int k=0;
        while(j<nums1.length && k<nums2.length )
        {
            if(nums1[j]<nums2[k])
            {
                nums1[i]=nums1[j];
                i++;
                j++;
            }
            else
            {
                nums1[i]=nums2[k];
                i++;
                k++;
            }
        }
        if(j>=nums1.length)
        {
            while(k<nums2.length)
            {
                nums1[i]=nums2[k];
                i++;
                k++;
            }
        }
        else
        {
            while(j<nums1.length)
            {
                nums1[i]=nums1[j];
                i++;
                j++;
            }
        }
    }
}
