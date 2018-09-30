package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SpringLych
 * @date 2018/9/30
 */
public class P412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n;i++){
            if (i % 3 == 0 && i % 5== 0){
                list.add("FizzBuzz");
            }else if(i % 3== 0){
                list.add("Fizz");
            }else if (i % 5 == 0){
                list.add("Buzz");
            }else {
                list.add(i + "");
            }
        }
        return list;
    }
}
