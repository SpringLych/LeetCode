package easy;


/**
 * @author SpringLych
 * @date 2018/10/13
 *
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class P557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int len = words.length;
        StringBuilder sb;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb = new StringBuilder(words[i]);
            words[i] = sb.reverse().toString();
            res.append(words[i]);
            if (i != len - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}
