package easy;

/**
 * @author SpringLych
 * @date 2018/10/12
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 * followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 */
public class P905_SortArrayByParity {
    // 最简单：声明新数组，遍历A，按奇偶添加到新数组中
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int pre = 0, last = len-1;
        for(int a : A){
            if(a %2 == 0){
                res[pre++] = a;
            }else{
                res[last--] = a;
            }
        }
        return res;
    }

    // 直接在A内交换
    public int[] sortArrayByParity2(int[] A) {
        int len = A.length;
        int fir = 0, last = len - 1;
        int te = 0;
        while(fir < last){
            while(A[fir] % 2 == 0 && fir < last){
                fir++;
            }
            te = A[fir];
            while(A[last] % 2 != 0 && fir < last){
                last --;
            }
            A[fir] = A[last];
            A[last] = te;
        }
        return A;
    }
}
