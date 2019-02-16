package easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author LiYingChun
 * @date 2019/2/16
 * <p>
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
 * <p>
 * You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers,
 * output all of them with no order requirement.
 * You could assume there always exists an answer.
 * <p>
 * Time: O(m+n)
 */
public class P599_MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int len1 = list1.length;
        int len2 = list2.length;
        int ind = 0;
        for (String s : list1) {
            map.put(s, ind);
            ind++;
        }
        ArrayList<String> list = new ArrayList<>();
        ind = 0;
        int least = Integer.MAX_VALUE;
        for (String s : list2) {
            if (map.containsKey(s)) {
                int temp = map.get(s) + ind;
                if (temp <= least) {
                    if (temp < least) {
                        list.clear();
                    }
                    least = temp;
                    list.add(s);
                }
            }
            ind++;
        }
        String[] res = list.toArray(new String[list.size()]);
        return res;
    }
}
