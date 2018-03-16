package easy;

/**
 * @author LiYingChun
 * @date 2018/3/15
 * 27. Remove Element
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement {
    /**
     * 覆盖元素
     * nums[0...l]都是保留的元素[l+1...len-1]有的元素被覆盖
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int l = 0;
        for (int i = 0; i < len; i++){
            if (nums[i] != val){
                nums[l] = nums[i];
                l ++;
            }
        }
        return l;

    }
}
