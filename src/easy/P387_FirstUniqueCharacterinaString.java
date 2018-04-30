package easy;

/**
 * @author LiYingChun
 * @date 2018/4/30
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character
 * in it and return it's index. If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 */
public class P387_FirstUniqueCharacterinaString {
    /**
     *利用数组存储每个字符出现的频率，之后遍历字符串，找到第一个只出现一次的字符
     * 时间复杂度：O(n)
     */
    public int firstUniqChar(String s) {
        int len = s.length();
        int[] arr = new int[26];
        int res = -1;
        for (int i = 0; i < len; i++){
            arr[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < len; i++){
            if (arr[s.charAt(i) - 'a'] == 1) {
                res = i;
                break;
            }
        }
        return res;
    }
}
