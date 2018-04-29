package easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author LiYingChun
 * @date 2018/3/17
 * 217. Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class P217_ContainsDuplicate {
    /**
     * 使用HashM解法
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        if (len == 0) return false;
        boolean isDuplicate = false;
        for (int i = 0; i < len; i++){
            if (i ==0) continue;
            map.put(nums[i - 1], nums[i - 1]);
            if (map.containsKey(nums[i])){
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }

    /**
     * leetcode上更快的解法
     * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}
