package easy;

/**
 * @author LiYingChun
 * @date 2018/4/25
 * 66. Plus One
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] res;
        if (digits[len - 1] < 9) {
            digits[len - 1] += 1;
            return digits;
        }
        int i;
        for (i = len - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                break;
            }
        }
        if (i == -1 && digits[0] == 0) {
            res = new int[len + 1];
            res[0] = 1;
            for (int j = 1; j < len + 1; j++) {
                res[j] = 0;
            }
            return res;
        }
        digits[i] += 1;
        return digits;
    }
}
