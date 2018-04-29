package easy;

import java.util.Arrays;

/**
 * @author LiYingChun
 * @date 2018/4/29
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element
 * that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the
 * array.
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 */
public class P169MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len / 2];
    }
}
