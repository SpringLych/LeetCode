package easy;

import java.util.HashMap;

/**
 * @author SpringLych
 * @date 2018/10/9
 *
 * Given an array of integers, return indices of the two numbers such that they add up to
 * a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use
 * the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class P1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int len = nums.length;
        int oth = 0;
        for (int i = 0; i < len;i++){
            // 元素重复会导致HashMap键值重复
            if (map.containsKey(nums[i])){
                if (nums[i] * 2 == target){
                    res[0] = map.get(nums[i]);
                    res[1] = i;
                }
            }
            map.put(nums[i], i);
            oth = target - nums[i];
            if (map.containsKey(oth) && map.get(oth) != i){
                res[0] = map.get(oth);
                res[1] = map.get(target - oth);
            }
        }
        return res;
    }
}
