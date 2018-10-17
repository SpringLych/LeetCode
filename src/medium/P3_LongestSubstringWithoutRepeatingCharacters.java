package medium;

import java.util.HashMap;

/**
 * @author SpringLych
 * @date 2018/10/17
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class P3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0) return 0;
        if(len == 1) return 1;
        HashMap<Character, Integer> map  = new HashMap<>();
        int sta = 0, end = 1, max = 0;// 最长子串开始和结尾的index
        map.put(s.charAt(0),0);
        char ch;
        while(end < len){
            ch = s.charAt(end);
            // 与前面重复
            if(map.containsKey(ch)){
                // 重点：Key有重复是sta的值变为有重复值得下一位
                sta = Math.max(sta, map.get(ch) + 1);
            }
            map.put(ch, end);
            end ++;
            max = Math.max(max, (end - sta));
        }
        return max;
    }
}
