package easy;

/**
 * @author 25715
 * @date 2018/11/1
 *
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 *
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 *
 * Return true if and only if the given array A is monotonic.
 *
 * https://leetcode.com/problems/monotonic-array/
 */
public class P896_MonotonicArray {
    public boolean isMonotonic(int[] A) {
        if(A.length<2) return true;
        boolean up = A[0]<=A[A.length-1]?true:false;
        for(int i =0;i < A.length-1; i++){
            if(up){
                if(A[i]>A[i+1]) return false;
            }else{
                if(A[i]<A[i+1]) return false;
            }
        }
        return true;
    }
}
