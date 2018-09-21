package easy;

import java.util.HashSet;

/**
 * @author LiYingChun
 * @date 2018/9/20
 */
public class P804_UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashSet = new HashSet<>();
        for (String word : words){
            String str = "";
            for (char ch : word.toCharArray()){
                str += morse[ch - 'a'];
            }
            System.out.println("str: "+ str);
            hashSet.add(str);
        }
        return hashSet.size();
    }

    /**
     * 使用StringBuild性能得到很大改善，因为每次改变String类型都是生成了新的对象，对运算速度影响大
     */
    public int uniqueMorseRepresentation2(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashSet = new HashSet<>();
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            char[] chs = word.toCharArray();
            for (char ch : chs){
                sb.append(morse[ch - 'a']);
            }
            hashSet.add(sb.toString());
        }
        return hashSet.size();
    }
}
