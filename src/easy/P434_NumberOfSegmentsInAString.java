package easy;

/**
 * @author SpringLych
 * @date 2018/10/1
 *
 * Count the number of segments in a string, where a segment is defined to be a
 * contiguous sequence of non-space characters.
 *
 * Please note that the string does not contain any non-printable characters.
 *
 * Example:
 *
 * Input: "Hello, my name is John"
 * Output: 5
 */
public class P434_NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int cou = 0;
        int len = s.length();
        // 长度为1的情况
        if (len == 1 && s.charAt(0) != ' ') cou += 1;
        for (int i = 1; i < len;i++){
            // 处理首位为空
            if (i == 1 && s.charAt(i-1) != ' ')
                cou += 1;

            if (s.charAt(i) != ' ' && (s.charAt(i-1)==' '))
                cou ++;

        }
        return cou;
    }
}
