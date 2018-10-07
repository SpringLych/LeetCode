package easy;

/**
 * @author SpringLych
 * @date 2018/10/1
 *
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Example 1:
 * Input: [3, 2, 1]
 *
 * Output: 1
 *
 * https://leetcode.com/problems/third-maximum-number/
 */
public class P414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        // 这里 fir,sec,thr可以声明 为long类型或声明为Integer类型
        // 处理nums中出现临界值
        int fir = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int thr = Integer.MIN_VALUE;
        boolean conMin = false;
        for (int i : nums){
            if (i == Integer.MIN_VALUE){
                conMin = true;
            }
            if (i == fir || i == sec || i == thr) continue;
            if (i > fir){
                thr = sec;
                sec = fir;
                fir = i;
            }else if (i > sec){
                thr = sec;
                sec = i;
            }else if (i > thr){
                thr = i;
            }
        }
        // 处理数组中是否包含Integer.MIN_VALUE情况
        if (!conMin && thr == Integer.MIN_VALUE){
            thr = fir;
        }
        /*System.out.println("fir="+fir);
        System.out.println("sec="+sec);
        System.out.println("thr="+thr);*/
        // 处理 1,1,-3等类似情况
        if (fir == sec || thr == sec) thr = fir;
        return thr;
    }
}
