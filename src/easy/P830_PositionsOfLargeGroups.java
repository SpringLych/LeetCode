package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 25715
 * @date 2018/11/3
 *
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 *
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 *
 * Call a group large if it has 3 or more characters.  We would like the starting and ending
 * positions of every large group.
 *
 * The final answer should be in lexicographic order.
 *
 * https://leetcode.com/problems/positions-of-large-groups/
 */
public class P830_PositionsOfLargeGroups {
    /*
    遍历字符串，每次遇到与前一个字符不同的字符，将st设在新字符出，如果后一个字符与新字符相同，
    end++，直至遇到有一个新的字符，此时判断相同的是否出现了3次，是就添加进结果
     */
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>(2);
        // st group start, end group end
        int len = S.length(), st = 0, end = 0;
        while(end < len ){
            while(end < len && S.charAt(end)==S.charAt(st)){
                ++end;
            }
            if(end - st >=3) {
                res.add(Arrays.asList(st,end-1));
            }
            st = end;
        }
        return res;
    }
}
