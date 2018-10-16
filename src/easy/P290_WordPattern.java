package easy;

import java.util.HashMap;

/**
 * @author SpringLych
 * @date 2018/10/16
 * <p>
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern
 * and a non-empty word in str.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * <p>
 * https://leetcode.com/problems/word-pattern/
 */
public class P290_WordPattern {
    /**
     * 使用HashMap，循环遍历pattern和str，pattern为键str为值放入HashMap
     * 发现相同的键，对比值；对于不同的键出现相同的值，返回false
     *
     * @param pattern pat
     * @param str     str
     * @return boolean
     */
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        int lenP = pattern.length();
        String[] sstr = str.split(" ");
        if (lenP != sstr.length) return false;
        map.put(pattern.charAt(0), sstr[0]);
        char ch;
        for (int i = 1; i < lenP; i++) {
            ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(sstr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(sstr[i])) {
                    return false;
                }
                map.put(ch, sstr[i]);
            }
        }
        return true;
    }
}
