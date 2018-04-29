package easy;

import java.util.HashMap;

/**
 * @author LiYingChun
 * @date 2018/3/14
 * P242
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class P242_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        String ss = s.toLowerCase();
        String tt = t.toLowerCase();
        HashMap<Character, Character> map = new HashMap<>();
        int sLen = ss.length();
        int tLen = tt.length();
        if (sLen == 0 && tLen == 0) {
            return true;
        } else if (sLen != tLen) {
            return false;
        }
        for (int i = 0; i < sLen; i++) {
            map.put(ss.charAt(i), ss.charAt(i));
        }
        for (int i = 0; i < tLen; i++) {
            char temp = tt.charAt(i);
            if (map.get(temp) == null) return false;
            if (temp != map.get(temp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isTrue = isAnagram("a", "b");
    }
}
