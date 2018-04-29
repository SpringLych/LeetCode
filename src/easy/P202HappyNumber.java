package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LiYingChun
 * @date 2018/4/29
 * 202. Happy Number
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */

public class P202HappyNumber {
    /**
     * 需要记录是否出现相同的结果，如果出现，说明进入了死循环，返回false
     * HashSet效率并不高
     **/
    public boolean isHappy(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        boolean[] flag = new boolean[1000];
        long ln = n;
        Set<Long> set = new HashSet<>();
        while (n <= Integer.MAX_VALUE) {
            if (set.contains(ln)) return false;
            else set.add(ln);
            ln = breakMulti(ln);
            if (ln == 1) return true;
        }
        return false;
    }

    public long breakMulti(long num) {
        long res = 0;
        while (num > 0) {
            long a = num % 10;
            num = num / 10;
            res += a * a;
        }
        return res;
    }

    /**
     * LeetCode更快的解法
     */
    public boolean isHappy2(int n) {
        while (n != 1 && n != 4) {
            int cur = n;
            n = 0;
            while (cur > 0) {
                int d = cur % 10;
                n += d * d;
                cur /= 10;
            }
        }
        return n == 1;
    }
}
