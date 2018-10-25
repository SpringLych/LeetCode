package easy;

import java.util.Arrays;

/**
 * @author 25715
 * @date 2018/10/25
 * Given an array A of non-negative integers, half of the integers in A are odd,
 * and half of the integers are even.
 *
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 *
 * You may return any answer array that satisfies this condition.
 *
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class P922_SortArrayByParityII {
    /*
    遍历数组，维护分别指向偶数奇数索引的两个指针，如果奇偶指针下的两个数都不在正确的位置，交换；
    如果其中一个在正确的位置，则正确位置的索引+2；
    时间复杂度O（n）；
    空间复杂度O（1）；
     */
    public int[] sortArrayByParityII(int[] A) {
        // 偶数指针，奇数指针
        int ev = 0, od = 1;
        int len = A.length;
        int tev, tod;
        while (ev < len-1 && od < len){
            tev = A[ev]%2;
            tod = A[od]%2;
            if (tev!=0 && tod==0){
                int t = A[ev];
                A[ev] = A[od];
                A[od] = t;
                ev += 2;
                od += 2;
            }else if(tev == 0){
                ev += 2;
            }else {
                od+=2;
            }
        }
        return A;
    }
}
