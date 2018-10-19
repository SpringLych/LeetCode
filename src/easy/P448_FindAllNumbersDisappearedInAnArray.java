package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 25715
 * @date 2018/10/19
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice
 * and others appear once.
 * <p>
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list
 * does not count as extra space.
 * <p>
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class P448_FindAllNumbersDisappearedInAnArray {
    /**
     * 参考《剑指offer》题3，将数组中的每个元素摆放到正确的下标位置，之后遍历，找到元素与下标不符的位置，下标
     * 即为缺失的
     * 时间复杂度O(n)    空间复杂度O(1)
     * @param nums nums
     * @return list
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;

        // 将nums[i]摆放到正确的index
        for (int i = 0; i < len ; i++){
            while (nums[i] != i + 1){
                int corInd = nums[i] - 1;
                if (nums[i]==nums[corInd]){
                    break;
                }
                int t = nums[i];
                nums[i] = nums[corInd];
                nums[corInd] = t;
            }
        }

        //找出缺失的元素
        for (int i = 0; i < len; i++){
            if (nums[i] != i+1){
                list.add(i+1);
            }
        }

        return list;
    }

    /**
     * 声明一个新数组记录每个元素出现的次数，出现次数为0的即为缺失的元素
     * 时间复杂度O(n)    空间复杂度O(n)
     * @param nums nums
     * @return list
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        int len = nums.length;
        int[] te = new int[len];
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            te[num - 1]++;
        }
        System.out.println(Arrays.toString(te));

        for (int i = 0; i < len; i++){
            if (te[i] == 0){
                list.add(i+1);
            }
        }
        return list;
    }
}
