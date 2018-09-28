package easy;

/**
 * @author SpringLych
 * @date 2018/9/28
 */
public class P326_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        // int类型里最大的3的幂数
        int MAX = 1162261467;
        if(n <=0 || n > MAX) return false;
        return MAX % n == 0;
    }
}
