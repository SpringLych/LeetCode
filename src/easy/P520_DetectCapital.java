package easy;

/**
 * @author SpringLych
 * @date 2018/10/10
 */
public class P520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        int cap = 0, noCap = 0;
        char[] chars = word.toCharArray();
        for(char a : chars){
            if(a-'A' >= 0 && a-'A'<26){
                // 统计大写字母数量
                cap ++;
            }else{
                // 统计小写
                noCap ++;
            }
        }
        if(cap == len || noCap == len) return true;
        if(cap == 1 && (word.charAt(0) - 'A'>=0 &&word.charAt(0) - 'A'<26)) return true;
        return false;
    }
}
