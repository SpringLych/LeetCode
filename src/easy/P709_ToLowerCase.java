package easy;

/**
 * @author SpringLych
 * @date 2018/10/12
 * <p>
 * Implement function ToLowerCase() that has a string parameter str,
 * and returns the same string in lowercase.
 * <p>
 * https://leetcode.com/problems/to-lower-case/
 */
public class P709_ToLowerCase {
    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        char te;
        for (int i = 0; i < len; i++) {
            te = arr[i];
            if (te - 'A' >= 0 && te - 'A' < 26) {
                arr[i] = (char) (arr[i] + 32);
            }
        }
        return new String(arr);
    }
}
