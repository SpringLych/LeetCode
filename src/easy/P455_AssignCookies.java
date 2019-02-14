package easy;

import java.util.Arrays;

/**
 * @author LiYingChun
 * @date 2019/2/14
 * <p>
 * Assume you are an awesome parent and want to give your children some cookies. But,
 * you should give each child at most one cookie. Each child i has a greed factor gi,
 * which is the minimum size of a cookie that the child will be content with; and each cookie j
 * has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will
 * be content. Your goal is to maximize the number of your content children and output the maximum
 * number.
 * <p>
 * Note:
 * You may assume the greed factor is always positive.
 * You cannot assign more than one cookie to one child.
 */
public class P455_AssignCookies {
    /**
     * Time: O(nlogn)
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int leng = g.length;
        int lens = s.length;
        for (int i = 0; i < lens && res < leng; i++) {
            if (g[res] <= s[i]) {
                res++;
            }
        }
        return res;
    }
}
