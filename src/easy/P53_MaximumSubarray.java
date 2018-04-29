package easy;

/**
 * @author LiYingChun
 * @date 2018/3/15
 * 53. Maximum Subarray
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * <p>
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class P53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE, tmax = 0;
        for(int i = 0; i < len; i++){
            if (tmax >= 0) tmax += nums[i];
            else tmax = nums[i];
            if(tmax > max) max = tmax;
        }
        return max;
    }
}
