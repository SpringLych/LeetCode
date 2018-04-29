package medium;

/**
 * @author LiYingChun
 * @date 2018/4/15
 * 343. Integer Break
 * Given a positive integer n, break it into the sum of at least two positive integers and
 * maximize the product of those integers. Return the maximum product you can get.
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 * Note: You may assume that n is not less than 2 and not larger than 58.
 * 第一次提交来自于算法视频，学习动态规划
 */
public class P343_IntegerBreak {
    //使用自顶下下配合记忆化存储
    //将n进行分割（至少分割两部分），可以获得的最大乘积
    int[] memo;

    private int breakInteger(int n) {
        if (n == 1) {
            //传入1，无法分割
            return 1;
        }
        if (memo[n] != 0) {
            //memo已经计算过，直接return
            return memo[n];
        }

        int res = -1;
        for (int i = 1; i <= n - 1; i++) {
            //i + (n - i)
            //不分割(n - i)，直接计算i * (n - i)看能否获得最大值，
            // 之后尝试分割(n - i)
            res = max3(res, i * (n - i), i * breakInteger(n - i));
        }
        //对此次结果进行了记录
        memo[n] = res;
        return res;
    }

    private int max3(int res, int a, int b) {
        return Math.max(res, Math.max(a, b));
    }

    public int integerBreak(int n) {
        memo = new int[n + 1];
        return breakInteger(n);
    }

    //下面使用动态规划解决
    int[] memoDP;

    public int integerBreakDP(int n) {
        // memoDP[i]表示将数字i分割（至少分割成两部分后）得到的最大乘积
        memoDP = new int[n + 1];
        //对底进行设置
        memoDP[1] = 1;
        for (int i = 2; i <= n; i++) {
            // 求解memo[i]
            for (int j = 1; j <= i - 1; j++) {
                //每次将i分割成 j + (i - j) 两部分
                //一种是j*(i-j)
                //另一种是继续分割(i-j)所得到的最大乘积值即memoDP[i-j]
                memoDP[i] = max3(memoDP[i], j * (i - j), j * memoDP[i - j]);
            }
        }
        return memoDP[n];
    }

    /**
     * LeetCode更快算法
     *
     * @param n
     * @return
     */
    public int integerBreakFast(int n) {

        if (n == 2) return 1;
        if (n == 3) return 2;

        int prod = 1;
        while (n > 4) {

            prod *= 3;
            n -= 3;
        }
        prod *= n;
        return prod;
    }

}
