package easy;

/**
 * @author LiYingChun
 * @date 2018/3/15
 * 344. Reverse String
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class P344_ReverseString {
    public String reverseString(String s) {
        if (s.equals("")) return "";
        char[] a = s.toCharArray();
        int len = a.length;
        char t;
        for (int i = 0; i < len/ 2; i++){
            t = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = t;
        }
        return String.valueOf(a);
    }

    public String reverserString2(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        P344_ReverseString re = new P344_ReverseString();
        String a = "Hello";
        System.out.println(re.reverserString2(a));
    }

}
