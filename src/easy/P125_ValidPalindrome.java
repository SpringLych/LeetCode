package easy;

/**
 * @author SpringLych
 * @date 2018/10/15
 * <p>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and
 * ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * <p>
 * https://leetcode.com/problems/valid-palindrome/
 */
public class P125_ValidPalindrome {

    /**
     * 左右双指针对撞 要注意0-9,a-z,A-Z是同一类
     * 时间复杂度：O(n)
     *
     * @param s s
     * @return res
     */
    public boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        char[] ss = s.toCharArray();
        int len = ss.length;
        int l = 0, r = len - 1;//[l...r]
        while (l <= r) {
            while (l < r && !isChar(ss[l])) l++;
            while (l < r && !isChar(ss[r])) r--;
            if (!isEqual(ss[l++], ss[r--])) {
                return false;
            }
        }
        return true;
    }

    private boolean isEqual(char a, char b) {
        return Character.toLowerCase(a) == Character.toLowerCase(b);
    }

    private boolean isChar(char a) {
        return (a >= '0' && a <= '9') ||
                (a >= 'a' && a <= 'z') ||
                (a >= 'A' && a <= 'Z');
    }
}
