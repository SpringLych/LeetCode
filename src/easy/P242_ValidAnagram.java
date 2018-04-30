package easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author LiYingChun
 * @date 2018/3/14
 * P242
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class P242_ValidAnagram {
    /**
     *利用一个数组保存s，t中每个字母出现的次数，如果最后数组元素全为0，返回true
     * 时间复杂度O(n)
     */
    public boolean isAnagram1(String s, String t) {
        int sLen = s.length(), tLen = t.length(), indexS, indexT;
        if (sLen != tLen) return false;
        int[] arr = new int[26];
        for (int i = 0; i < sLen; i++){
            indexS = s.charAt(i);
            indexT = t.charAt(i);
            arr[indexS - 97] ++;
            arr[indexT - 97] --;
        }
        for (int i : arr){
            if (i != 0)
                return false;
        }
        return true;
    }

    /**
     *先利用快排进行一次排序，之后遍历比较，时间复杂度O(nlogn)
     */
    public boolean isAnagram(String s, String t){
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) return false;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        for (int i = 0; i < sLen; i++){
            if (ss[i] != tt[i]){
                return false;
            }
        }
        return true;
    }
}
