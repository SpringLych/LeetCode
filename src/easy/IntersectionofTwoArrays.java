package easy;

import java.util.HashSet;

/**
 * @author LiYingChun
 * @date 2018/3/14
 * 349. Intersection of Two Arrays
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] result;
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 == 0 || len2 == 0) {
            result = new int[0];
            return result;
        } else {
            result = new int[len2];
        }
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        int size = set2.size();
        result = new int[size];
        int i = 0;
        for (Integer aSet2 : set2) {
            result[i] = aSet2;
            i++;
        }
        return result;
    }

}
