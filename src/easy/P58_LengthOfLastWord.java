package easy;

/**
 * @author LiYingChun
 * @date 2018/9/21
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 */
public class P58_LengthOfLastWord {
    /**
     * 注意考虑各种特殊情况
     */
    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        if (len == 0){
            return 0;
        }
        if (len == 1 && chars[0] == ' '){
            return 0;
        }
        int res = 0;
        for (int i = len - 1; i >= 0; i--){
            while (chars[i] == ' ' && res == 0){
                i --;
                if (i < 0) {
                    return 0;
                }
            }
            if (chars[i] != ' '){
                res ++;
            }else {
                break;
            }
        }
        return res;
    }
}
