package easy;

import java.util.HashMap;

/**
 * @author LiYingChun
 * @date 2019/2/13
 * <p>
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements
 * is repeated N times.
 * <p>
 * Return the element repeated N times.
 */
public class P961_NRepeatedElementinSize2NArray {
    /**
     * 使用map
     */
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = A.length, res = 0;
        for (int i : A) {
            map.put(i, i);
            if (map.containsKey(i)) {
                res = i;
            } else {
                map.put(i, i);
            }
        }
        return res;
    }

    /**
     * 此题每个元素小于10000可以构建长度为10000的数组，空间换时间
     * Time：O(n)
     */
    public int repeatedNTimes2(int[] A) {
        int array[] = new int[10000];
        for (int i : A) {
            array[i] += 1;
            if (array[i] == 2) {
                return i;
            }
        }
        return 0;
    }

}
