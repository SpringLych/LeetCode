package easy;

/**
 * @author LiYingChun
 * @date 2018/3/19
 * 35. Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 1:
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class P35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        int len = nums.length;
        if (target > nums[len - 1]) return len;
        if (target < nums[0]) return 0;
        int l = 0, r = len - 1, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
