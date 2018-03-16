package easy;

/**
 * @author LiYingChun
 * @date 2018/3/15
 * 283. Move Zeroes
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    /**
     * 将所有非零元素一次前移，最后将剩下的位置赋值为0
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        //最后一个非零元素的索引
        int notIndex = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[notIndex] = nums[i];
                notIndex++;
            }
        }
        for (int i = notIndex; i < len; i++) {
            nums[i] = 0;
        }
    }

}
