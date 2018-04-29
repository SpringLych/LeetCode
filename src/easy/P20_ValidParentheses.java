package easy;

import java.util.Stack;

/**
 * @author LiYingChun
 * @date 2018/3/24
 * 20. Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 */
public class P20_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        int len = arr.length;
        boolean res = true;
        for (char anArr : arr) {
            if (anArr == '{' || anArr == '[' || anArr == '(') {
                st.push(anArr);
            }
            if (anArr == '}' || anArr == ']' || anArr == ')') {
                if (st.empty()) res = false;
                else {
                    boolean t = ((anArr == '}' && st.pop() == '{') ||
                            (anArr == ']' && st.pop() == '[') ||
                            (anArr == ')' && st.pop() == '('));
                    if (!t) res = false;
                }
            }
        }
        if (!st.empty()) res = false;
        return res;
    }
}
