/*
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * 
 * [3,2,4]
 * 6
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
import java.util.Arrays;
public class TwoSum
 {
    int[] check(int[] nums, int target, int i)
    {
        int tail = nums.length;
        int[] n = new int[2];
        {
            for(int j=(i+1);j<tail;j++) 
            {
                if(target == (nums[i]+nums[j])) {
                    n[0] = i;
                    n[1] = j;
                    return n;
                }
            }
        }
        return check(nums, target, i+1);
    }
    public int[] twoSum(int[] nums, int target)
    {
        int tail = nums.length;
        int[] n = new int[2];
        TwoSum r = new TwoSum();
        int i=0;
        n =r.check(nums, target, i);
        return n;
    }
    public static void main(String[] args) {
        int[] s = {3,2,4};
        int value = 6;
        TwoSum r = new TwoSum();
        int[] a = r.twoSum(s,value);
        System.out.println(Arrays.toString(a));
    }
}