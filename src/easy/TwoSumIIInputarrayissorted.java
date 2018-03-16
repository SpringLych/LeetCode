package easy;

/**
 * @author LiYingChun
 * @date 2018/3/15
 * 167. Two Sum II - Input array is sorted
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and
 * you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSumIIInputarrayissorted {
    /**
     * 双指针向中间前进
     * @param numbers;
     * @param target;
     * @return result
     */
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int lt = 0, gt = len - 1;
        int cmp = 0;
        int[] result = new int[2];

        while(lt < gt){
            cmp = numbers[lt] + numbers[gt];
            if(cmp == target){
                result[0] = lt + 1;
                result[1] = gt + 1;
                break;
            }else if(cmp < target){
                lt ++;
            }else gt--;
        }
        return result;

    }
}
