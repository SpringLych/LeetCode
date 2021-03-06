package easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author LiYingChun
 * @date 2018/3/28
 * 389. Find the Difference
 * Given two strings s and t which consist of only lowercase letters.
 * String t is generated by random shuffling string s and then
 * add one more letter at a random position.
 * Find the letter that was added in t.
 * Example:
 * Input:
 * s = "abcd"
 * t = "abcde"
 * Output:
 * e
 * Explanation:
 * 'e' is the letter that was added.
 */
public class P389_FindTheDifference {
    /**
     * 这种找不同的可以转化为数字的问题就可使使用位运算 ^ 或者使数字相加减得到结果找到不同
     * @param s ;
     * @param t ;
     * @return ;
     */
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int lenS = ss.length;
        int lenT = tt.length;
        long res = 0;
        int k = 0;
        for (char i : ss){
            k = (int) i;
            res ^= k;
        }
        for (char i : tt){
            k = (int) i;
            res ^= k;
        }
        char end = (char) res;
        return end;
    }
}
