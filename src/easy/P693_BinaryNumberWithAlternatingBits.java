package easy;

/**
 * @author LiYingChun
 * @date 2018/9/20
 * Given a positive integer, check whether it has alternating bits:
 * namely, if two adjacent bits will always have different values.
 */
public class P693_BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        int len = arr.length;
        for (int i = 0; i< len - 1; i++){
            if (arr[i] == arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
