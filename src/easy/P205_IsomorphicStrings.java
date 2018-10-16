package easy;

import java.util.HashMap;

/**
 * @author SpringLych
 * @date 2018/10/16
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters. No two characters may map to the same character but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * <p>
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class P205_IsomorphicStrings {
    /**
     * 使用HashMap，与P290类似的解法
     *
     * @param s s
     * @param t t
     * @return boolean
     */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int lens = s.length();
        if (lens == 0) return true;
        map.put(s.charAt(0), t.charAt(0));
        char chs, cht;
        for (int i = 1; i < lens; i++) {
            chs = s.charAt(i);
            cht = t.charAt(i);
            if (map.containsKey(chs)) {
                if (map.get(chs) != cht) {
                    return false;
                }
            } else {
                if (map.containsValue(cht)) {
                    return false;
                }
                map.put(chs, cht);
            }
        }
        return true;
    }

    /**
     * 因为比较的都是字符，因此可以使用数组的方式
     *  LeetCode解法
     * @param s1 s
     * @param s2 t
     * @return boolean
     */
    public boolean isIsomorphicFast(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
        }
        return true;
    }
}
