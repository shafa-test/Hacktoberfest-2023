import java.util.Arrays;
class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        System.out.println(l);
        int[] nums3=new int[l];
        double median=0;
            for (int i=0;i<l;i++)
            {
                if(i<(nums1.length))
                    nums3[i]=nums1[i];
                else
                    nums3[i]=nums2[i-(nums1.length)];
                System.out.println(nums3[i]);
            }
        Arrays.sort(nums3);
        if(l%2==0)
        {
            int m=(l/2)-1;
            int n=m+1;
            median=(nums3[m]+nums3[n]);
            median/=2;
        }
        else
            median=nums3[l/2];
        return median;
    }
}