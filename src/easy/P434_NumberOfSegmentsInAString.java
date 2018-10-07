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
    public static int countSegments(String s) {
        /*int len = s.length();
        if (len == 0) return 0;
        int i = 0, count = 0, start = 0;
        int index = 0;
        while (index > -1){
            index = s.indexOf(' ', start);
            if (index > -1){
                System.out.println("index = " + index);
                if (index != len-1){
                    count ++;
                }
                start = index + 1;
            }
        }
        return count+1;*/

        char[] arr = s.toCharArray();
        int len = arr.length;
        if (len == 0) return 0;
        if (len == 1 && arr[0] != ' ') return 1;
        int start = 0, end = 0, count = 0;
        for (int i = 1; i < len; i++){
            if (i == 1 && arr[i-1] != ' '){
                start = i-1;
            }
            if (arr[i] !=' ' && arr[i-1]==' ' ){
                 start = i;
            }
            if (arr[i] == ' ' && arr[i-1]!= ' '){
                end = i;
            }
            if (i == len -1 && arr[i] != ' '){
                end = i;
            }
            if (end - start > 0){
                count ++;
                start = i;
                end = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "a, b, c                 ";
        int res = countSegments(str);
        System.out.println(res);
    }
}
