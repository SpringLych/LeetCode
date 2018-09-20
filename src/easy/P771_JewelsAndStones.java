package easy;

/**
 * @author LiYingChun
 * @date 2018/9/20
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 */
public class P771_JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        char[] ss = S.toCharArray();
        for (char sss : ss){
            if (J.indexOf(sss) != -1){
                sum ++;
            }
        }
        return sum;
    }
}
