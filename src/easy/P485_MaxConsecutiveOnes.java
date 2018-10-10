package easy;

/**
 * @author SpringLych
 * @date 2018/10/10
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * <p>
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class P485_MaxConsecutiveOnes {
    /**
     * 使用双指针
     *
     * @param nums nums
     * @return res
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int max = 0, sta = 0, end = 0;
        while (end < len) {
            while (sta < len && nums[sta] == 0) {
                sta++;
            }
            end = sta;
            while (end < len && nums[end] == 1) {
                end++;
            }
            max = Math.max(max, end - sta);
            sta = end;
        }
        return max;
    }
}
