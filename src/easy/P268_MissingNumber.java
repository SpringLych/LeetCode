package easy;

/**
 * @author LiYingChun
 * @date 2018/4/30
 */
public class P268_MissingNumber {
    /**
     *利用等差数列求和公式计算出0+1+..+n的和，在遍历数组计算数组元素的和，相减得到结果
     * 时间复杂度O(n)
     */
    public int missingNumber(int[] nums) {
        int len = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long add = (len + 1) * len / 2;
        return (int)(add - sum);
    }

    /**
     *LeetCode同样为O(n)的解法
     */
    public int missingNumber1(int[] nums) {
        int sum = nums.length;
        for(int i =0; i<nums.length; i++){
            sum = sum-nums[i]+i;
        }
        return sum;
    }
}
