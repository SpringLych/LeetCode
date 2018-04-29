package easy;

/**
 * @author LiYingChun
 * @date 2018/4/29
 * 136. Single Number
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 */
public class P136SingleNumber {
    /**
     * @param nums ;
     * @return ;
     * 利用位运算 a^a = 0的性质找出
     */
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res = res ^ i;
        }
        return res;
    }
}
