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
 *
 * https://leetcode.com/problems/majority-element/
 */
public class P169_MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len / 2];
    }

    /*
    参考《剑指offer》。设置res为数组第一个元素，次数记为1，遍历数组，如果当前nums[i]==res，计数+1，否则-1，
    当次数减至0时，设置下一个即将遍历的元素为res。由于要返回的结果次数大于数组一半，因此，最后将计数设为1的元素
    即为要查找的元素.时间复杂度O（n）;
     */
    public int majorityElement2(int[] nums){
        int len = nums.length;
        int res = nums[0], times = 1;
        for(int i =1; i < len; i++){
            if(times == 0){
                res = nums[i];
                times = 1;
            }else if(nums[i] == res){
                times ++;
            }else{
                times --;
            }
        }
        return res;
    }
}
