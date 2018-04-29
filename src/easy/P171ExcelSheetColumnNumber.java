package easy;

/**
 * @author LiYingChun
 * @date 2018/4/29
 * 171. Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * Example 1:
 * Input: "A"
 * Output: 1
 * Input: "ZY"
 * Output: 701
 */
public class P171ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int len = s.length();
        int res = 0, num;
        for (int i = len - 1; i >= 0; i--) {
            num = s.charAt(i) - 64;
            //这里不需要每次计算pow，可以用一个变量记录幂次，如 exp *= 26;
            double te = Math.pow(26, len - 1 - i);
            res += num * te;
        }
        return res;
    }

    public int titleToNumber2(String s) {
        int num = 0;
        int exp = 1;

        for (int i = s.length() - 1; i >= 0; --i) {
            num += (s.charAt(i) - 'A' + 1) * exp;
            exp *= 26;
        }
        return num;
    }
}
