package easy;

/**
 * @author LiYingChun
 * @date 2019/2/20
 * <p>
 * Given a string S, return the "reversed" string where all characters that are not a letter
 * stay in the same place, and all letters reverse their positions.
 */
public class P917_ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        int len = S.length();
        char[] str = S.toCharArray();
        int le = 0, ri = len - 1;
        while (le < ri) {
            while (le < ri && !isChar(str[le])) {
                le++;
            }
            while (le < ri && !isChar(str[ri])) {
                ri--;
            }
            char tmp = str[ri];
            str[ri] = str[le];
            str[le] = tmp;
            le++;
            ri--;
        }
        return String.valueOf(str);
    }

    private boolean isChar(char a) {
        return Character.isLetter(a);
    }
}
