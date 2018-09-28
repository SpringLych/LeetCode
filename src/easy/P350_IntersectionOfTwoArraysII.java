package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author SpringLych
 * @date 2018/9/28
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 */
public class P350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res = null;
        if (nums1.length > nums2.length){
            res = inter(nums1, nums2);
        }else {
            res = inter(nums2, nums1);
        }
        return res;
    }

    private int[] inter(int[] longer, int[] shorter){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        // 使用count记录最短数组中每个元素出现的次数
        for (int i : shorter){
            if (map.containsKey(i)){
                count = map.get(i);
                map.put(i, count+1);
            }else {
                map.put(i,0);
            }
        }
        for (int i : longer){
            if (map.containsKey(i)){
                count = map.get(i);
                if (count >= 0){
                    list.add(i);
                    map.replace(i,count-1);
                }
            }
        }
//        int len = list.size();
        int[] res = new int[list.size()];
//        for (int i = 0; i < len;i++){
//            res[i] = list.get(i);
//        }
        // 使用forEach替代int i ，提交结果效率明显提高
        int i = 0;
        for (int l : list){
            res[i++] = l;
        }
        return res;
    }

    /**
     * LeetCode最快解法
     * @param nums1 nums1
     * @param nums2 nums2
     * @return res
     */
    public int[] intersectFast(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, index = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                nums1[index++] = nums2[j];
                i++;
                j++;
            } else if(nums1[i] < nums2[j]){
                i++;
            } else{
                j++;
            }
        }
        return Arrays.copyOf(nums1, index);
    }
}
