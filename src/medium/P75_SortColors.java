package medium;

import java.util.Arrays;

/**
 * @author SpringLych
 * @date 2018/10/14
 * <p>
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the
 * same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note: You are not suppose to use the library's sort function for this problem.
 * <p>
 * Example:
 * <p>
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * <p>
 * https://leetcode.com/problems/sort-colors/
 */
public class P75_SortColors {
    /**
     * 最简单
     *
     * @param nums nums
     */
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    /**
     * 计数排序
     * 统计0,1,2,的个数，之后放回数组
     *
     * @param nums nums
     */
    public void sortColors2(int[] nums) {
        int cou0 = 0, cou1 = 0, cou2 = 0;
        int len = nums.length;
        for (int a : nums) {
            if (a == 0) cou0++;
            else if (a == 1) cou1++;
            else cou2++;
        }
        for (int i = 0; i < cou0; i++) {
            nums[i] = 0;
        }
        for (int i = cou0; i < cou0 + cou1; i++) {
            nums[i] = 1;
        }
        for (int i = cou0 + cou1; i < cou0 + cou1 + cou2; i++) {
            nums[i] = 2;
        }
    }

    /**
     * 三路快速排序思想
     *
     * @param nums nums
     */
    public void sortColors3(int[] nums) {
        int l = 0, r = nums.length - 1, i = 0;
        // [0...l]=0,[l+1...r]=1,[r+1....nums.length-1]=2
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i++, l++);
            } else if (nums[i] == 2) {
                swap(nums, i, r--);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int te = nums[a];
        nums[a] = nums[b];
        nums[b] = te;
    }
}
