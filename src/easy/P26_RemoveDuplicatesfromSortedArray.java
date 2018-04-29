package easy;

/**
 * @author LiYingChun
 * @date 2018/3/16
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in-place such that each element
 * appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * Example:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class P26_RemoveDuplicatesfromSortedArray {
    /**
     * 采用类似快速排序三向切分的方法
     * 结果会覆盖元素，如[1, 1, 2]最后为[1, 2, 2]
     * @param nums;
     * @return;
     */
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        //[0...index]为最后结果，无无重复元素
        //[l...r]为重复元素
        int index = 0, l = 0, r = 0;
        while (r < len){
            nums[index] = nums[l];
            while (r < len && nums[r] == nums[l]){
                r ++;
            }
            if (r < len) {
                l = r;
                index ++;
            }
        }
        return index + 1;
    }

    public static void main(String[] args){
        int[] a= {1, 1, 1, 2, 2, 3, 3, 3};
        int res = removeDuplicates(a);
        System.out.println("res = " + res);
        for (int i : a){
            System.out.print(i + ", ");
        }
    }
}
