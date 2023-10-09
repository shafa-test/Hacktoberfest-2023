import java.util.*;
class Missing_Number {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        for(int i =0;i<l;i++)
            if(i!=nums[i])
                return i;
        return l;
        /*int N = nums.length;
        for(int i = 0; i < N;)
        {
            if (nums[i] == i + 1)
            {
                i++;
            }
            else
            {
                int temp1 = nums[i];
                int temp2 = nums[nums[i] - 1];
                nums[i] = temp2;
                nums[temp1 - 1] = temp1;
            }
        }
        for(int i =0;i<N;i++)
            if(i!=nums[i])
                return i;
        return N;*/
    }
}