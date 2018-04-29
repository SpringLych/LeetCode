package easy;

/**
 * @author LiYingChun
 * @date 2018/4/25
 * 191. Number of 1 Bits
 * Write a function that takes an unsigned integer and returns the number of ’1' bits
 * it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 */
public class P191_NumberOf1Bits {
    /**
     * @param n ;
     * @return ;
     * 使用 n & 1会超时
     * 使用 n = n & (n - 1)表示将n的二进制表示中的最低位为1的改为0
     * 例：n = 10100(二进制），则(n-1) = 10011 ==》n&(n-1) = 10000
     */
    public static int hammingWeight2(int n) {
        int total = 0;
        while (n != 0) {
            total++;
            n = n & (n - 1);
        }
        return total;
    }

}
