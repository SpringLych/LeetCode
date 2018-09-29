package easy;

import java.util.HashMap;

/**
 * @author SpringLych
 * @date 2018/9/29
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * <p>
 * https://leetcode.com/problems/ransom-note/
 */
public class P383_RansomNote {
    /**
     * 使用HashMap，遍历magazine 中每个元素并记录出现的次数
     * 再遍历ransomNote每个元素，如果存在于HashMap，则次数减一，直至为0 false
     * 不存在 false
     * @param ransomNote ran
     * @param magazine mag
     * @return res
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        boolean flag = true;
        for (char i :mag){
            if (map.containsKey(i)){
                map.replace(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        for (char i : ran){
            if (map.containsKey(i)){
                int val = map.get(i);
                if (val>= 1){
                    map.replace(i, val - 1);
                }else {
                    flag = false;
                }
            }else {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * 使用数组记录每个字母出现的次数
     * @param ransomNote rans
     * @param magazine maga
     * @return res
     */
    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] cou = new int[26];
        char[] mag = magazine.toCharArray();
        char[] ran = ransomNote.toCharArray();
        boolean res = true;
        // 记录每个字母出现的次数
        for (char i : mag){
            cou[i-'a'] ++;
        }
        for (char i : ran){
            if (cou[i-'a'] > 0){
                cou[i - 'a'] --;
            }else {
                res = false;
                break;
            }
        }
        return res;
    }

    /**
     * LeetCode最快解
     *
     * 使用index记录每个字母上一次出现的索引，对于ransomNote中的每个元素，使用indexOf()，不存在索引返回-1,返回false
     * 存在返回第一次出现的索引，同时index中上一次出现的索引+1，下次对同一从索引+1开始检索，解决了元素重复出现的问题
     * @param ransomNote r
     * @param magazine m
     * @return res
     */
    public boolean canConstructFase(String ransomNote, String magazine) {
        int[] index = new int[128];
        for(char c: ransomNote.toCharArray()) {
            int idx = magazine.indexOf(c, index[c]);
            if(idx < 0) {
                return false;
            }
            index[c] = idx + 1;
        }
        return true;
    }
}
