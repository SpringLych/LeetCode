package easy;

/**
 * @author LiYingChun
 * @date 2018/4/30
 * 231. Power of Two
 * Given an integer, write a function to determine if it is a power of two.
 * 判断n是不是2的幂次数
 */
public class P231_PowerofTwo {
    /**
     *直接使用位运算
     */
    public boolean isPowerOfTwo(int n) {
        return n>0 && ((n & (n-1)) == 0);
    }
}
