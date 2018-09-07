package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiYingChun
 * @date 2018/9/8
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class P118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            row.add(0, 1);
            int len = row.size();
            for (int j = 1; j < len - 1; j++) {
                row.set(j, res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(new ArrayList<>(row));
        }
        return res;
    }
}
